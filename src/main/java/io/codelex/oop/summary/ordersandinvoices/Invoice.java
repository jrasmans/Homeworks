package io.codelex.oop.summary.ordersandinvoices;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

class Invoice {
    private static int nextInvoiceNumber = 1;

    private final int invoiceNumber;
    private InvoiceStatus status;
    private final List<SellableThing> items;
    private final BigDecimal totalSum;

    public Invoice(Order order) {
        if (order.getItems().isEmpty()) {
            throw new WrongOrderException("Cannot create an invoice with an empty order.");
        }

        this.invoiceNumber = nextInvoiceNumber++;
        this.status = InvoiceStatus.APPROVED;
        this.items = order.getItems();
        this.totalSum = calculateTotalSum();
    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    private BigDecimal calculateTotalSum() {
        BigDecimal sum = BigDecimal.ZERO;
        for (SellableThing item : items) {
            sum = sum.add(item.getPrice());
        }
        return sum.setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateVAT() {
        BigDecimal vatRate = new BigDecimal("0.21");
        return totalSum.multiply(vatRate).setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateTotalWithVAT() {
        return totalSum.add(calculateVAT()).setScale(2, RoundingMode.HALF_UP);
    }

    public String getFormattedInvoice() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringBuilder invoiceBuilder = new StringBuilder();
        invoiceBuilder.append("===================================================\n");
        invoiceBuilder.append(String.format("= INVOICE NUMBER: INV%03d                          =\n", invoiceNumber));
        invoiceBuilder.append(String.format("= STATUS: %s                                =\n", status));
        invoiceBuilder.append("= Items:\n");
        for (int i = 0; i < items.size(); i++) {
            invoiceBuilder.append(String.format("= %d. %s\n", i + 1, items.get(i).fullInfo()));
        }
        invoiceBuilder.append(String.format("= SUM: %s EUR                                  =\n", decimalFormat.format(totalSum)));
        invoiceBuilder.append(String.format("= VAT (21%%): %s EUR                             =\n", decimalFormat.format(calculateVAT())));
        invoiceBuilder.append(String.format("= TOTAL: %s EUR                                =\n", decimalFormat.format(calculateTotalWithVAT())));
        invoiceBuilder.append("===================================================\n");
        return invoiceBuilder.toString();
    }
}
