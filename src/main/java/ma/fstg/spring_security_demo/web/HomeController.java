package ma.fstg.spring_security_demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Page d'accueil accessible après connexion.";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "Espace utilisateur - accessible aux rôles USER et ADMIN.";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "Espace administrateur - réservé au rôle ADMIN.";
    }


}
