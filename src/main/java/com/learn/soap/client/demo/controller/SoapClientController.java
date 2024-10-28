package com.learn.soap.client.demo.controller;

import com.learn.soap.client.demo.client.SoapClient;
import com.learn.soap.client.demo.wsdl.products.GetProductsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mohammed Abdu
 * @version vr0.1
 * @email eng.mo.abdu@gmail.com
 * @creationDate 28 Oct 2024
 */

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/products")
public class SoapClientController {

    private final SoapClient soapClient;

    @GetMapping
    public GetProductsResponse invokeSoapClientToAllProducts() {
        return soapClient.getAll();
    }
}
