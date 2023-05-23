package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {
    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");
        return mav;
    }

    /**
     * ViewResolver searches View of 'response/hello' and render it.
     */
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!!");
        return "response/hello";
    }

    /**
     * If return type is void, request url is used as viewName.
     * ex) url: response/hello -> run: templates/response/hello.html
     */
    @RequestMapping("/response/hello")
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hello!!!");
    }

    /**
     * Default Setting Value
     * If necessary, you can change.
     * spring.thymeleaf.prefix=classpath:/templates/
     * spring.thymeleaf.suffix=.html
     */
}
