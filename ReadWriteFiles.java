package sk.kosickaakademia.kolesarova.files;

import java.io.*;
import java.time.LocalTime;

public class ReadWriteFiles {
    public void copyFileWithCapital(String fileName) {//metóda na prekopirovanie textu zo suboru do ineho a zmenene na veľké písmená
        String line;

        try {
            FileReader fr = new FileReader(fileName);//objekt na načítanie súboru
            BufferedReader reader = new BufferedReader(fr);//načítavanie po riadkoch nie len po znakoch

            //vytvorí mi súbor na zapisovanie
            File file;
            file = new File("Output/"+ getFileName('b'));
            file.createNewFile();

            FileWriter fw = new FileWriter(file);//objekt pre zapisovanie do súboru

            while ((line = reader.readLine()) != null) {//načítavaj mi dovtedy kým je čo načítať
                line = line.toUpperCase();//chcem si do svojej premennej line uložiť zmenene na veľké písmená
                System.out.println(line);
                fw.write(line + '\n');
            }
            fr.close();//súbor po praci musim zavriet
            fw.close();//súbor po praci musim zavriet
        } catch (IOException ex) {//chcem ošetriť či súbor existuje, či nie je preklep, čiže všetko ohľadne vstupu a výstupu
            ex.printStackTrace();
        }
    }

    public void fileSifre(String fileName){
        String line;

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fr);

            File file;
            file = new File("Output/"+ getFileName('c'));
            file.createNewFile();

            FileWriter fw = new FileWriter(file);
            String retazec="";

            while ((line = reader.readLine()) != null) {
               retazec+=line+'\n';


            }
            char[] arr=new char[retazec.length()];
            for(int i=0;i<retazec.length();i++){
                arr[i]=retazec.charAt(i);
            }
            for(int i=0;i<retazec.length(); i++){

                char z=arr[i];
                if(z>='A' && z<='Z'){
                    z=(char)(z+3);
                    if(z>'Z')
                        z=(char)(z-26);
                }
                else if(z>='a' && z<='z'){
                    z=(char)(z+3);
                    if(z>'z')
                        z=(char)(z-26);
                }
                else if(z>='0' && z<='9'){
                    z=(char)(z+3);
                    if(z>'9')
                        z=(char)(z-10);
                }
                arr[i]=z;
            }
            for(int i=0;i<retazec.length();i++){
                fw.write(arr[i]);
            }

            fr.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private String getFileName(char prefix) {
            LocalTime time = LocalTime.now();
            int h = time.getHour();
            int min = time.getMinute();
            int sec = time.getSecond();
            if(prefix=='b') {
                if (h < 10) {
                    h = h * 10000;
                    min = min * 100;
                    int cas = h + min + sec;
                    return ("b_0" + cas + ".txt");
                } else {
                    h = h * 10000;
                    min = min * 100;
                    int cas = h + min + sec;
                    return ("b_" + cas + ".txt");
                }

            }else if (prefix=='c'){
                if (h < 10) {
                    h = h * 10000;
                    min = min * 100;
                    int cas = h + min + sec;
                    return ("c_0" + cas + ".txt");
                } else {
                    h = h * 10000;
                    min = min * 100;
                    int cas = h + min + sec;
                    return ("c_" + cas + ".txt");
                }
            }else if (prefix=='d'){
                if (h < 10) {
                    h = h * 10000;
                    min = min * 100;
                    int cas = h + min + sec;
                    return ("d_0" + cas + ".txt");
                } else {
                    h = h * 10000;
                    min = min * 100;
                    int cas = h + min + sec;
                    return ("d_" + cas + ".txt");
                }
            }
            return null;
        }

}