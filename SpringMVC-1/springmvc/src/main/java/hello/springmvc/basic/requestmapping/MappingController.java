package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {
    private Logger log = LoggerFactory.getLogger(getClass());

    /**
     * @RequestMapping : all request
     */
    @RequestMapping("/hello-basic")
//    @RequestMapping({ "/hello-basic", "/hello-go" }) can use array
    public String helloBasic() {
        log.info("helloBasic");
        return "ok";
    }

    /**
     * Allow only fixed Http method request
     */
    @RequestMapping(value = "/mapping-get-v1", method = RequestMethod.GET)
    public String mappingGetV1() {
        log.info("mappingGetV1");
        return "ok";
    }

    /**
     * @GetMapping
     * @PutMapping
     * @PatchMapping
     * @DeleteMapping
     */
    @GetMapping(value = "/mapping-get-v2")
    public String mappingGetV2() {
        log.info("mapping-get-v2");
        return "ok";
    }

    /**
     * Usage Of @PathVariable
     * If variable name is same, can be omitted
     * @PathVariable("userId") String userId -> @PathVariable String userId
     */
    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String data) { //-> @PathVariable String userId
        log.info("mappingPath userId={}", data);
        return "ok";
    }

    /**
     * @PathVariable Use multiple
     */
    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
        log.info("mappingPath userId={}, orderId={}", userId, orderId);
        return "ok";
    }

    /**
     * Additional Mapping through parameter
     * params="mode",
     * params="!mode"
     * params="mode=debug"
     * params="mode!=debug" (! = )
     * params = {"mode=debug","data=good"}
     */
    @GetMapping(value = "/mapping-param", params = "mode=debug")
    public String mappingParam() {
        log.info("mappingParam");
        return "ok";
    }

    /**
     * Additional mapping through specific headers
     * headers="mode",
     * headers="!mode"
     * headers="mode=debug"
     * headers="mode!=debug" (! = )
     */
    @GetMapping(value = "mapping-header", headers = "mode=debug")
    public String mappingHeader() {
        log.info("mappingHeader");
        return "ok";
    }

    /**
     * Additional Mapping Media Type based on Content-Type Header
     * consumes="application/json"
     * consumes="!application/json"
     * consumes="application/*"
     * consumes="*\/*"
     * MediaType.APPLICATION_JSON_VALUE
     */
    @PostMapping(value = "mapping-consume", consumes = "application/json")
    public String mappingConsume() {
        log.info("mappingConsumes");
        return "ok";
    }

    /**
     * Media Type based on Accept Header
     * produces = "text/html"
     * produces = "!text/html"
     * produces = "text/*"
     * produces = "*\/*"
     * Ex)
     * produces = "text/plain"
     * produces = {"text/plain", "application/*"}
     * produces = MediaType.TEXT_PLAIN_VALUE
     * produces = "text/plain;charset=UTF-8"
     */
    @PostMapping(value = "/mapping-produce", produces = "text/html")
    public String mappingProduces() {
        log.info("mappingProduces");
        return "ok";
    }


}