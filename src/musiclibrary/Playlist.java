/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiclibrary;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Pérez wianpedi@gmail.com
 */
public class Playlist extends Library {
    private String namePlaylist;

    public Playlist(String namePlaylist, ArrayList<Song> songs) {
        super(songs);
        this.namePlaylist = namePlaylist;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }
    
    @Override
    public String toString() {
        return "Playlist: " + namePlaylist + "\n" + getSongs();
    }  
    
}
