package sk.kosickaakademia.kolesarova.students;

import java.time.LocalDate;

public class Students {
    private String meno;
    private String priezvisko;
    private String rc;
    private int vek;
    private double vyska;
    private int vaha;

    public Students(String meno, String priezvisko, String rc, double vyska, int vaha){
        this.meno=meno;
        this.priezvisko=priezvisko;
        this.rc= rc;
        this.vyska=vyska;
        this.vaha=vaha;
        setVek();
    }

    private void setVek() {
        LocalDate today=LocalDate.now();
        int rok = today.getYear()%100;
        
    }

    public String getMeno(){
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public String getRc() {
        return rc;
    }

    public int getVek() {
        return vek;
    }

    public double getVyska() {
        return vyska;
    }

    public int getVaha() {
        return vaha;
    }

    public Gender getGender(){
        if(rc.charAt(2)>'4'){
           return Gender.Female;
        }else return Gender.Male;
    }
}
