package com.sopra.invoiceclient;

import com.sopra.invoiceclient.model.Invoice;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class InvoiceClientRestImpl implements ServiceClient {

    private InvoiceClient invoiceClient;

    public InvoiceClientRestImpl(InvoiceClient invoiceClient) {
        this.invoiceClient = invoiceClient;
    }

    @Override
    public void newInvoice() {

    }

    @Override
    public List<Invoice> findAll() {
        return null;
    }
}
