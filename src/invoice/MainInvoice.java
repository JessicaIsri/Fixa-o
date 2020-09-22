package invoice;

public class MainInvoice {
    public static void main(String[] args){
        Invoice invoice_001 = new Invoice(001, "mouse gamer", 2, 156.10);
        double invoice_001_amount = invoice_001.getInvoiceAmount();
        String invoice_001_product = invoice_001.getItemdescription();
        int invoice_001_number = invoice_001.getItemnumber();
        int invoice_001_quantity = invoice_001.getItemquantity();

        System.out.println("\n Nota: "+ invoice_001_number +"\n Produto: " + invoice_001_product + "\n Quantia:" + invoice_001_quantity
                + "\n Total: "+ invoice_001_amount
        );
    }
}
