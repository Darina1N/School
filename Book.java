package sk.kosickaakademia.kolesarova.school.hobby;

public class Book extends Hobby{//extends znamená, že dedí vlastnosti od rodiča Hobby
    private String autor;

    public Book(String name, String druh, String autor){//konštruktor pre premenne triedy Book
        super(name,druh);// takto volam rodičovský konštruktor
        this.autor=autor;//už len premenná tejto triedy
    }

    public String getAutor(){
        return autor;
    }
}