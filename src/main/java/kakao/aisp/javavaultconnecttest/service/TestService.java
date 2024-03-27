package kakao.aisp.javavaultconnecttest.service;

import kakao.aisp.javavaultconnecttest.model.DTO.response.VaultResponseDTO;

public interface TestService {

    VaultResponseDTO getAuthToken();

    VaultResponseDTO getSecretData();

}
