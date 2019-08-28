package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class RootController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView root() {
        String type[] = new String[]{"Cricket", "Badminton", "Football"};
        List<String> eventType = new ArrayList<>(Arrays.asList(type));

        String test = "test";
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("types", eventType);
        return mv;
    }
}
