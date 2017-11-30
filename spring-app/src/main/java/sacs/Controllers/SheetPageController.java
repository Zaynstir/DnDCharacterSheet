package sacs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SheetPageController {

    @ModelAttribute
    public Person makePerson(){
        Person person = new Person(0, "Tim", false);
        return person;
    }

    @RequestMapping("/character-sheet")
    public String characterSheet(Model model) {
        Person p = makePerson();
        model.addAttribute("test", p.getName());
        return "character-sheet"; // the name of the template
    }
}
