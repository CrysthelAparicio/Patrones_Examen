/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class Hermano {
    private final String name;
    private final int age;
    private final String game;

    public Hermano(String name, int age, String game) {
        this.name = name;
        this.age = age;
        this.game = game;
    }

    public void printSwitch(){
        Consola consola = Consola.getInstance();
        consola.print("Hermano: " + name + "\n" +
                "Edad: " + age + "\n" +
                "Juego: " + game + "\n");
    }
    
}
