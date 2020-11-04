package sk.kosickaakademia.kolesarova.school.pet;

public class Dog implements Animal {//potrebujem aby dedilo od rozhrania preto implements, tym prepojim tuto triedu s rozhraním
    private String meno;
    private String rasa;

    public Dog (String meno, String rasa){
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