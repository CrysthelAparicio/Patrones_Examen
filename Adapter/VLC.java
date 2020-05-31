/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class VLC implements MediaPackage{
     @Override
    public void playFile(String filename) {
    System.out.println("Escuchando VLC File " + filename);
 }
}