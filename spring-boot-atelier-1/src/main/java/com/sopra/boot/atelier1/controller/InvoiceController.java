package com.sopra.boot.atelier1.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import com.sopra.boot.atelier1.model.Invoice;
import com.sopra.boot.atelier1.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	private InvoiceService invoiceService;
	@Value("${instance.number}")
	private String instanceId;
	private static final Logger logger = LoggerFactory.getLogger(InvoiceController.class);

	public InvoiceController(InvoiceService invoiceService) {
		this.invoiceService = invoiceService;
	}

	@GetMapping
	@ResponseBody
	public List<Invoice> findAll() {
		logger.info("----- Find all invoices on instance {} ------- ", instanceId);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			throw new RuntimeException(e);
//		}
		return invoiceService.findAll();
	}

	@PostMapping
	public void createInvoice(Invoice invoice) {
		invoiceService.save(invoice);
	}

}
