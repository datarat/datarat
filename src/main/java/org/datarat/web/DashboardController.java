package org.datarat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nauglrj1
 */
@Controller
public class DashboardController {
    
    @RequestMapping("/")
    public String root() {
        return "/dashboard";
    }
    
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
