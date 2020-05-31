/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class E_Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      DocCreationEngine engine=new DocCreationEngine();
  
   PDFDocBuilder pdfDocBuilder=new PDFDocBuilder();
   engine.generateDocument(pdfDocBuilder);
   PDFDocument pdfDocument=(PDFDocument)pdfDocBuilder.getDocument();
   
   XMLDocBuilder xmlDocBuilder=new XMLDocBuilder();
   engine.generateDocument(xmlDocBuilder);
   XMLDocument xmlDocument=(XMLDocument)xmlDocBuilder.getDocument();
  }
}