package al.utile.professional.service;

import al.utile.professional.converter.ProfessionalConverter;
import al.utile.professional.entity.Profession;
import al.utile.professional.entity.Professional;
import al.utile.professional.repository.ProfessionRepository;
import al.utile.professional.repository.ProfessionalRepository;
import al.utile.utile_common.utile.ProfessionalDto;
import jakarta.ws.rs.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalService {

    private final ProfessionalRepository professionalRepository;

    private final ProfessionalConverter professionalConverter;

    private final ProfessionRepository professionRepository;

    public ProfessionalService(ProfessionalRepository professionalRepository, ProfessionalConverter professionalConverter, ProfessionRepository professionRepository) {
        this.professionalRepository = professionalRepository;
        this.professionalConverter = professionalConverter;
        this.professionRepository = professionRepository;
    }


    public List<ProfessionalDto> getAllProfessionals() {
        return professionalRepository.findAll().stream()
                .map(professionalConverter::toDto)
                .toList();
    }

    public ProfessionalDto getProfessionalById(Long id) {
        return professionalRepository.findById(id)
                .map(professionalConverter::toDto)
                .orElseThrow(() -> new RuntimeException("Professional not found"));
    }

    public ProfessionalDto createProfessional(ProfessionalDto professionalDto) {
        Professional professional = professionalConverter.toEntity(professionalDto);
        professional = professionalRepository.save(professional);
        return professionalConverter.toDto(professional);
    }

    public ProfessionalDto updateProfessional(Long id, ProfessionalDto professionalDto) {
        // Fetch the existing entity
        Professional existingProfessional = professionalRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Professional not found with id " + id));

        // Update the fields
        existingProfessional.setDescription(professionalDto.description());
        existingProfessional.setTravelDistance(professionalDto.travelDistance());
        existingProfessional.setFee(professionalDto.fee());

        if (professionalDto.professions() != null) {
            List<Profession> professions = professionalDto.professions().stream()
                    .map(professionDto -> professionRepository.findById(professionDto.id())
                            .orElseThrow(() -> new NotFoundException("Profession not found with id " + professionDto.id())))
                    .toList();
            existingProfessional.setProfessions(professions);
        }

        // Save the updated entity
        Professional updatedProfessional = professionalRepository.save(existingProfessional);

        // Convert the updated entity back to a DTO
        return professionalConverter.toDto(updatedProfessional);
    }

    public void deleteProfessional(Long id) {
        professionalRepository.deleteById(id);
    }
}
