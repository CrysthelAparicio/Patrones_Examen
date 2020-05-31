/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class Consola {
    private static Consola consola;
    private int numJuegos;

    private Consola() {
        
    }

    public static Consola getInstance() {
        return consola == null ? 
               consola = new Consola() : 
               consola;
    }

    public void print(String text){
        System.out.println(text +
                "\n" + "Juegos disfrutados hoy " + ++numJuegos +
                "\n" + "---------------------------------------");
    }
}
