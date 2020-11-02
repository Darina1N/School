package sk.kosickaakademia.kolesarova.school;

public class Grades {
    private int mat;
    private int eng;
    private int pro;
    private int web;


    public Grades(int mat, int eng, int pro, int web) {//konštruktor pre zadávanie známok, nechcem ich meniť preto konštruktor
        this.mat = mat;
        this.eng = eng;
        this.pro = pro;
        this.web = web;
    }

    public int getMat() {
        return mat;
        }

    public int getEng() {
            return eng;
        }

    public int getPro() {
            return pro;
        }

    public int getWeb(){
        return web;
    }

    @Override
    public String toString() {
        return "Grades: MAT: "+mat+" ENG: "+eng+" PRO: "+pro+" WEB: "+web;
    }
}
