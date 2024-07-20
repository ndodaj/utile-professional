package al.utile.professional.converter;

import al.utile.professional.dto.ProfessionalDto;
import al.utile.professional.entity.Professional;
import al.utile.professional.repository.ProfessionRepository;
import org.springframework.stereotype.Component;

@Component
public class ProfessionalConverter {

    private final ProfessionRepository professionRepository;

    public ProfessionalConverter(ProfessionRepository professionRepository) {
        this.professionRepository = professionRepository;
    }

    public ProfessionalDto toDto(Professional entity) {
        return new ProfessionalDto(
                entity.getEntryId(), entity.getUserId(), entity.getProfession().getId(), entity.getDescription(), entity.getReason(), entity.getProfile(), entity.getFee()
        );
    }

    public Professional toEntity(ProfessionalDto dto) {
        Professional entity = new Professional();
        entity.setEntryId(dto.entryId());
        entity.setUserId(dto.userId());
        entity.setProfession(professionRepository.findById(dto.professionId()).orElse(null));
        entity.setDescription(dto.description());
        entity.setReason(dto.reason());
        entity.setProfile(dto.profile());
        entity.setFee(dto.fee());
        return entity;
    }
}
