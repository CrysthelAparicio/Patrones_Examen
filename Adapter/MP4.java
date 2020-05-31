/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class MP4 implements MediaPackage{
    @Override
    public void playFile(String filename) {
    System.out.println("Escuchando MP4 File " + filename);
 }
}