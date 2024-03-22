package kakao.aisp.javavaultconnecttest;

import kakao.aisp.javavaultconnecttest.model.resquest.VaultRequestDTO;
import kakao.aisp.javavaultconnecttest.serviceClient.VaultFeignClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
public class testController {

    private VaultFeignClient vaultFeignClient;

    @Value("${spring.cloud.app-role.role-id}")
    private String roleId;

    @Value("${spring.cloud.app-role.role-id}")
    private String secretId;

    @GetMapping
    public void test() {

        VaultRequestDTO vaultRequestDTO = VaultRequestDTO.builder()
                .role_id(roleId)
                .secret_id(secretId)
                .build();

        Object authToken = vaultFeignClient.getAuthToken(vaultRequestDTO);

        authToken.toString();

    }

}
