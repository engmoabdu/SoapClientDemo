package com.learn.soap.client.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * @author Mohammed Abdu
 * @version vr0.1
 * @email eng.mo.abdu@gmail.com
 * @creationDate 28 Oct 2024
 */
@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.learn.soap.client.demo.wsdl.products");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate() {
        return new WebServiceTemplate(marshaller());
    }
}
