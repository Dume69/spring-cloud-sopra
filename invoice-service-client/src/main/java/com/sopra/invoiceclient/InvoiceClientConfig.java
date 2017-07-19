package com.sopra.invoiceclient;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class InvoiceClientConfig {

    @Bean
    @ConditionalOnProperty(name = "invoice.service.mock", havingValue = "false", matchIfMissing = false)
    public InvoiceClient invoiceClient(RestTemplate restTemplate) {
        return new InvoiceClient(restTemplate, "");
    }

    @Bean
    @ConditionalOnProperty(name = "invoice.service.mock", havingValue = "true", matchIfMissing = false)
    public InvoiceClientMock invoiceClientMock() {
        return new InvoiceClientMock();
    }

    @Bean
    @ConditionalOnMissingBean(RestTemplate.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
