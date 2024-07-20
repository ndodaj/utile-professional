package al.utile.professional.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Professional extends AuditEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entryId")
    private Long entryId;

    @Column(nullable = false, name = "userId")
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "profession_id")
    private Profession profession;

    @Column(name = "description")
    private String description;

    @Column(name = "reason")
    private String reason;

    @Column(name = "profile")
    private String profile;

    @Column(name = "fee")
    private Double fee;

}
