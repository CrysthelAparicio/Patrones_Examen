/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class PhoneFactory {
 public Phone getPhone(String phoneType){
  if(phoneType == null) 
   return null;
  if(phoneType.equalsIgnoreCase("Celular")) 
   return new CellPhone(33866624L);
  else if(phoneType.equalsIgnoreCase("Casa")) 
   return new HomePhone(22290662L);
  else 
   return null; 
 }
}