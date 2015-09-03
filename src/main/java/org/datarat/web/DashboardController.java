package org.datarat.web;

import org.datarat.domain.Dashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nauglrj1
 */
@RestController
public class DashboardController {
    
    @RequestMapping("/")
    public Dashboard root() {
        return dashboard();
    }
    
    @RequestMapping("/dashboard")
    public Dashboard dashboard() {
        return new Dashboard();
    }
}
