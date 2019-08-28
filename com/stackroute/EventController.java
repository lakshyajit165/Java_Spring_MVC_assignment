package com.stackroute;

import com.stackroute.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController {

    List<Event> eventList;
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){

        String title = request.getParameter("event-title");
        String city = request.getParameter("city");
        String price = request.getParameter("price");
        String type = request.getParameter("type");

        Event e = new Event(title, city, type, price);

        EventService es = new EventService();
        es.addEvent(e);

        this.eventList = es.getEvents();

        // testing stuff
//        List<String> test = new ArrayList<>();
//        test.add("a");
//        test.add("b");
//
//        List<Event> elist = new ArrayList<>();
//
//        Event e1 = new Event("title", "city", "type", "1");
//        Event e2 = new Event("title2", "city2", "type2", "2");
//
//        elist.add(e1);
//        elist.add(e2);
        //testing stuff ends

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", eventList);
        return mv;
    }

    @RequestMapping("/test")
    public ModelAndView gotoTest(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        return mv;
    }

    @RequestMapping("/list")
    public ModelAndView viewEventList(){
        EventService es = new EventService();

        this.eventList = es.getEvents();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        mv.addObject("result", eventList);
        return mv;
    }
}
