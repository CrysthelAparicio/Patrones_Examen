/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class XMLDocBuilder extends DocBuilder{
  private XMLDocument xmlDoc;
  public void createDocument(){
    this.xmlDoc=new XMLDocument();
  }
  public void createText(){
    System.out.println("Creando texto para XML Document.");
  }
  public  void createImages(){
    System.out.println("Creando imagen para XML Document.");
  }  
  public  Document getDocument(){
    System.out.println("Fetching PDF Document.");
    return this.xmlDoc; 
   } 
}
