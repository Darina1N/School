package sk.kosickaakademia.kolesarova.school.hobby;

public class Movie extends Hobby{
    private int year;

    public Movie(String name, String druh, int year){
        super(name,druh);
        this.year=year;
    }

    public int getYear() {
        return year;
    }
}