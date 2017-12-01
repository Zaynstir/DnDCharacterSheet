package sacs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ExportPageController {

    @ModelAttribute
    public Person makePerson(){
        Person person = new Person(0, "Tim", false);
        return person;
    }

    @RequestMapping("/export-page")
    public String characterSheet(Model model) {
        Person p = makePerson();
        model.addAttribute("test", p.getName());
        return "export-page"; // the name of the template
    }
}
