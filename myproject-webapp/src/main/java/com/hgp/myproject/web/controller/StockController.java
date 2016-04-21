package com.hgp.myproject.web.controller;

import com.hgp.myproject.core.domain.Products;
import com.hgp.myproject.core.domain.Stock;
import com.hgp.myproject.core.dto.StockDTO;
import com.hgp.myproject.core.service.ProductService;
import com.hgp.myproject.core.service.StockService;
import com.hgp.myproject.web.utils.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by pgsett on 03/03/2016.
 */
@Controller
@RequestMapping("/stock")
public class StockController {
    @Autowired
    StockService stockService;
    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView stock() {
        return new ModelAndView();
    }


    @RequestMapping(value = "/getStock", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getStock() {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            List<Stock> stocks = stockService.findAll();
            jsonResponse.setRows(stocks);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/getProducts", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getProducts() {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            List<Products> products = productService.findAll();
            jsonResponse.setRows(products);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }


    @RequestMapping(value = "/createNewStock", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse createNewStock(@RequestBody StockDTO stockDTO) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            Stock product = stockService._new(stockDTO);
            jsonResponse.setItem(product);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/updateStock", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse updateStock(@RequestBody StockDTO stockDTO) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            Stock product = stockService.update(stockDTO);
            jsonResponse.setItem(product);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/removeStock/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse removeStock(@PathVariable Long id) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            stockService.delete(id);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }
}
