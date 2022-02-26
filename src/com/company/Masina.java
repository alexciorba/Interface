package com.company;

public class Masina  implements  Comparable<Masina>{

    private String marca;
    private String model;
    private int kilometrii;

    public Masina(String marca, String model, int kilometrii) {
        this.marca = marca;
        this.model = model;
        this.kilometrii = kilometrii;
    }

    public Masina(String line){
        this(line.split(",")[0],
                line.split(",")[1],
                Integer.parseInt(line.split(",")[2]));
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKilometrii() {
        return kilometrii;
    }

    public void setKilometrii(int kilometrii) {
        this.kilometrii = kilometrii;
    }

    @Override
    public String toString(){
        String text=marca + "," + model + "," + kilometrii;
        return text;
    }

    @Override
    public boolean equals(Object o){
        Masina masina=(Masina) o;
        return masina.getMarca().equals(this.marca) && masina.getModel().equals(this.model) && masina.getKilometrii()==this.kilometrii;
    }

    @Override
    public int compareTo(Masina o) {

         if(this.kilometrii>o.kilometrii){
              return  1;
         }else if(this.kilometrii==o.kilometrii){
             return 0;
         }else{
             return -1;
         }

    }
}
