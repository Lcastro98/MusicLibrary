/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiclibrary;

import java.util.Comparator;

/**
 * La clase Song define los atributos (caracteristicas) de las canciones.
 * 
 * @version 1.00.00 2022-02-17, la clase corresponde a la versión 1 del sistema.
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
    
    
    /**
     * Constructor: permite crear una instancia de la clase Song.
     * @param id
     * @param name
     * @param year
     * @param duration
     * @param genre
     * @param cover
     * @param description 
     */
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

    /**
     * Método accesor del atributo id
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Método accesor del atributo name
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Método accesor del atributo year
     * @return 
     */
    public String getYear() {
        return year;
    }

    /**
     * Método accesor del atributo duration
     * @return 
     */
    public float getDuration() {
        return duration;
    }

    /**
     * Método accesor del atributo genre
     * @return 
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Método accesor del atributo cover
     * @return 
     */
    public String getCover() {
        return cover;
    }

    /**
     * Método accesor del atributo description
     * @return 
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Permite comparar las canciones por el atributo duration
     * para posteriormente ser ordenadas de forma ascendente
     */
    public static Comparator<Song> durationComparatorAsc = (Song s1, Song s2) -> {
        float duration1 = s1.getDuration();
        float duration2 = s2.getDuration();
        if (duration1 < duration2) return -1;
        if (duration1 > duration2) return 1;
        return 0;
    };
    
    /**
     * Permite comparar las canciones por el atributo duration
     * para posteriormente ser ordenadas de forma descendente
     */
    public static Comparator<Song> durationComparatorDesc = (Song s1, Song s2) -> {
        float duration1 = s1.getDuration();
        float duration2 = s2.getDuration();
        if (duration1 > duration2) return -1;
        if (duration1 < duration2) return 1;
        return 0;
        //return duration2 - duration1;
    };
    
    /**
     * Permite comparar las canciones por el atributo year
     * para posteriormente ser ordenadas de forma ascendente
     */
    public static Comparator<Song> yearComparatorAsc = (Song s1, Song s2) -> {
        String year1 = s1.getYear();
        String year2 = s2.getYear();
        return year1.compareTo(year2);
    };
    
    /**
     * Permite comparar las canciones por el atributo year
     * para posteriormente ser ordenadas de forma descendente
     */
    public static Comparator<Song> yearComparatorDesc = (Song s1, Song s2) -> {
        String year1 = s1.getYear();
        String year2 = s2.getYear();
        return year2.compareTo(year1);
    };
    
    /**
     * Sobreescribe el método toString para mostrar los datos de la canción de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        return "\n" + id + ". " + name + ". " + year + ". " + duration + ". " + genre;
    }
}
