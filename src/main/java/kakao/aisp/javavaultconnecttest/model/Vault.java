package kakao.aisp.javavaultconnecttest.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Vault {

    private String dbUser;
    private String dbPassword;
    private String redisPassword;

}
