package kakao.aisp.javavaultconnecttest.serviceClient;

import kakao.aisp.javavaultconnecttest.model.resquest.VaultRequestDTO;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VaultFeignClientTest {

    String roleId = "f0f37297-5120-e0e3-ebe3-d3bc738d31e9";
    String secretId = "ce508976-90fc-07e1-310c-2d22eea65697";

    private VaultFeignClient vaultFeignClient;

    public void test() {

        String roleId = "f0f37297-5120-e0e3-ebe3-d3bc738d31e9";
        String secretId = "ce508976-90fc-07e1-310c-2d22eea65697";

        VaultRequestDTO vaultRequestDTO = VaultRequestDTO.builder()
                .role_id(roleId)
                .secret_id(secretId)
                .build();

        Object authToken = vaultFeignClient.getAuthToken(vaultRequestDTO);

        authToken.toString();

    }

}