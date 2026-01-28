package bookstore.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @GetMapping("/index")
    public @ResponseBody String showIndex() {
        return "Hello world!";
    }

}
