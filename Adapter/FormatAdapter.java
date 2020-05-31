/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class FormatAdapter implements MediaPlayer{
 private MediaPackage media;
 public FormatAdapter(MediaPackage m) {
    media = m;
 }
 @Override
 public void play(String filename) {
   System.out.print("Usando el Adaptador --> ");
   media.playFile(filename);
 }
}