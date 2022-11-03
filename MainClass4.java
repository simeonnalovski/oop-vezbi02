package oop.fikt.vezhbi02;
public class MainClass4 {
    public static void main(String[] args){
        Avtomobil prv= new Avtomobil();
        prv.marka="Ford";
        prv.model="Focus";
        prv.pominati_kilometri="198.000";

      System.out.println("Markata na prviot avtomobil e "+prv.marka);
      System.out.println("Modelot na prviot avtomobil e "+prv.model);
      System.out.println("Pominati kilometri na prviot avtomobil - "+prv.pominati_kilometri);
        Avtomobil vtor= new Avtomobil("A4","Audi","200.000");
       System.out.println("Markata na vtoriot element e "+vtor.marka);
       System.out.println("Modelot na prviot avtomobil e "+vtor.model);
      System.out.println("Pominati kilometri na prviot avtomobil - "+vtor.pominati_kilometri);

    }
    
}
