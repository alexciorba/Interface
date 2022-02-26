package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MasinaTest {

    @Test

    void test1(){
        Masina masina1=new Masina("audi","q3",10000);
        Masina masina2=new Masina("bmw","seria 3",20000);
        assertEquals(-1,masina1.compareTo(masina2));
    }

}