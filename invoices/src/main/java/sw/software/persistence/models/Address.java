package sw.software.persistence.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "END_ITVT_DPCT_ESL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NR_IDFR_END_ITVT")
    private Long id;

    @Column(name = "NM_LGR_ITVT")
    private String street;

    @Column(name = "CD_CEP_ITVT")
    private String zip_code;

    @Column(name = "NM_CID_ITVT")
    private String city;

    @Column(name = "CD_UF_ITVT")
    private String uf;

    @Column(name = "CD_ITVT_DPCT_ESL")
    private String idIntervener;
}
