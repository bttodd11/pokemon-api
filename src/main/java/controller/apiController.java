package controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class apiController {

    @RequestMapping("/")
    public String hello()
    {
        return "Hello User";
    }

}
