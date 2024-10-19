package toy.powerfulh.spring_secu.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import toy.powerfulh.spring_secu.core.base.BaseReqDto;

@Getter
@Builder
public class LoginDto extends BaseReqDto {
    @NotBlank
    String id;
    @NotBlank
    String pw;
}
