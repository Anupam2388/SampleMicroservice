package inv;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class GreetingController {
@RequestMapping("/greeting")
public Greeting greeting() {
return new Greeting("Hello World");
}
}
