/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class DocCreationEngine{
  public void generateDocument(DocBuilder builder){
    builder.createDocument();
    builder.createText();
    builder.createImages();
  }  
 }