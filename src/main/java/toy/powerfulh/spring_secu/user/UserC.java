package toy.powerfulh.spring_secu.user;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toy.powerfulh.spring_secu.core.advice.BaseException;
import toy.powerfulh.spring_secu.core.base.BaseC;
import toy.powerfulh.spring_secu.core.code.ErrorCode;
import toy.powerfulh.spring_secu.user.dto.LoginDto;
import toy.powerfulh.spring_secu.user.dto.TokenResDto;

@RestController
@RequestMapping("user")
public class UserC extends BaseC {
    @GetMapping("token")
    public TokenResDto getToken(@Valid LoginDto loginDto) {
        if("admin".equals(loginDto.getId())) return TokenResDto.builder().token("ok").build();
        throw new BaseException(ErrorCode.invalidLogin);
    }
}
