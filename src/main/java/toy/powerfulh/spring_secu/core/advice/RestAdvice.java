package toy.powerfulh.spring_secu.core.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import toy.powerfulh.spring_secu.core.base.BaseResDto;

@RestControllerAdvice
public class RestAdvice {
    @ExceptionHandler(BaseException.class)
    public BaseResDto baseHandle(BaseException exception) {
        return exception.getErrorRes();
    }
}
