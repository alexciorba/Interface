package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerImpl implements Controller{

    private ArrayList<Masina>listaMasini=new ArrayList<>();


    @Override
    public void load() {
        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Abstractizare\\Interfete\\src\\com\\company\\source\\masina1.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String[] proprietati=scanner.nextLine().split(",");
                Masina masina=new Masina(
                        proprietati[0],
                        proprietati[1],
                        Integer.parseInt(proprietati[2])
                );
                listaMasini.add(masina);
            }
        }catch (Exception e){

        }
    }

    @Override
    public void saveMasina() {

    }

    @Override
    public void addMasina() {

    }

    @Override
    public void afisareMasna() {
        for(Masina m : listaMasini){
            m.toString();
        }
    }
}
