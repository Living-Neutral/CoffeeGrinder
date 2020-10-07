package com.NuclearNode.CoffeeGrinder;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    private StarBucksDrinkRepo drinkRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewOrder(@RequestParam String name, @RequestParam String description,
                                            @RequestParam String type, @RequestParam float sugar_content,
                                            @RequestParam String category, @RequestParam float serving_size,
                                            @RequestParam float relative_sugar, @RequestParam boolean dairy,
                                            @RequestParam boolean tree_nuts, @RequestParam boolean espresso,
                                            @RequestParam boolean wheat, @RequestParam boolean sweetness,
                                            @RequestParam boolean fruity, @RequestParam boolean soy) {

        StarbucksDrink order = new StarbucksDrink();

        order.setName(name);
        order.setCategory(category);
        order.setDairy(dairy);
        order.setDescription(description);
        order.setEspresso(espresso);
        order.setType(type);
        order.setSugar_content(sugar_content);
        order.setServing_size(serving_size);
        order.setRelative_sugar(relative_sugar);
        order.setTree_nuts(tree_nuts);
        order.setWheat(wheat);
        order.setSweetness(sweetness);
        order.setFruity(fruity);
        order.setSoy(soy);
        drinkRepository.save(order);

        return "Saved.";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<StarbucksDrink> getAllDrinks(){
        return drinkRepository.findAll();
    }

}
