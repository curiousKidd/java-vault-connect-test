package kakao.aisp.javavaultconnecttest.serviceClient;

import kakao.aisp.javavaultconnecttest.model.DTO.response.VaultResponseDTO;
import kakao.aisp.javavaultconnecttest.model.DTO.resquest.VaultRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "vault", url = "http://localhost:8200/v1")
public interface VaultFeignClient {

    @PostMapping(path = "/auth/approle/login", produces = "application/json")
    VaultResponseDTO getAuthToken(@RequestBody VaultRequestDTO dto);

    @GetMapping(path = "secret/data/secret_test", produces = "application/json")
    VaultResponseDTO getSecretData(@RequestHeader("X-Vault-Token") String token);

}
