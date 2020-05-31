/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class E_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hermano crysthel = new Hermano("Crysthel",
                22,
                "Animal Crossing.");
        Hermano cindy = new Hermano("Cindy",
                24,
                "Super Smash Bros.");
        Hermano emanuel = new Hermano("Emanuel",
                17,
                "The Legend of Zelda - Breath of Wild.");
        Hermano alex = new Hermano("Alex",
                12,
                "Sonic Mania.");

        crysthel.printSwitch();
        cindy.printSwitch();
        emanuel.printSwitch();
        alex.printSwitch();
    }
    
}
