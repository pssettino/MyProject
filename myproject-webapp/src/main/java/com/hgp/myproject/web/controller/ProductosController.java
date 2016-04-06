package com.hgp.myproject.web.controller;

import com.hgp.myproject.core.domain.Category;
import com.hgp.myproject.core.domain.Products;
import com.hgp.myproject.core.dto.ProductsDTO;
import com.hgp.myproject.core.service.CategoryService;
import com.hgp.myproject.core.service.ProductService;
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
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView productos() {
        return new ModelAndView();
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

    @RequestMapping(value = "/getCategories", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getCategories() {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            List<Category> categories = categoryService.findAll();
            jsonResponse.setRows(categories);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }


    @RequestMapping(value = "/createNewProduct", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse createNewProduct(@RequestBody ProductsDTO productsDTO) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            Products product = productService._new(productsDTO);
            jsonResponse.setItem(product);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse updateProduct(@RequestBody ProductsDTO productsDTO) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            Products product = productService.update(productsDTO);
            jsonResponse.setItem(product);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }

    @RequestMapping(value = "/removeProduct/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse removeProduct(@PathVariable Long id) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            productService.delete(id);
            jsonResponse.setSuccess(true);
        } catch (Exception ex) {
            jsonResponse.setSuccess(false);
        }
        return jsonResponse;
    }
}
