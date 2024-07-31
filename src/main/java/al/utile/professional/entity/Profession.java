package al.utile.professional.entity;

import al.utile.utile_common.utile.StatusEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "profession", schema = "professional")
public class Profession extends AuditEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @NotBlank
    @Size(min = 5, max = 100)
    @Column(unique = true, nullable = false, name = "name")
    private String name;

    @NotBlank
    @Column(name = "category", unique = true, nullable = false)
    private String category;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusEnum status;

}
