package sw.software.persistence.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SACR_DPCT_ESL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payee extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CD_IDFC_SACR")
    private String idExterno;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NR_IDFR_SACR", referencedColumnName = "CD_ITVT_DPCT_ESL")
    private Intervener intervener;
}
