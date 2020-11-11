package sk.kosickaakademia.kolesarova.files;

import java.io.*;

public class ReadWriteFiles {
    public void copyFileWithCapital(String fileName){//metóda na prekopirovanie textu zo suboru do ineho a zmenene na veľké písmená
        BufferedReader reader;//toto mi načíta celé nie len po znakoch
        try{
            FileReader fr=new FileReader(fileName);//objekt na načítanie súboru

            File file=new File(getFileName);//vytvorí mi súbor na zapisovanie
            file.createNewFile();

            FileWriter fw=new FileWriter(file);//objekt pre zapisovanie do súboru

            reader=new BufferedReader(fr);
            String line;
            while((line=reader.readLine())!=null){//načítavaj mi dovtedy kým je čo načítať
                line=line.toUpperCase();//chcem si do svojej premennej line uložiť zmenene na veľké písmená
                System.out.println(line);
                fw.write(line+'\n');
            }
            fr.close();
            fw.close();
        }catch(IOException ex){//chcem ošetriť či súbor existuje, či nie je preklep, čiže všetko ohľadne vstupu a výstupu
            ex.printStackTrace();
        }

        private String getFileName(){
            String name;
        }
    }
}
