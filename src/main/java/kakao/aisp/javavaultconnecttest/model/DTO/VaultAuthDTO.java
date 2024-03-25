package kakao.aisp.javavaultconnecttest.model.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class VaultAuthDTO {
    private String client_token;
    private String accessor;
    private List<String> policies;
    private Metadata metadata;
    private String leaseDuration;
    private String renewable;
    private String entity_id;

    @Getter
    @Setter
    public class Metadata {
        private String approle_id;
        private String approle_no;
        private String roleName;
        private String secret_id_name;
    }
}
