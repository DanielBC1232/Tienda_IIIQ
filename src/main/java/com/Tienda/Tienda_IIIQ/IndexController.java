
package com.Tienda.Tienda_IIIQ;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping("/Index")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "index";
    }
    
}
