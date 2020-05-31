/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class E_Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewVideo newsVideolObj = new NewVideo();
				
				// Creacion de nuevo Observer
				Observer sus1 = new Suscribers("Viewer 1");
				Observer sus2 = new Suscribers("Viewer 2");
				Observer sus3 = new Suscribers("Viewer 3");
				
				//Registro
				newsVideolObj.suscribed(sus1);
				newsVideolObj.suscribed(sus2);
				newsVideolObj.suscribed(sus3);
				
				// Adjuntarlos
				sus1.setSubject(newsVideolObj);
				sus2.setSubject(newsVideolObj);
				sus3.setSubject(newsVideolObj);
				
				// Ver si esta disponible
				sus1.update();
				
				// Mandar el mensaje
				newsVideolObj.postNewVideo("Shark Tank E8-T3");
 
	}
    
}
