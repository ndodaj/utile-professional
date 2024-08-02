package al.utile.professional.service;

import al.utile.professional.converter.ProfessionConverter;
import al.utile.professional.entity.Profession;
import al.utile.professional.repository.ProfessionRepository;
import al.utile.utile_common.utile.dto.ProfessionDto;
import jakarta.ws.rs.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionService {

    private final ProfessionRepository professionRepository;
    private final ProfessionConverter professionConverter;

    public ProfessionService(ProfessionRepository professionRepository, ProfessionConverter professionConverter) {
        this.professionRepository = professionRepository;
        this.professionConverter = professionConverter;
    }

    public List<ProfessionDto> getAllProfessions() {
        return professionRepository.findAll().stream()
                .map(professionConverter::toDto)
                .toList();
    }

    public ProfessionDto getProfessionById(Long id) {
        return professionRepository.findById(id)
                .map(professionConverter::toDto)
                .orElseThrow(() -> new NotFoundException("Profession not found"));
    }

    public ProfessionDto createProfession(ProfessionDto professionDto) {
        Profession profession = professionConverter.toEntity(professionDto);
        profession = professionRepository.save(profession);
        return professionConverter.toDto(profession);
    }

    public ProfessionDto updateProfession(Long id, ProfessionDto professionDto) {
        Profession profession = professionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profession not found"));

        profession.setName(professionDto.name());
        profession.setCategory(professionDto.category());
        profession.setStatus(professionDto.status());

        profession = professionRepository.save(profession);
        return professionConverter.toDto(profession);
    }

    public void deleteProfession(Long id) {
        professionRepository.deleteById(id);
    }
}