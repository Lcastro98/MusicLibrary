/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiclibrary;

import java.util.Comparator;

/**
 *
 * @author Lorena Castro Lcastro0398@gmail.com
 */
public class Song {
    private int id;
    private String name;
    private String year;
    private float duration;
    private String genre;
    private String cover;
    private String description;
    
    public Song(
        int id, 
        String name, 
        String year, 
        float duration, 
        String genre,
        String cover, 
        String description)
    {
        this.id = id;
        this.name = name;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public float getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getCover() {
        return cover;
    }

    public String getDescription() {
        return description;
    }
    
    public static Comparator<Song> durationComparatorAsc = (Song s1, Song s2) -> {
        float duration1 = s1.getDuration();
        float duration2 = s2.getDuration();
        if (duration1 < duration2) return -1;
        if (duration1 > duration2) return 1;
        return 0;
    };
    
    public static Comparator<Song> durationComparatorDesc = (Song s1, Song s2) -> {
        float duration1 = s1.getDuration();
        float duration2 = s2.getDuration();
        if (duration1 > duration2) return -1;
        if (duration1 < duration2) return 1;
        return 0;
        //return duration2 - duration1;
    };
    
    public static Comparator<Song> yearComparatorAsc = (Song s1, Song s2) -> {
        String year1 = s1.getYear();
        String year2 = s2.getYear();
        return year1.compareTo(year2);
    };
    
    public static Comparator<Song> yearComparatorDesc = (Song s1, Song s2) -> {
        String year1 = s1.getYear();
        String year2 = s2.getYear();
        return year2.compareTo(year1);
    };
    
    @Override
    public String toString() {
        return "\n" + id + ". " + name + ". " + year + ". " + duration + ". " + genre;
    }
}
