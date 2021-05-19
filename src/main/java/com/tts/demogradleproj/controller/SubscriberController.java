package com.tts.demogradleproj.controller;

import com.tts.demogradleproj.model.Subscriber;
import com.tts.demogradleproj.repository.SubscriberRepository;
import com.tts.demogradleproj.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.PresentationDirection;
import java.util.List;

@Controller
public class SubscriberController {

    @Autowired
    private  SubscriberRepository subscriberRepository;
    private SubscriberService subscriberService;




    //    the @GetMapping annotation  This annotation will be used for our index method,
//which will return the template specified - a template called "index" in the subscriber template directory
//
    @GetMapping(value = "/")
    public String index(Subscriber subscriber, Model model) {
        List<Subscriber> subscribers      = subscriberRepository.findAll();
        model.addAttribute("subscribers", subscribers) ;


        return "subscriber/index";
    }
    @GetMapping(value = "/About")
    public String About() {
        return "subscriber/About";
    }







    @PostMapping(value = "/")
    public String addNewSubscriber(Subscriber subscriber, Model model) {
        subscriberRepository.save(new Subscriber(
                subscriber.getFirstName(),
                subscriber.getLastName(),
                subscriber.getGender(),
                subscriber.getCity(),
                subscriber.getState(),
                subscriber.getUserName(),
                subscriber.getSignedUp()
        ));


        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("lastName", subscriber.getLastName());
        model.addAttribute("userName", subscriber.getUserName());
        model.addAttribute("Gender", subscriber.getGender());
        model.addAttribute("City", subscriber.getCity());
        model.addAttribute("State", subscriber.getState());
        return "redirect:/";//go to main page

    }
}

