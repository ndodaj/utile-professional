package al.utile.professional.converter;

import al.utile.professional.entity.Profession;
import al.utile.professional.entity.Professional;
import al.utile.utile_common.utile.ProfessionDto;
import al.utile.utile_common.utile.ProfessionalDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProfessionalConverter {

    public ProfessionalDto toDto(Professional entity) {
        if (entity == null) {
            return null;
        }

        List<ProfessionDto> professionDtos = entity.getProfessions() != null ?
                entity.getProfessions().stream()
                        .map(this::toProfessionDto)
                        .toList() : null;

        return new ProfessionalDto(
                entity.getId(),
                entity.getDescription(),
                entity.getTravelDistance(),
                professionDtos,
                entity.getFee()
        );
    }



    public Professional toEntity(ProfessionalDto dto) {
        if (dto == null) {
            return null;
        }

        List<Profession> professions = dto.professions() != null ?
                dto.professions().stream()
                        .map(this::toProfessionEntity)
                        .toList() : null;

        Professional entity = new Professional();
        entity.setId(dto.id());
        entity.setDescription(dto.description());
        entity.setTravelDistance(dto.travelDistance());
        entity.setProfessions(professions);
        entity.setFee(dto.fee());

        return entity;
    }

    private ProfessionDto toProfessionDto(Profession profession) {
        if (profession == null) {
            return null;
        }

        return new ProfessionDto(
                profession.getId(),
                profession.getName(),
                profession.getCategory(),
                profession.getStatus()
        );
    }

    private Profession toProfessionEntity(ProfessionDto dto) {
        if (dto == null) {
            return null;
        }

        Profession entity = new Profession();
        entity.setId(dto.id());
        entity.setName(dto.name());
        entity.setCategory(dto.category());
        entity.setStatus(dto.status());

        return entity;
    }
}
