/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiclibrary;

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
    
    
}
