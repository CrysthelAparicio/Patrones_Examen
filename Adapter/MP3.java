/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class MP3 implements MediaPlayer{

     @Override
    public void play(String filename) {
    System.out.println("Escuchando MP3 File " + filename);
 }
}
