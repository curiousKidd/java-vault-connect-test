package kakao.aisp.javavaultconnecttest;

import kakao.aisp.javavaultconnecttest.model.resquest.VaultRequestDTO;
import kakao.aisp.javavaultconnecttest.serviceClient.VaultFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class testController {

    private final VaultFeignClient vaultFeignClient;

    @Value("${spring.cloud.vault.app-role.role-id}")
    private String roleId;

    @Value("${spring.cloud.vault.app-role.secret-id}")
    private String secretId;

    @GetMapping("/token")
    public void test() {

        VaultRequestDTO vaultRequestDTO = VaultRequestDTO.builder()
                .role_id(roleId)
                .secret_id(secretId)
                .build();

        Object authToken = vaultFeignClient.getAuthToken(vaultRequestDTO);

        authToken.toString();

    }

}
