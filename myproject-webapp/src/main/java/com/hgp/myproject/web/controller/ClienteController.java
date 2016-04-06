package com.hgp.myproject.web.controller;

import com.hgp.myproject.core.domain.Customers;
import com.hgp.myproject.core.dto.CustomersDTO;
import com.hgp.myproject.core.service.CustomerService;
import com.hgp.myproject.core.service.UserService;
import com.hgp.myproject.web.utils.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by pgsett on 01/03/2016.
 */
@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    CustomerService customerService;

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView clientes() {
        ModelAndView page = new ModelAndView();
        return page;
    }

    @RequestMapping(value = "/getCustomers", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getCustomers() {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            List<Customers> customers = customerService.findAll();
            jsonResponse.setRows(customers);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/createNewCustomer", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse createNewCustomer(@RequestBody CustomersDTO customersDTO) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            Customers customer = customerService._new(customersDTO);
            jsonResponse.setItem(customer);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse updateCustomer(@RequestBody CustomersDTO customersDTO) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            Customers customer = customerService.update(customersDTO);
            jsonResponse.setItem(customer);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/removeCustomer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse removeCustomer(@PathVariable Long id) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            customerService.delete(id);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

}
