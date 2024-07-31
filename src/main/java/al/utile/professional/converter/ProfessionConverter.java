package al.utile.professional.converter;

import al.utile.professional.dto.ProfessionDto;
import al.utile.professional.entity.Profession;
import org.springframework.stereotype.Component;

@Component
public class ProfessionConverter {

    public ProfessionDto toDto(Profession entity) {
        return new ProfessionDto(entity.getId(), entity.getName(), entity.getCategory(), entity.getStatus());
    }

    public Profession toEntity(ProfessionDto dto) {
        Profession entity = new Profession();
        entity.setId(dto.id());
        entity.setName(dto.name());
        entity.setCategory(dto.category());
        entity.setStatus(dto.status());
        return entity;
    }
}
