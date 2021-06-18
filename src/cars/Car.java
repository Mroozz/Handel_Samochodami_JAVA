package cars;

import autoOffice.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {

    public String producer;
    public String model;
    public Double value;
    public Integer yearOfProduction;

    public ArrayList<Human> ownerList;

    public Car(String producer, String model, Double value, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.value = value;
        this.yearOfProduction = yearOfProduction;
        this.ownerList = new ArrayList<Human>();
    }


    public List<Human> getOwner() {return ownerList; }
    public String getProducer(){ return producer; }
    public String getModel(){ return model; }
    public Double getValue() { return value; }
    public Integer getYear() { return yearOfProduction; }
    public String toString() {
        return producer + " " + model + " " + value + " " + yearOfProduction;
    }



    public boolean firstOwner(){
        if(ownerList.isEmpty()){
            return true;
        }
        return false;
    }

    public boolean youBuyIt(ArrayList<Human> a, Human b){
        if(a.contains(b)){
            return true;
        }
        return false;
    }

    public int howManyOwners(ArrayList<Human> list){
        return list.size();
    }


    public String sell(Human seller, Human buyer) {

        System.out.println("On which place "+ this.getProducer() + " is? Price is: " + this.value +
                "' Select Car and confirm Your choice");

        if (seller.getCar(seller.garage).equals(seller.getCar(seller.garage))) {

            System.out.println(" Mr.Miras, We must check car papers, please remind us on which place car is");}

        if (seller.equals(seller.getCar(seller.garage).getOwner().get(ownerList.size() - 1))) {

            System.out.println("Okay I sell " + this.getProducer() + " But value is " + this.value);

            if (buyer.Cash < this.value) {
                System.out.println("Don't waste my time, damn. Go to work and back with money.");
            } else {
                buyer.Cash -= this.value;
                seller.Cash += this.value;

                System.out.println("Fine, car from place number? Set car place please ;)");
                buyer.garage.add(seller.getCar(seller.garage));

                System.out.println("Sorry I don't hear You. Can You repeat?");
                seller.garage.remove(seller.getCar(seller.garage));

                System.out.println("Okay it is good deal for both off uss");
            }
            ownerList.add(ownerList.size() - 1, buyer);

        } else {
            System.out.println("I never see it before lol");
        }
        return null;

    }
}


