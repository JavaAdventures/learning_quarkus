package sw.software.persistence.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayeeDTO {

    private AddressDTO address;
    private IntervenerDTO intervener;
}
