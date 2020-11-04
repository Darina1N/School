package sk.kosickaakademia.kolesarova.school.pet;

public class Fish implements Animal{
    private String druh;
    private int count;

    public Fish(String druh, int count){
        this.druh=druh;
        this.count=count;
    }
    public String getDruh() {
        return druh;
    }

    public int getCount() {
        return count;
    }
}