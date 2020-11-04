package sk.kosickaakademia.kolesarova.school.pet;

public class Other implements Animal{
    private String meno;
    private String druh;

    public Other(String meno, String druh){
        this.meno=meno;
        this.druh=druh;
    }

    public String getMeno() {
        return meno;
    }

    public String getDruh() {
        return druh;
    }
}
