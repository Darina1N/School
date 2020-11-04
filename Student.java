package sk.kosickaakademia.kolesarova.school;

import sk.kosickaakademia.kolesarova.school.hobby.Book;
import sk.kosickaakademia.kolesarova.school.hobby.Hobby;
import sk.kosickaakademia.kolesarova.school.hobby.Movie;
import sk.kosickaakademia.kolesarova.school.hobby.Music;
import sk.kosickaakademia.kolesarova.school.pet.*;

import java.time.LocalDate;


public class Student {
    //vlastnosti - properties -premenne
    private String firstName;
    private String lastName;
    private ClassName className;//trieda enum, ktorá má presne stanovené hodnoty ktoré môže mať
    private int salary;
    private LocalDate dob;//pomocou zapracovanej javovskej triedy
    private Grades grades; //Grades - trieda, grades s malým je názov premennej
    private Hobby[] hobbies;
    private int countHobbies;
    private Animal animal;

    //metódy
    public Student(String firstName, String lastName, LocalDate dob, Grades grades, ClassName className,int salary){//konštruktor na vytvorenie nového študenta, vždy zadávam aj dátový typ premennej
        this.firstName=firstName;
        this.lastName=lastName;
        this.grades=grades;
        this.className=className;
        this.dob=dob;
        this.salary=salary;
        hobbies=new Hobby[5];
        countHobbies=0;
        animal=null;//ak nemá zviera tak aby bola nastavená hodnota ako prázdna
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public ClassName getClassName(){
        return className;
    }

    public int getSalary(){
        return salary;
    }

    public LocalDate getDob(){
        return dob;
    }

    public Grades getGrades(){
        return grades;
    }
    
    public void addHobbies(Hobby newHobby){//metóda na pridávanie hobby
        int len=hobbies.length;
        if(countHobbies==len){
            System.out.println("Nie je možné pridať ďalšie hobby");
            return;
        }
        hobbies[countHobbies++]=newHobby;
    }

    public void printHobbies(){//metóda na vypísanie hobby študenta
        System.out.println("Hobby študenta: ");
        int len=hobbies.length;
        for(int i=0;i<countHobbies;i++){
            System.out.println(hobbies[i].getDruh()+", " +hobbies[i].getName());//vypíše z rodiča
            if(hobbies[i] instanceof Book)//pri if sa pozerá na ďalšie premenné zadané v dedičných triedach
                System.out.println(((Book) hobbies[i]).getAutor());
            if(hobbies[i] instanceof Movie)
                System.out.println(((Movie) hobbies[i]).getYear());
            if(hobbies[i] instanceof Music)
                System.out.println(((Music) hobbies[i]).getSkladatel());
        }
    }
    public void printAnimal() {
        System.out.println("Domáci maznáčikovia: ");
        if(animal instanceof Dog){
                System.out.println(((Dog) animal).getMeno()+" "+((Dog) animal).getRasa());
        }if(animal instanceof Cat){
            System.out.println(((Cat) animal).getMeno()+" "+((Cat) animal).getRasa());
        }if(animal instanceof Fish){
            System.out.println(((Fish) animal).getDruh()+" "+((Fish) animal).getCount());
        }if(animal instanceof Other){
            System.out.println(((Other) animal).getMeno()+" "+((Other) animal).getDruh());
        }
    }
}