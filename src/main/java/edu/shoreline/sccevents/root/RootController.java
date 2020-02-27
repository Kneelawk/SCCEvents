package edu.shoreline.sccevents.root;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
