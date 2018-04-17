package me.afua.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
    @Autowired
    CarRepository carRepo;

    @RequestMapping("/add")
    public String addCar(Model model)
    {
        model.addAttribute("aCar",new Car());
        return "addcar";
    }

    @RequestMapping("/savecar")
    public String saveCar(@ModelAttribute("aCar") Car theCar)
    {
        carRepo.save(theCar);
        return "redirect:/";
    }

    @RequestMapping("/")
    public String showCars(Model model)
    {

        model.addAttribute("cars",carRepo.findAll());
     return "index";
    }


}
