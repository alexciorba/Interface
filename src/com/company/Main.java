package com.company;

import com.company.View.View;

public class Main {

    public static void main(String[] args) {

        Controller c1= new ControllerImpl();
        Controller c2= new ControllerImpl2();

        View view = new View(c2);


        view.play();
	// write your code here
    }
}
