package al.utile.professional.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Professional extends AuditEntity<String> {

    @Id
    private Long id;

    @Column(name = "description")
    private String description;


    @Column(name = "travel_distance")
    private Integer travelDistance;

    @ManyToMany
    @JoinTable(
            schema = "professional",
            name = "user_professions",
            joinColumns = @JoinColumn(name = "professional_id"),
            inverseJoinColumns = @JoinColumn(name = "profession_id")
    )
    private List<Profession> professions;

    /**
     * // TODO add work history for a professional
     * // TODO add skills (name, description ) -> possibility to choose from a set of predefined skills, or adding new custom skills
     * // TODO add ratings for a work finished
     * // TODO possibility to direct message him via whatsapp/DM
     */

    @Column(name = "fee")
    private Double fee;


}
