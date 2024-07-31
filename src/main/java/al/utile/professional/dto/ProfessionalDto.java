package al.utile.professional.dto;


import java.util.List;

public record ProfessionalDto(
        Long id,
        String description,
        Integer travelDistance,
        List<ProfessionDto> professions,
        Double fee
) {
}
