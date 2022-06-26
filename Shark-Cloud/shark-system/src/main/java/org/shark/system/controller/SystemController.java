package org.shark.system.controller;


import org.springframework.web.bind.annotation.*;

/**
 * @author Acer
 */
@RestController
@RequestMapping("/system")
public class SystemController {

    @GetMapping("/say")
    public String say(@RequestParam("para") String para){
        return "Hi"+para;
    }

}
