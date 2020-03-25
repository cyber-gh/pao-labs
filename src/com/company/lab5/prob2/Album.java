package com.company.lab5.prob2;

public class Album implements Comparable {
    private final String name;
    private final Integer year;
    private final Integer rating;

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getRating() {
        return rating;
    }

    public Album(String name, Integer year, Integer rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Album) {
            return this.getRating() - ((Album) o).getRating();
        }
        return 0;
    }
}
