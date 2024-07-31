package al.utile.professional.dto;

import al.utile.utile_common.utile.StatusEnum;

public record ProfessionDto(
        Long id,
        String name,
        String category,
        StatusEnum status) {
}
