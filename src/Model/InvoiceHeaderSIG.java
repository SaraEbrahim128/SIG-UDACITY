
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



public class InvoiceHeaderSIG {
    
    private int id;
      private String CustomerName;
        private String date;
        ArrayList<InvoiceLineSIG> lineSIG ;
         private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        

    public InvoiceHeaderSIG(int id, String CustomerName, String date) {
        this.id = id;
        this.CustomerName = CustomerName;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public double getInvoiceTotal() {
        
        double totalSIG = 0 ;
        for (InvoiceLineSIG lineSIG : getLineSIG()) {
            
            totalSIG += lineSIG.getLineTotal();
           
        }
        
        
        return totalSIG;
    }

    
    
    @Override
    public String toString() {
        return "InvoiceHeaderSIG{" + "id=" + id + ", CustomerName=" + CustomerName + ", date=" + date + '}';
        
        
        
        
    }

    public ArrayList<InvoiceLineSIG> getLineSIG() {
        if (null == lineSIG) {
            
            lineSIG = new ArrayList<> ();
            
        }
       
        
        return lineSIG;
    }

    public Object getlineSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
  
        
  
   
    
    
    
    
    
}
