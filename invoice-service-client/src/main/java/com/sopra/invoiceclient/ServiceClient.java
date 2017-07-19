package com.sopra.invoiceclient;

import java.util.List;
import com.sopra.invoiceclient.model.Invoice;

public interface ServiceClient {

    void newInvoice();

    List<Invoice> findAll();
}
