/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiclibrary;

import java.util.ArrayList;
import java.util.Collections;
import static musiclibrary.Song.durationComparatorAsc;
import static musiclibrary.Song.durationComparatorDesc;
import static musiclibrary.Song.yearComparatorAsc;
import static musiclibrary.Song.yearComparatorDesc;

/**
 * La clase Library tiene los atributos y metodos necesarios para manipular la biblioteca principal.
 * 
 * @version 1.00.00 2022-02-17, la clase corresponde a la versión 1 del sistema.
 * 
 * @author Lorena Castro Lcastro0398@gmail.com
 */
public class Library {
    public ArrayList<Song> songs;
    
    /**
     * Constructor: permite crear una instancia de la clase Library.
     * @param songs 
     */
    public Library(ArrayList<Song> songs) {
        this.songs = songs;
    }
    
    /**
     * Método accesor del atributo songs.
     * @return 
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Método modificador del atributo songs.
     * @param songs 
     */
    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
    
    /**
     * Permite agregar una canción al array.
     * @param s 
     */
    public void addSong(Song s) {
        this.songs.add(s);
    }
    
    /**
     * Permite acceder a una canción del array.
     * @param id
     * @return 
     */
    public Song getSong(int id) {
        int index = 0;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getId()==id) {
                index = i;
            }
        } 
        return this.songs.get(index);
    }
    
    /**
     * Permite filtrar las canciones por el atributo genre.
     * @param genre
     * @param filterSongs 
     */
    public void byGenre(String genre, ArrayList<Song> filterSongs) {
        filterSongs.stream()
                .filter(song -> song.getGenre().equals(genre))
                .forEach(System.out::println);
    }
    
    /**
     * Permite filtrar las canciones por el atributo year.
     * @param year
     * @param filterSongs 
     */
    public void byDate(String year, ArrayList<Song> filterSongs) {
        filterSongs.stream()
                .filter(song -> song.getYear().equals(year))
                .forEach(System.out::println);
    }
    
    /**
     * Permite ordenar las canciones de forma ascendente por el atributo duration,
     * Gracias al método durationComparatorAsc de la clase Song.
     */
    public void sortByDurationAsc(){
        Collections.sort(songs, durationComparatorAsc);
    }
    
    /**
     * Permite ordenar las canciones de forma descendente por el atributo duration,
     * Gracias al método durationComparatorDesc de la clase Song.
     */
    public void sortByDurationDesc(){
        Collections.sort(songs, durationComparatorDesc);
    }
    
    /**
     * Permite ordenar las canciones de forma ascendente por el atributo year,
     * Gracias al método yearComparatorAsc de la clase Song.
     */
    public void sortByYearAsc(){
        Collections.sort(songs, yearComparatorAsc);
    }
    
    /**
     * Permite ordenar las canciones de forma ascendente por el atributo year,
     * Gracias al método yearComparatorDesc de la clase Song.
     */
    public void sortByYearDesc(){
        Collections.sort(songs, yearComparatorDesc);
    }

    /**
     * Sobreescribe el método toString para mostrar los datos de la canción de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        return "Biblioteca de canciones: " + getSongs();
    }
}
