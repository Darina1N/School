package sk.kosickaakademia.kolesarova.school;

import sk.kosickaakademia.kolesarova.school.hobby.*;
import sk.kosickaakademia.kolesarova.school.pet.Cat;
import sk.kosickaakademia.kolesarova.school.pet.Dog;
import sk.kosickaakademia.kolesarova.school.pet.Fish;
import sk.kosickaakademia.kolesarova.school.pet.Other;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student [] students;
        students= initStudents();
        printN1Students(students);//metóda na vypísanie študentov 1N
        printStudentsWhereAverageLE2(students);//metóda ktorá mi vypíše študentov, ktorí majú priemer známok LE <= 2  GT > LT < GE >= EQ ==
        printAge(students);//vypíše mi zoznam študentov a ich vek

    }


    private static void printAge(Student[] students) {
        int i;
        int len= students.length;
        LocalDate today= LocalDate.now();
        System.out.println("Zoznam študentov aj s ich vekom:");
        for(i=0;i<len;i++){
            int vek=today.getYear()-students[i].getDob().getYear();
            System.out.println(students[i].getFirstName()+" "+students[i].getLastName()+" "+vek);
        }
        System.out.println();
    }

    private static void printStudentsWhereAverageLE2(Student[] students) {
        int i;
        int len= students.length;
        System.out.println("Zoznam študentov s priemerom do 2.0 :");
        for(i=0;i<len;i++){
            Grades znamky= students[i].getGrades();//potrebujem prechádzať študentov a dostať ich známky do premennej znamky
            double average= (znamky.getEng()+ znamky.getMat()+ znamky.getPro()+ znamky.getWeb())/4.0;//4,0 lebo mám double
            if(average<=2)
                System.out.println(students[i].getFirstName()+" "+students[i].getLastName()+" "+average);
        }
        System.out.println();
    }

    private static void printN1Students(Student[] students) {//vypíše mi zoznam študentov 1.N.
    int i;
    int len= students.length;
        System.out.println("Zoznam študentov 1.N. triedy:");
        for (i=0;i<len;i++){
            if(students[i].getClassName()==ClassName.N1)
                System.out.println(students[i].getFirstName()+" "+students[i].getLastName());
        }
        System.out.println();
    }

    private static Student[] initStudents() {
        Student [] stud=new Student[10];

        Grades gradesS1 = new Grades(3,2,1,2);//zapisujem len číslené hodnoty názov dotiahne samo lebo mám geter
        LocalDate datumS1=LocalDate.of(1995,01,17);
        Student s1 = new Student("Marek", "Baca",datumS1,gradesS1,ClassName.N1,100);
        stud[0]=s1;
        Book b1=new Book("Marína","Poézia", "A. Sládkovič");
        stud[0].addHobbies(b1);
        Book b2= new Book("Mor ho!","Poézia","S. Chalúpka");
        stud[0].addHobbies(b2);
        Sport sp1=new Sport("Beh cez prekážky","Atletika");
        stud[0].addHobbies(sp1);
        Animal a1=new Animal("dog","spoločenské");
        stud[0].addHobbies(a1);
        Music mu1=new Music("4 ročné obdobia","Vážna hudba", "Vivaldi");
        stud[0].addHobbies(mu1);
        stud[0].printHobbies();
        stud[0].setAnimal(new Dog("Leo","bradáč"));
        stud[0].printAnimal();


        Grades gradesS2=new Grades(1,2,1,1);
        LocalDate datumS2=LocalDate.of(1977,12,6);
        Student s2=new Student("Darina","Kolesárová",datumS2,gradesS2,ClassName.N2,250);
        stud[1]=s2;
        Book b3=new Book("Trón zo skla","Fantasy","S. J. Maas");
        stud[1].addHobbies(b3);
        Book b4= new Book("Mág","Fantasy","R. E. Feist");
        stud[1].addHobbies(b4);
        Sport sp2=new Sport("Stolný tenis","Hra");
        stud[1].addHobbies(sp2);
        Movie m1=new Movie("Mulan","Animovaná rozprávka",1998);
        stud[1].addHobbies(m1);
        Animal a2=new Animal("Hedgehog","cicavec");
        stud[1].addHobbies(a2);
        stud[1].printHobbies();
        stud[1].setAnimal(new Other("Blška","ježko"));
        stud[1].printAnimal();

        Grades gradesS3=new Grades(2,1,2,1);
        LocalDate datumS3=LocalDate.of(2000,06,23);
        Student s3= new Student("Janko","Hraško",datumS3,gradesS3,ClassName.N1,0);
        stud[2]=s3;
        Movie m2=new Movie("To","horor",2017);
        stud[2].addHobbies(m2);
        Movie m3= new Movie("Halloween","horor",2018);
        Sport sp3=new Sport("Box","bojové");
        stud[2].addHobbies(sp3);
        stud[2].printHobbies();
        stud[2].setAnimal(new Fish("skalár",3));
        stud[2].printAnimal();

        Grades gradesS4=new Grades(1,1,1,1);
        LocalDate datumS4=LocalDate.of(1998,03,9);
        Student s4= new Student("Martin","Klingáč",datumS4,gradesS4,ClassName.N3,500);
        stud[3]=s4;
        stud[3].setAnimal(new Cat("Nefi","perská"));
        stud[3].printAnimal();


        Grades gradesS5=new Grades(2,2,2,2);
        LocalDate datumS5=LocalDate.of(1996,11,8);
        Student s5= new Student("Marienka","Sladká",datumS5,gradesS5,ClassName.N1,50);
        stud[4]=s5;
        stud[4].setAnimal(new Other("Pigi","škrečok"));
        stud[4].setAnimal(new Cat("Murko","siamská"));
        stud[4].printAnimal();

        Grades gradesS6=new Grades(2,3,2,1);
        LocalDate datumS6=LocalDate.of(2001,01,21);
        Student s6= new Student("Eva","Prvá",datumS6,gradesS6,ClassName.N1,0);
        stud[5]=s6;

        Grades gradesS7=new Grades(1,2,2,3);
        LocalDate datumS7=LocalDate.of(1999,05,12);
        Student s7= new Student("Tomáš","Nový",datumS7,gradesS7,ClassName.N2,0);
        stud[6]=s7;

        Grades gradesS8=new Grades(2,1,2,2);
        LocalDate datumS8=LocalDate.of(2000,03,03);
        Student s8= new Student("Peter","Hrozný",datumS8,gradesS8,ClassName.N3,0);
        stud[7]=s8;

        Grades gradesS9=new Grades(1,1,1,1);
        LocalDate datumS9=LocalDate.of(1999,02,20);
        Student s9= new Student("Anna","Múdra",datumS9,gradesS9,ClassName.N2,500);
        stud[8]=s9;

        Grades gradesS10=new Grades(2,1,2,1);
        LocalDate datumS10=LocalDate.of(2000,10,15);
        Student s10= new Student("Milan","Rúfus",datumS10,gradesS10,ClassName.N1,0);
        stud[9]=s10;

        return stud;
    }
}