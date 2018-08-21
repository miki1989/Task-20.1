package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class HomeController {
    private AnnouncementRepository announcementRepository;

    public HomeController(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    @GetMapping("/")
    public String home(Model model){
        List<Vehicle>vehicles = announcementRepository.getVehicles();
        model.addAttribute("allAnnoucements", vehicles);
        model.addAttribute("newAnnoucement", new Vehicle());
        return "home";
    }
}
