package sk.kosickaakademia.kolesarova.school.pet;

public class Cat implements Animal{
    private String meno;
    private String rasa;

    public Cat (String meno, String rasa){
        this.meno=meno;
        this.rasa=rasa;
    }

    public String getMeno() {
        return meno;
    }

    public String getRasa() {
        return rasa;
    }
}