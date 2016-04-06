package com.hgp.myproject.web.controller;

import com.hgp.myproject.core.domain.Providers;
import com.hgp.myproject.core.dto.ProvidersDTO;
import com.hgp.myproject.core.service.ProviderService;
import com.hgp.myproject.web.utils.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by pgsett on 02/03/2016.
 */
@Controller
@RequestMapping("/proveedores")
public class ProveedoresController {

    @Autowired
    ProviderService providerService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView clientes() {
        ModelAndView page = new ModelAndView();
        return page;
    }

    @RequestMapping(value = "/getProviders", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getProviders() {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            List<Providers> providers = providerService.findAll();
            jsonResponse.setRows(providers);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/createNewProvider", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse createNewProvider(@RequestBody ProvidersDTO providersDTO) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            Providers provider = providerService._new(providersDTO);
            jsonResponse.setItem(provider);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/updateProvider", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse updateProvider(@RequestBody ProvidersDTO providersDTO) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            Providers provider = providerService.update(providersDTO);
            jsonResponse.setItem(provider);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/removeProvider/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse removeProvider(@PathVariable Long id) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            providerService.delete(id);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }
}
