package danielkaiser.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    Logger logger = LoggerFactory.getLogger(HtmlController.class);

    @RequestMapping("/{page:^(?!.*[.].*$).*$}")
    public String requestPage(@PathVariable("page") String page) {
        String htmlPage = "/%s.html".formatted(page);
        logger.info("forwarding request to {}", htmlPage);
        return htmlPage;
    }
}

