package autoOffice;

import cars.Car;

import java.util.*;

public class Human {
    public String firstName;
    public String lastName;
    public Integer Age;
    public Double Cash;
    public ArrayList<Car> garage;
    public Integer size;

    public Human(String firstName, String lastName, Integer Age, Double Cash, Integer size) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Age = Age;
        this.Cash = Cash;
        this.size = size;
        this.garage = new ArrayList<Car>(size);
    }

    public Double getCash() { return Cash ;}

    public Car getCar(ArrayList<Car> cars) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return cars.get(i);
    }

    public void setCar(ArrayList<Car> list,ArrayList<Human> carsList, Human human,Car car) {
        if(list.size() < size + 1){
            list.add(0, car);
            carsList.add(0, human); }
        else {
            System.out.println("Garage is full");
        }

    }


    public boolean isArrayFull(ArrayList<Car> array) {
        for (int i = 0; i < array.toArray().length; i++) {
            if(i == array.toArray().length - 1){
                return false;
            }else{
                return true;
            }
        }
        return true;
    }

    public String toString() {
        return firstName + " " + lastName + " " + Age;
    }

}
