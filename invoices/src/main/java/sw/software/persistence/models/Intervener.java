package sw.software.persistence.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ITVT_DPCT_ESL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Intervener extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_ITVT_DPCT_ESL")
    private Long id;

    @Column(name = "CD_IDFR_PCT_DRGD")
    private String directedParticipantCode;

    @Column(name = "CD_IDFR_ITVT_ESC")
    private String idExterno;

    @Column(name = "CD_TIP_PTE_ITSO")
    @Enumerated(EnumType.ORDINAL)
    private StakeholderType stakeholderType;

    @Column(name = "CD_CPF_CNPJ_ITVT")
    private String cpfCnpj;

    @Column(name = "NM_ITVT_DPCT_ESL")
    private String name;

    @Column(name = "NR_IE_ITVT")
    private Integer stateRegistration;

    @OneToOne(mappedBy = "interveniente")
    private Payee payee;

}
