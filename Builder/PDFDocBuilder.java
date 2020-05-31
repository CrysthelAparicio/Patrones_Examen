/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
 class PDFDocBuilder extends DocBuilder{
  private PDFDocument pdfDoc;
  public void createDocument(){
    this.pdfDoc=new PDFDocument();
  }
  public void createText(){
    System.out.println("Creando texto para PDF Document.");
  }
  public  void createImages(){
    System.out.println("Creando imagen para PDF Document.");
  }  
  public  Document getDocument(){
   System.out.println("Fetching PDF Document."); 
   return this.pdfDoc; 
  } 
}