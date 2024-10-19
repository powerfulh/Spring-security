package toy.powerfulh.spring_secu.user.dto;

import lombok.Builder;
import lombok.Getter;
import toy.powerfulh.spring_secu.core.base.BaseResDto;

@Getter
@Builder
public class TokenResDto extends BaseResDto {
    String token;
}
