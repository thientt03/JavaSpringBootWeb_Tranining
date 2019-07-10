package hus.cisk62.demo.routers;

import hus.cisk62.demo.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    ApplicationService applicationService;
    @RequestMapping(path = "/")
    public String index(Model model) {
        model.addAttribute("applications", applicationService.findByElementID(1));
        return "index.html";
    }
}
