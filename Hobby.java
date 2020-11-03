package sk.kosickaakademia.kolesarova.school.hobby;

public abstract class Hobby {// abstract znamená, že túto metódu budem používať len na to aby bola rodič
    private String name;
    private String druh;//premenné spoločné pre všetky deti

    public Hobby(String name, String druh){//konštruktor pre spoločnú premennú
        this.name=name;
        this.druh=druh;
    }

    public String getName(){
        return name;
    }

    public String getDruh() {
        return druh;
    }
}