package kakao.aisp.javavaultconnecttest.model.DTO.response;

import kakao.aisp.javavaultconnecttest.model.DTO.VaultAuthDTO;
import kakao.aisp.javavaultconnecttest.model.DTO.VaultDataDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VaultResponseDTO {

    private String request_id;
    private String lease_id;
    private String renewable;
    private String lease_duration;
    private VaultDataDTO data;
    private VaultAuthDTO auth;

}
