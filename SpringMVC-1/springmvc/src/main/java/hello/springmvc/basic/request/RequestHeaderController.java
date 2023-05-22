package hello.springmvc.basic.request;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@Slf4j
@RestController
public class RequestHeaderController {
    @RequestMapping("/headers")
    public String headers(HttpServletRequest request,
                          HttpServletResponse response,
                          HttpMethod httpMethod,
                          Locale locale,
                          @RequestHeader MultiValueMap<String, String> headerMap,
                          @RequestHeader("host") String host,
                          @CookieValue(value = "myCookie", required = false) String cookie) {
        log.info("request={}", request);
        log.info("response={}", response);
        log.info("httpMethod={}", httpMethod);
        log.info("locale={}", locale);
        log.info("headerMap={}", headerMap);
        log.info("header host={}", host);
        log.info("myCookie={}", cookie);
        return "ok";
    }
}
/**
 * HttpServletRequest / HttpServletResponse
 * HttpMethod: select Http method ex) get, post, put, delete ....
 * Locale: select locale information ex) en_US, ko_KR
 * @RequestHeader MultiValueMap<String, String> headerMap: select all Http Header with type of MultiValueMap
 * @RequestHeader("host") String host: select header with name (attribute: required, defaultValue)
 * @CookieValue(value = "myCookie", required = false) String cookie: select cookie with name (attribute: required, defaultValue)
 *
 * MultiValueMap: Similarly Map, but can have several value per one key ex) parameter: key1=value1&kye1=value2
 * @Slf4j : create automatically this code - private static final Logger log = LoggerFactory.getLogger(RequestHeaderController.class);
 */