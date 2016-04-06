package com.hgp.myproject.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by pgsett on 03/03/2016.
 */
@Controller
public class OrdenesDeCompraController {
    @RequestMapping(value = "/ordenesDeCompra", method = RequestMethod.GET)
    public ModelAndView ordenesDeCompra() {
        ModelAndView page = new ModelAndView();
        page.addObject("message", "hello");
        return page;
    }
}
