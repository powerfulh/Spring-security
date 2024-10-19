package toy.powerfulh.spring_secu.core.base;

import lombok.Getter;
import lombok.Setter;
import toy.powerfulh.spring_secu.core.code.ErrorCode;

@Getter
@Setter
public class BaseResDto extends BaseDto{
     ErrorCode errorCode; // 널이면 정상
}
