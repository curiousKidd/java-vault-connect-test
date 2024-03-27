package kakao.aisp.javavaultconnecttest.controller;

import kakao.aisp.javavaultconnecttest.model.DTO.response.VaultResponseDTO;
import kakao.aisp.javavaultconnecttest.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/token")
    public HttpEntity<VaultResponseDTO> getAuthToken() {
        VaultResponseDTO authToken = testService.getAuthToken();

        return ResponseEntity.ok().body(authToken);

    }

    @GetMapping("/data")
    public HttpEntity<VaultResponseDTO> getSecretData() {
        VaultResponseDTO secretData = testService.getSecretData();

        return ResponseEntity.ok().body(secretData);

    }

}
