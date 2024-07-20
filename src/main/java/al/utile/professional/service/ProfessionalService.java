package al.utile.professional.service;

import al.utile.professional.converter.ProfessionalConverter;
import al.utile.professional.dto.ProfessionalDto;
import al.utile.professional.entity.Professional;
import al.utile.professional.repository.ProfessionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfessionalService {

    private final ProfessionalRepository professionalRepository;
    private final ProfessionalConverter professionalConverter;

    public ProfessionalService(ProfessionalRepository professionalRepository, ProfessionalConverter professionalConverter) {
        this.professionalRepository = professionalRepository;
        this.professionalConverter = professionalConverter;
    }

    public List<ProfessionalDto> getAllProfessionals() {
        return professionalRepository.findAll().stream()
                .map(professionalConverter::toDto)
                .collect(Collectors.toList());
    }

    public ProfessionalDto getProfessionalById(Long id) {
        return professionalRepository.findById(id)
                .map(professionalConverter::toDto)
                .orElseThrow(() -> new RuntimeException("Professional not found"));
    }

    public ProfessionalDto createProfessional(ProfessionalDto ProfessionalDto) {
        Professional professional = professionalConverter.toEntity(ProfessionalDto);
        professional = professionalRepository.save(professional);
        return professionalConverter.toDto(professional);
    }

    public ProfessionalDto updateProfessional(Long id, ProfessionalDto ProfessionalDto) {
        Professional professional = professionalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professional not found"));

        professional.setUserId(ProfessionalDto.userId());
        professional.setProfession(professional.getProfession());
        professional.setDescription(ProfessionalDto.description());
        professional.setReason(ProfessionalDto.reason());
        professional.setProfile(ProfessionalDto.profile());
        professional.setFee(ProfessionalDto.fee());

        professional = professionalRepository.save(professional);
        return professionalConverter.toDto(professional);
    }

    public void deleteProfessional(Long id) {
        professionalRepository.deleteById(id);
    }
}
