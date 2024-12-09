package sw.software.persistence.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sw.software.persistence.models.Payee;
import sw.software.persistence.models.StakeholderType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntervenerDTO {

    private Long id;
    private String directedParticipantCode;
    private String idExterno;
    private StakeholderType stakeholderType;
    private String cpfCnpj;
    private String name;
    private Integer stateRegistration;
}
