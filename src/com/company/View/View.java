package com.company.View;

import com.company.Controller;

import javax.naming.ldap.Control;
import java.util.Scanner;

public class View {


    private Controller controller;
    private Scanner scanner=new Scanner(System.in);



    public View(Controller controller){

           this.controller=controller;
    }
    private void meniu(){
        System.out.println("Apasati tasta 1 : pentru a afisa toate manisinile");
    }

    public void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){
                case 1 : controller.afisareMasna();
                break;
            }
        }
    }
}
