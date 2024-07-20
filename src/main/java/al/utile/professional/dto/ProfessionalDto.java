package al.utile.professional.dto;

public record ProfessionalDto(
        Long entryId,
        Long userId,
        Long professionId,
        String description,
        String reason,
        String profile,
        Double fee) {
}
