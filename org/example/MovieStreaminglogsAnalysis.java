package org.example;

import java.util.*;

public class MovieStreaminglogsAnalysis {

    public static void main(String[] args) {

        String[] logs = {
                "U1,M1,Inception,120,80",
                "U2,M1,Inception,120,70",
                "U3,M2,Avatar,150,90",
                "U4,M1,Inception,120,65",
                "U5,M2,Avatar,150,40"
        };

        Map<String, Set<String>> movieUsers = new HashMap<>();
        Map<String, Integer> movieTotalDuration = new HashMap<>();
        Map<String, Integer> movieWatchedDuration = new HashMap<>();

        for (String log : logs) {
            String[] parts = log.split(",");

            String userId = parts[0];
            String movieId = parts[1];
            String movieName = parts[2];
            int totalDuration = Integer.parseInt(parts[3]);
            int watchedDuration = Integer.parseInt(parts[4]);

            movieUsers
                    .computeIfAbsent(movieName, k -> new HashSet<>())
                    .add(userId);

            movieTotalDuration.putIfAbsent(movieName, totalDuration);

            movieWatchedDuration.merge(movieName, watchedDuration, Integer::sum);
        }

        // 1️⃣ Movie watched by most users
        String mostWatchedMovie = movieUsers.entrySet()
                .stream()
                .max(Comparator.comparingInt(e -> e.getValue().size()))
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Movie watched by most users: " + mostWatchedMovie);

        // 2️⃣ Movies watched more than 50% of total length
        System.out.println("Movies watched more than 50%:");

        for (String movie : movieTotalDuration.keySet()) {
            int total = movieTotalDuration.get(movie);
            int watched = movieWatchedDuration.get(movie);

            if (watched > total * 0.5) {
                System.out.println(movie);
            }
        }
    }
}
