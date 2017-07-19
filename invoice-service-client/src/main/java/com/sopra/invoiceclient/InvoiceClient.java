package com.sopra.invoiceclient;

import com.sopra.invoiceclient.model.Invoice;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

public class InvoiceClient implements ServiceClient {

    private RestTemplate restTemplate;
    private String url;

    public InvoiceClient(RestTemplate restTemplate, String url) {
        this.restTemplate = restTemplate;
        this.url = url;
    }

    @Override
    public void newInvoice() {
        //TODO
    }

    @Override
    public List<Invoice> findAll() {
        //TODO
        return null;
    }
}
