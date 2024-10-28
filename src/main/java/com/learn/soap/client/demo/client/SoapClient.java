package com.learn.soap.client.demo.client;

import com.learn.soap.client.demo.wsdl.products.GetProductsRequest;
import com.learn.soap.client.demo.wsdl.products.GetProductsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * @author Mohammed Abdu
 * @version vr0.1
 * @email eng.mo.abdu@gmail.com
 * @creationDate 28 Oct 2024
 */

@Service
@RequiredArgsConstructor
public class SoapClient {

    private final WebServiceTemplate webServiceTemplate;

    public GetProductsResponse getAll() {
        return (GetProductsResponse) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws", new GetProductsRequest());
    }
}
