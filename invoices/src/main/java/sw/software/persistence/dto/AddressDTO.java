package sw.software.persistence.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AddressDTO {

    private String street;
    private String zip_code;
    private String city;
    private String uf;
    private String idIntervener;
}
