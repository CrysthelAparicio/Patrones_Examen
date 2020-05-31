/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class HomePhone implements Phone {
 
 private long userID;
 
 public HomePhone(long userID){
  this.userID = userID;
 }
 
 @Override
 public void call(long number){
  System.out.println("Casa ***** Llamando..... "+ number+"..");
  System.out.println("25 lps la hora");
 }
}