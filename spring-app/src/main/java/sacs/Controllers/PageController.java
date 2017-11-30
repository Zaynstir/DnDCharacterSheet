package sacs;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/page")
    public Person person(@RequestParam(value="name", defaultValue="no name given") String name) {
        // return "page";
        Person person1 = new Person(counter.incrementAndGet(),
                            String.format(template, name),
                            false);

        return person1;
    }

}
