package ee.bcs.valiit.testkantroll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testkantroll {

    @GetMapping ("test/{Linda}")
    public String getHelloWorld(@PathVariable("Linda")String userName, @RequestParam("Ajaots")String lastName){
        return "Hello " + userName + " " + lastName;
    }
}
