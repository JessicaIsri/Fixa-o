package invoice;

public class Invoice {
    public int itemnumber;
    public String itemdescription;
    public int itemquantity = 0;
    public double itemprice = 0;

    public Invoice(int number, String description, int quantity, double price) {
        this.itemnumber = number;

        this.itemdescription = description;

        if (quantity != 0) {
            this.itemquantity = quantity;
        }

        if (price > 0){
            this.itemprice = price;
        }
    }

    public double getInvoiceAmount(){
        return this.itemprice * itemquantity;
    }

    public int getItemnumber() {
        return itemnumber;
    }

    public void setItemnumber(int itemnumber) {
        this.itemnumber = itemnumber;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public int getItemquantity() {
        return itemquantity;
    }

    public void setItemquantity(int itemquantity) {
        this.itemquantity = itemquantity;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }
}
