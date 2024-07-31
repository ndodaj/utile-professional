package al.utile.professional.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class ProfessionalPK {
    private int userId;
    private int professionId;
}
