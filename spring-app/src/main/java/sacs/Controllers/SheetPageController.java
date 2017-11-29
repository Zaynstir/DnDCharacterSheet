package sacs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/character-sheet")
public class SheetPageController {

    @ModelAttribute
    public String characterSheet(@RequestParam String someString, Model model) {
        // model.addAttribute("test", someString);
        model.addAttribute("test", someString);
        return "character-sheet"; // the name of the template
    }
}
