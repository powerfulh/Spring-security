package toy.powerfulh.spring_secu.core.advice;

import lombok.AllArgsConstructor;
import toy.powerfulh.spring_secu.core.base.BaseResDto;
import toy.powerfulh.spring_secu.core.code.ErrorCode;

@AllArgsConstructor
public class BaseException extends RuntimeException{
    ErrorCode errorCode;

    BaseResDto getErrorRes() {
        BaseResDto baseResDto = new BaseResDto();
        baseResDto.setErrorCode(errorCode);
        return baseResDto;
    }
}
