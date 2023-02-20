package com.sendmail.controller;

import com.sendmail.bean.SingUpBean;
import com.sendmail.entity.SingUpEnitity;
import com.sendmail.repository.SingUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SingUpController {
    @Autowired
    private SingUpRepository singUpRepository;

    @GetMapping("/register")
    public String registerForm(@ModelAttribute("user")SingUpBean accBean) {
        return "register";
    }


    @PostMapping("/register")
    public String registerSubmit(Model model,@ModelAttribute("user") SingUpBean accBean) {
        SingUpEnitity accEntity = new SingUpEnitity();
        if (singUpRepository.findByEmail(accBean.getEmail())==null){
            accEntity.setUsername(accBean.getUsername());
            accEntity.setPassword(accBean.getPassword());
            accEntity.setEmail(accBean.getEmail());
            accEntity.setActivated(1);
            accEntity.setAdmin(0);
            accEntity.setFullname("user");
            accEntity.setPhoto("user");
            singUpRepository.save(accEntity);
            return "login";
        }else {
            model.addAttribute("message","Đã tồn tại Gamil");
        }
        return "register";
    }
}
