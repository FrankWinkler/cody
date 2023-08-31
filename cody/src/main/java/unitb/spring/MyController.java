package unitb.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String index() {
        return "Hello Copilot User";
    }

    @GetMapping("/resource/{date}")
    public @ResponseBody byte[] getData(@PathVariable String date){
        return myService.getFile(date);

    }
}