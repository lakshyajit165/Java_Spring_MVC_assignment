package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class EventController {

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){

        String title = request.getParameter("event-title");
        String city = request.getParameter("city");
        String price = request.getParameter("price");
        String type = request.getParameter("type");

        String result = title + " " + city + " " + price + " " + type;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", result);
        return mv;
    }
}
