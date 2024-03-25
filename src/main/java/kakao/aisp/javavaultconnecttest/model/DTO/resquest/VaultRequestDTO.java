package kakao.aisp.javavaultconnecttest.model.DTO.resquest;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class VaultRequestDTO {

    private String role_id;
    private String secret_id;

}
