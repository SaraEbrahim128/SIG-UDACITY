
package Model;

public class InvoiceLineSIG {
    private String itemName;
    private double UnitPrice;
    private int count;
    private InvoiceHeaderSIG headerSIG; // this is ref to header

    public InvoiceLineSIG(String itemName, double UnitPrice, int count, InvoiceHeaderSIG headerSIG) {
        this.itemName = itemName;
        this.UnitPrice = UnitPrice;
        this.count = count;
        this.headerSIG = headerSIG;
    }

    public InvoiceHeaderSIG getHeaderSIG() {
        return headerSIG;
    }

    public void setHeaderSIG(InvoiceHeaderSIG headerSIG) {
        this.headerSIG = headerSIG;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getLineTotal() {
        return count * UnitPrice ;
    }

    @Override
    public String toString() {
        return "InvoiceLineSIG{" + "itemName=" + itemName + ", UnitPrice=" + UnitPrice + ", count=" + count + ", lineTotal=" + getLineTotal() + '}';
    }

 
    
    
    
}
