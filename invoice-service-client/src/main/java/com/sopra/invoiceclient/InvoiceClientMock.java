package com.sopra.invoiceclient;

import com.sopra.invoiceclient.model.Invoice;

import java.util.List;

public class InvoiceClientMock implements ServiceClient {
    @Override
    public void newInvoice() {

    }

    @Override
    public List<Invoice> findAll() {
        return null;
    }
}
