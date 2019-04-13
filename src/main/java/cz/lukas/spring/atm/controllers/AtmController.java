package cz.lukas.spring.atm.controllers;

import cz.lukas.spring.atm.services.CommunicationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AtmController {

    private CommunicationService communicationService;

    public AtmController(CommunicationService communicationService) {
        this.communicationService = communicationService;
    }

    @RequestMapping("/*")
    public String getWelcomePage(Model model) {
        model.addAttribute("welcomeText", communicationService.getPozdrav());
        return "welcome";
    }
}
