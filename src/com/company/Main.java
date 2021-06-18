package com.company;
import autoOffice.Human;
import autoOffice.Buyer;
import autoOffice.Seller;
import cars.Car;
import cars.Diesel;
import cars.Electric;
import cars.LPG;

public class Main {

    public static void main(String[] args) {

       Car Audi = new Diesel("Audi", "RS6", 60000.0, 2011);
       Car Golf = new Diesel("Volkswagen", "Golf_6", 15000.0, 2010);
       Car Alfa = new Diesel("AlfaRomeo", "159", 13000.0, 2011);
       Car Porsche = new LPG("Porsche","911", 40000.0,2013);
       Car Citroen = new LPG("Citroen", "C4", 14000.0, 2008);
       Car Toyota = new Electric("Toyota","Corolla", 30000.0, 2015);
       Car Toyota2 = new Electric("Toyota", "Auris", 20000.0, 2014);
       Car Nissan = new LPG("Nissan","Juke", 25000.0, 2012);

       Human Mirek = new Seller("Mirek","Trader",40,300000.0, 20);
       Human Zdzichu = new Buyer("Zdzichu", "This",29, 15000.0, 3);
       Human Darek = new Buyer("Darek","Him",49, 10000.0, 1);
       Human Krystynka = new Buyer("Krystynka", "Nice", 20, 45000.0, 4);
       Human Alan = new Buyer("Alan","Type", 22,80000.0, 3);


        Mirek.setCar(Mirek.garage,Audi.ownerList,Mirek,Audi);
        Mirek.setCar(Mirek.garage,Golf.ownerList,Mirek,Golf);
        Mirek.setCar(Mirek.garage,Alfa.ownerList,Mirek,Alfa);
        Mirek.setCar(Mirek.garage,Porsche.ownerList,Mirek,Porsche);
        Mirek.setCar(Mirek.garage,Citroen.ownerList,Mirek,Citroen);
        Mirek.setCar(Mirek.garage,Toyota.ownerList,Mirek,Toyota);
        Mirek.setCar(Mirek.garage,Toyota2.ownerList,Mirek,Toyota2);
        Mirek.setCar(Mirek.garage,Nissan.ownerList,Mirek,Nissan);

        System.out.println("List of Mirek car: "+ Mirek.garage);
       System.out.println("Good morning, which car You be interested?");
       Alfa.sell(Mirek, Zdzichu);

        System.out.println("List of Mirek car: "+ Mirek.garage);
        System.out.println("Good morning, which car You be interested?");
       Citroen.sell(Mirek, Darek);

        System.out.println("List of Mirek car: "+ Mirek.garage);
        System.out.println("Good morning, which car You be interested?");
       Porsche.sell(Mirek, Krystynka);

        System.out.println("List of Mirek car: "+ Mirek.garage);
        System.out.println("Good morning, which car You be interested?");
       Audi.sell(Mirek, Alan);

        System.out.println("This is good day for Miras. Miras is happy :)");
       System.out.println(Mirek.getCash());
    }
}
