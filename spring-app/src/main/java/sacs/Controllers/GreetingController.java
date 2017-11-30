// package hello;
//
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
//
// @Controller
// public class GreetingController {
//
//     private String someData = "Hi THISIS DATA";
//
//     @RequestMapping("/greeting")
//     public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, String class, Model model) {
//         model.addAttribute("name", name);
//         model.addAttribute("class", "the class of the person");
//         return "greeting";
//     }
//
// }
