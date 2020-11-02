package sk.kosickaakademia.kolesarova.school;

import java.time.LocalDate;


public class Student {
    //vlastnosti - properties -premenne
    private String firstName;
    private String lastName;
    private ClassName className;//trieda enum, ktorá má presne stanovené hodnoty ktoré môže mať
    private int salary;
    private LocalDate dob;//pomocou zapracovanej javovskej triedy
    private Grades grades; //Grades - trieda, grades s malým je názov premennej

    //metódy
    public Student(String firstName, String lastName, LocalDate dob, Grades grades, ClassName className,int salary){//konštruktor na vytvorenie nového študenta, vždy zadávam aj dátový typ premennej
        this.firstName=firstName;
        this.lastName=lastName;
        this.grades=grades;
        this.className=className;
        this.dob=dob;
        this.salary=salary;
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
}