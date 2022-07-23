package Controller;

import Model.InvoiceHeaderSIG;
import SIG.JFrameVIEW.SIG;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ActionHandlerControllerSIG implements ActionListener, ListSelectionListener {

    private SIG frameSIG;  // global var
    private Iterable<InvoiceHeader> invoiceHeaderSIG;

    /**
     *
     * @param frameSIG
     */
    public ActionHandlerControllerSIG(SIG frameSIG) {  // to be ref for the frame from the controller

        this.frameSIG = frameSIG;

    }

    public ActionHandlerControllerSIG(String SIG) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
/// for handeling all buttons action in SIG
                switch (e.getActionCommand()) {
            
            case "LFSIG":
                System.out.println(" you click on load file ");
                LFSIG();
                
                break;
                
            case "SFSIG":
                System.out.println("you can save now ");
                
               SFSIG();
                
                break;
                
            case " CreateNewInvSIG ":
                CreateNewInvSIG();
                break;
                
            case " DeleteInvSIG ":
                DeleteInvSIG();
                break;
                
            case " SaveSIG ":
                SaveSIG();
                
                break;
                
            case " CancelSIG ":
                CancelSIG();
                
                break;
                
        }

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {      /// for handeling selection on table  

    }


    private void LFSIG()   {
        try {
            
       

    JFileChooser fCSIG ;
        fCSIG = new JFileChooser();
       int result;
        result = fCSIG.showOpenDialog(frameSIG);
  if ( result== JFileChooser.APPROVE_OPTION  ) {
      
    File headerfFile =   fCSIG.getSelectedFile();
      String headerStrPath = headerfFile.getAbsolutePath();
  Path headerPathSIG = Paths.get(headerStrPath); 
 List<String> headerLines =  Files.lines(headerPathSIG).collect(Collectors.toList());     

// Array Will Be Containes data As 
// first item  [1,22-11-2020,Ali]
// second  item 2,13-10-2021,Saleh

// we need to create InvHeader so will will create arraylist of InvoiceheaderSIG

      ArrayList<InvoiceHeaderSIG> InvHeaderList;
        InvHeaderList = new  ArrayList<> ();



      for (String headerLine:headerLines) {
         // type on line from header 
         String[] PartsSIG = headerLine.split(",");
         //So That we will find that PartsSIG1= [ "1" , "22-11-2020" , "Ali"]
           //So That we will find that PartsSIG2= [ "2" , "13-10-2021" , "Salah"]
           int id = Integer.parseInt(PartsSIG[0]);
           
           InvoiceHeaderSIG InvHeader = new  InvoiceHeaderSIG ( id , PartsSIG[2] , PartsSIG [1]);
           
        InvHeaderList.add( InvHeader);
      
      }
  
      
      System.out.println("Checked");
      
      
        int result1 = result;
        result = fCSIG.showOpenDialog(frameSIG);
      if ( result== JFileChooser.APPROVE_OPTION  ) {
      
       String lineStrPath = fCSIG.getSelectedFile().getAbsolutePath();
   
        Path linePathSIG = Paths.get(lineStrPath); 
         List<String> lineLines =  Files.lines(linePathSIG).collect(Collectors.toList());   
         
         // the line will display in the array like that 
      //  ["1" , "Mobile" ,"3200" , "1" ]
      // ["1" , "cover" ,"20" , "2" ]
            // ["1" , "Headphone" ,"130" , "1" ]
      // ["1" , "Laptop" ,"4000" , "1" ]
      // ["1" , "Mouse" ,"35" , "2" ]

     for (String lineLine:headerLines) {
        String[] PartsSIG = lineLine.split(",");
            int id = Integer.parseInt(PartsSIG[0]);    
            double UnitPrice = Integer.parseInt(PartsSIG[2]);
                int count = Integer.parseInt(PartsSIG[3]);
                InvoiceHeaderSIG header = getInvoiceHeaderSIGBYId(InvHeaderList, id);
               InvoiceLine InvLine = new InvoiceLine(PartsSIG[1] ,UnitPrice ,count);
               // header.getLineSIG().add(InvLine);
  
           }
         
      frameSIG.setInvoiceHeaderList(InvHeaderList);
                 
    
      
  }  
      
  }
  
        
        }
        
        
        
        catch (IOException ex) {
                ex.printStackTrace();
                }
        }
      
      
       
    
    // we need to create fun for searching in the invline for id to set this line on the header 
    
    private InvoiceHeaderSIG getInvoiceHeaderBYId ( ArrayList<InvoiceHeaderSIG>  invoices  , int id){
        Iterable<InvoiceHeader> Invoices = null;
    
        for (InvoiceHeader Invoice :Invoices ) {
           if( id == Invoices.getid() ){
               InvoiceHeaderSIG invoice = null;
               return invoice ;
           
           
           
           
           }
            
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void CancelSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void SaveSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void DeleteInvSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void SFSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void CreateNewInvSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private InvoiceHeaderSIG getInvoiceHeaderSIGBYId(ArrayList<InvoiceHeaderSIG> InvHeaderList, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
 






    }


 /**   private void CreateNewInvSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void DeleteInvSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void SaveSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void CancelSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void SFSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }





//To select Line File 

                /**     result =   fileChooserFunc.showOpenDialog(frameSIG);
                 if ((result == JFileChooser.APPROVE_OPTION)){
                String  lineStrPath =fileChooserFunc.getSelectedFile().getAbsolutePath();
                 Path linePath = Paths.get(lineStrPath);
                   List<String> lineLine;
                   lineLine = Files.lines(linePath).collect(Collectors.toList());
                  Iterable<String> lineLines = null;
                 for (String LineLine : lineLines) {
                 //Parts = [ "1" , " 22-11-2020" , " Ali"]
              //  Parts = [ " 2" , " 13-10-2021 " , " Saleh"]
                 String [] PartsSIG_2 = LineLine.split(",");
                   int price = Integer.parseInt(PartsSIG_2[2]) ;
                int count = Integer.parseInt(PartsSIG_2[3]) ;
                     InvoiceLineSIG InvLineSIG = new InvoiceLineSIG( PartsSIG_2[1] , price , count , headerSIG )   ;
                     
                     private ArrayList<InvoiceHeader> getInvoiceHeaderById(ArrayList<InvoiceHeader> invoicesSIG , int id)
                     {
                         for (InvoiceHeader Invoice : invoicesSIG){
                         
                     
                             if ( Invoice.getId() == Id   )
                                 return invoicesSIG;

                                     
                                     
                         }
                                 
                               return null;
                                 
                             }
                         
                         
                         
                         
                         
                         }
                     
}


    private void CancelSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void SaveSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void DeleteInvSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void CreateNewInvSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void SFSIG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
                             
          **/               
                             
                      
                         
                         
                         
                         
                  
                     
                  
          

                 
                 
   
                  
                  
                  

    

 

