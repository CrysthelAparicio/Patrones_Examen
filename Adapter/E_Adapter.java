/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class E_Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    MediaPlayer player = new MP3();
    player.play("Dua Lipa - Don't Start Now.mp3");
    player = new FormatAdapter(new MP4());
    player.play("Circles - PostMalone.mp4");
    player = new FormatAdapter(new VLC());
    player.play("Souvenir - Selena Gomez.avi");
    }
}