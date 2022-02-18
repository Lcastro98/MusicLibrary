/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiclibrary;

import java.util.ArrayList;

/**
 * La clase Playist tiene los atributos y métodos necesarios para crear y obtener la playlist.
 * 
 * @version 1.00.00 2022-02-18, la clase corresponde a la versión 1 del sistema.
 
 * @author Wilmer Pérez wianpedi@gmail.com
 */
public class Playlist extends Library {
    private String namePlaylist;

    /**
     * Constructor: permite crear una instancia de la clase Playlist.
     * @param namePlaylist
     * @param songs 
     */
    public Playlist(String namePlaylist, ArrayList<Song> songs) {
        super(songs);
        this.namePlaylist = namePlaylist;
    }

    /**
     * Método accesor del atributo namePlaylist.
     * @return 
     */
    public String getNamePlaylist() {
        return namePlaylist;
    }
    
    /**
     * Sobreescribe el método toString para mostrar los datos de la canción de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        return "Playlist: " + namePlaylist + "\n" + getSongs();
    }  
    
}
