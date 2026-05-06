package main.java.ch12_stream.bonus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;
}