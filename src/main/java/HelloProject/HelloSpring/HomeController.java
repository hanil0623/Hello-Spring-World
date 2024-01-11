package HelloProject.HelloSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
public class HomeController {

    @GetMapping(value = "/")
    public HashMap<String, String> test(){
        HashMap<String, String> test = new HashMap<String, String>();
        test.put("project_version", "2.5.5");
        test.put("java_version", "11");

        return test;
    }
}
