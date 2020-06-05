package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // Show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // Process the form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // New controller to read form data and add data to the model
    @RequestMapping("/processFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // Read the request param and convert data to upercase
        String theName = request.getParameter("studentName").toUpperCase();

        // create message
        String result = "Yo! " + theName + ", this is Spring Framework dude!";

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    // New controller to read form data and add data to the model
    @RequestMapping("/processFormV3")
    public String processFromVersionThree(@RequestParam("studentName") String name, Model model) {

        // create message
        String result = "Hello my friend " + name.toUpperCase() + ", this is the version 3!";

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
