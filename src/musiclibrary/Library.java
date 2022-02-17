/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiclibrary;

import java.util.ArrayList;

/**
 *
 * @author Lorena Castro Lcastro0398@gmail.com
 */
public class Library {
    
    public ArrayList<Song> songs;
    
    public Library(ArrayList<Song> songs) {
        this.songs = songs;
    }
    
    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
    
    public void addSong(Song s) {
        this.songs.add(s);
    }
    
    public Song getSong(int id) {
        int index = 0;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getId()==id) {
                index = i;
            }
        } 
        return this.songs.get(index);
    }
}
