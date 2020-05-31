/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class CellPhone implements Phone {
 
 private long userID;
 
 public CellPhone(long userID){
  this.userID = userID;
 }
 
 @Override
 public void call(long number){
  System.out.println("Celular ***** Llamando..... "+ number+"..");
  System.out.println("Demasiado Caro!");
 }
}