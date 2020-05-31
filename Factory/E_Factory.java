/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class E_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  PhoneFactory factory = new PhoneFactory();
  
  Phone myNewCell = factory.getPhone("Celular");
  
  long mom = 22136235L;  
  myNewCell.call(mom);
  
  Phone myNewHome = factory.getPhone("Casa");
    
  myNewHome.call(mom);
  
 }
}