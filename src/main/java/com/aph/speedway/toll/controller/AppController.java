package com.aph.speedway.toll.controller;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import com.aph.speedway.toll.service.ParcoursService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    static Logger log = LoggerFactory.getLogger(AppController.class);

    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    private ParcoursService parcoursService;

    @Autowired
    public AppController(ParcoursService parcoursService) {
        this.parcoursService = parcoursService;
    }

    @PostConstruct
    public void init() {
        log.info("AppController.init");
    }
    
    @RequestMapping(value = { "/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {
 
        log.info("AppController.index");

        model.addAttribute("message", message);
 
        return "index";
    }
    
    @RequestMapping(value = { "/chercheParcours" }, method = RequestMethod.GET)
    public String personList(Model model) {
 
        log.info("AppController.personList");

        List<ParcoursDisplay> parcoursList = parcoursService.calculerParcours();

        model.addAttribute("parcours", parcoursList);
 
        return "parcoursList";
    }

    @RequestMapping(value = { "/addFilter" }, method = RequestMethod.GET)
    public String showFilterForm(Model model) {
 
        FilterForm filterForm = new FilterForm();
        model.addAttribute("filterForm", filterForm);
 
        return "addFilter";
    }
 
    @RequestMapping(value = { "/addFilter" }, method = RequestMethod.POST)
    public String applyFilter(Model model, @ModelAttribute("filterForm") FilterForm filterForm) {
 
        Integer parcours = filterForm.getParcours();
        Integer peages = filterForm.getPeages();
        Double prix  = filterForm.getPrix();
 
        if (parcours != null 
                && peages != null) {

            List<ParcoursDisplay> parcoursList = parcoursService.calculerParcours(parcours, peages, prix != null ? prix : 0);

            model.addAttribute("parcours", parcoursList);
             
            return "parcoursList";
        }
 
        model.addAttribute("errorMessage", errorMessage);

        return "addFilter";
    }

    @ExceptionHandler(BindException.class)
    public String errorFilter(Model model, Exception exception) {
        log.error("BindException", exception);

        FilterForm filterForm = new FilterForm();
        model.addAttribute("filterForm", filterForm);
        model.addAttribute("errorMessage", errorMessage);

        return "addFilter";
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        // If the exception is annotated with @ResponseStatus rethrow it and let
        // the framework handle it - like the OrderNotFoundException example
        // at the start of this post.
        // AnnotationUtils is a Spring Framework utility class.
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
            throw e;

        // Otherwise setup and send the user to a default error-view.
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
}
