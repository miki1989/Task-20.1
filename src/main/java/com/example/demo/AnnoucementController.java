package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnnoucementController {
    private AnnouncementRepository announcementRepository;

    public AnnoucementController(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    @GetMapping("/vehicle")
    public String vehicle(Model model, @RequestParam String name){
        Vehicle vehicle = announcementRepository.findByName(name);
        model.addAttribute("vehicle", vehicle);
        return "vehicle";
    }

    @PostMapping("/addVehicle")
    public String addVehicle(Vehicle vehicle){
        announcementRepository.add(vehicle);
        return "redirect:/";
    }
}
