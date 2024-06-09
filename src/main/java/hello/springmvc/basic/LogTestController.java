package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    
    // @Slf4j 사용시 생략
    // private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace(" trace my log="+ name);  // 의미없는 연산이 실행되버림, 사용 x

        log.trace("trace log={}", name);    // 가장 상세한 로그 레벨
        log.debug("debug log={}", name);    // 개발단계
        log.info(" info log={}", name);     // 중요정보
        log.warn(" warn log={}", name);     // 경고
        log.error("error log={}", name);    // 에러

        return "ok";
    }

}
