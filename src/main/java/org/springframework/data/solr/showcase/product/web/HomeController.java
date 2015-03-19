package org.springframework.data.solr.showcase.product.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
@Scope("prototype")
public class HomeController {
    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }

}