package kakao.aisp.javavaultconnecttest.model.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VaultDataDTO {

    private Data data;
    private Metadata metadata;

    @Getter
    @Setter
    static class Data {
        private String age;
        private String name;
    }

    @Getter
    @Setter
    static class Metadata {
        private String created_time;
        private String custom_metadata;
        private String deletion_time;
        private String destroyed;
        private String version;
    }

}
