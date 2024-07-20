package al.utile.professional.service;

import al.utile.professional.converter.ProfessionConverter;
import al.utile.professional.dto.ProfessionDto;
import al.utile.professional.entity.Profession;
import al.utile.professional.repository.ProfessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
                .collect(Collectors.toList());
    }

    public ProfessionDto getProfessionById(Long id) {
        return professionRepository.findById(id)
                .map(professionConverter::toDto)
                .orElseThrow(() -> new RuntimeException("Profession not found"));
    }

    public ProfessionDto createProfession(ProfessionDto ProfessionDto) {
        Profession profession = professionConverter.toEntity(ProfessionDto);
        profession = professionRepository.save(profession);
        return professionConverter.toDto(profession);
    }

    public ProfessionDto updateProfession(Long id, ProfessionDto ProfessionDto) {
        Profession profession = professionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profession not found"));

        profession.setName(ProfessionDto.name());
        profession.setCategory(ProfessionDto.category());
        profession.setStatus(ProfessionDto.status());

        profession = professionRepository.save(profession);
        return professionConverter.toDto(profession);
    }

    public void deleteProfession(Long id) {
        professionRepository.deleteById(id);
    }
}