package nhs.gp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class CrmController {

    private final GpRepository gpRepository;

    @RequestMapping
    public String home() {
        return "home";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) throws Exception {
        request.logout();
        return "redirect:/";
    }

    @RequestMapping("/gps")
    public String gps(Model model) {
        model.addAttribute(gpRepository.findAll());
        return "gps";
    }

    @RequestMapping("/gps/{id}")
    public String gp(@PathVariable("id") Long id, Model model) {
        model.addAttribute(gpRepository.findOne(id));
        return "gp";
    }

}
