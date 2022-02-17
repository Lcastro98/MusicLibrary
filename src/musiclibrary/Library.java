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
    
    public void byGenre(String genre, ArrayList<Song> filterSongs) {
        filterSongs.stream().filter(song -> song.getGenre().equals(genre)).forEach(System.out::println);
    }
    
    public void byDate(String year, ArrayList<Song> filterSongs) {
        filterSongs.stream().filter(song -> song.getYear().equals(year)).forEach(System.out::println);
    }
    
    public void sortByDurationAsc(){
        Collections.sort(songs, durationComparatorAsc);
    }
    
    public void sortByDurationDesc(){
        Collections.sort(songs, durationComparatorDesc);
    }
    
    public void sortByYearAsc(){
        Collections.sort(songs, yearComparatorAsc);
    }
    
    public void sortByYearDesc(){
        Collections.sort(songs, yearComparatorDesc);
    }

    @Override
    public String toString() {
        return "Biblioteca de canciones: " + getSongs();
    }
}
