package org.example;




import java.util.*;
import java.util.stream.Collectors;

class Movie {
    int id;
    String name;
    int totalLength;

    public Movie(int id, String name, int totalLength) {
        this.id = id;
        this.name = name;
        this.totalLength = totalLength;
    }
}

class WatchRecord {
    int userId;
    int movieId;
    int watchedMinutes;

    public WatchRecord(int userId, int movieId, int watchedMinutes) {
        this.userId = userId;
        this.movieId = movieId;
        this.watchedMinutes = watchedMinutes;
    }
}

public class MoviesWatchedMoreThan50PercentOfTotalLength {
    public static void main(String[] args) {
        // 🎬 Movie data
        List<Movie> movies = Arrays.asList(
                new Movie(1, "Inception", 120),
                new Movie(2, "Interstellar", 180),
                new Movie(3, "Tenet", 150)
        );

        // 👥 Watch records (userId, movieId, watchedMinutes)
        List<WatchRecord> records = Arrays.asList(
                new WatchRecord(1, 1, 100),
                new WatchRecord(2, 1, 110),
                new WatchRecord(3, 1, 80),
                new WatchRecord(1, 2, 170),
                new WatchRecord(2, 2, 90),
                new WatchRecord(4, 3, 40)
        );

        // 1️⃣ Find movie watched by the most users
        Map<Integer, Long> userCountByMovie = records.stream()
                .collect(Collectors.groupingBy(r -> r.movieId,
                        Collectors.mapping(r -> r.userId, Collectors.toSet())))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> (long) e.getValue().size()));

        int mostWatchedMovieId = Collections.max(userCountByMovie.entrySet(),
                Map.Entry.comparingByValue()).getKey();

        String mostWatchedMovieName = movies.stream()
                .filter(m -> m.id == mostWatchedMovieId)
                .findFirst()
                .map(m -> m.name)
                .orElse("Unknown");

        System.out.println("🎥 Movie watched by most users: " + mostWatchedMovieName);

        // 2️⃣ Find movies watched more than 50% of total length (average)
        Map<Integer, Double> avgWatchPercent = records.stream()
                .collect(Collectors.groupingBy(r -> r.movieId,
                        Collectors.averagingDouble(r -> r.watchedMinutes)));

        List<String> moreThanHalfMovies = avgWatchPercent.entrySet().stream()
                .filter(e -> {
                    int total = movies.stream()
                            .filter(m -> m.id == e.getKey())
                            .findFirst().get().totalLength;
                    return (e.getValue() / total) > 0.5;
                })
                .map(e -> movies.stream()
                        .filter(m -> m.id == e.getKey())
                        .findFirst().get().name)
                .collect(Collectors.toList());

        System.out.println("🎬 Movies watched more than 50% on average: " + moreThanHalfMovies);
    }
}

