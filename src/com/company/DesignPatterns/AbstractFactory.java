package com.company.DesignPatterns;

public class AbstractFactory {

    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.Mini,Location.India));

        System.out.println(CarFactory.buildCar(CarType.Mini,Location.Usa));

        System.out.println(CarFactory.buildCar(CarType.Mini,Location.Japan));
    }
}

enum CarType{
    Micro,Mini,Luxury
}
enum Location{
   India,Usa,Japan
}

abstract class Car{
CarType cartype;
Location location;

    public Car(CarType cartype,Location location){
     this.cartype = cartype;
     this.location = location;
    }

    abstract void consruct();

    @Override
    public String toString() {
        return "Cartype: " + cartype + " and Car Location is :" + location;
    }
}

class LuxuryCar extends Car{

    public LuxuryCar(Location location){
        super(CarType.Luxury,location);
    }

    @Override
    void consruct() {
     System.out.println("calling luxury car");
    }
}
class MiniCar extends Car{
     public MiniCar(Location location){

     super(CarType.Mini,location);

     }

    @Override
    void consruct() {
        System.out.println("calling Mini car");
    }
}

class MicroCar extends Car{

    public MicroCar(Location location){
    super(CarType.Micro,location);
    }

    @Override
    void consruct() {
        System.out.println("calling Micro CAR");
    }
}
//Child Factory
class IndianFactory{

    static Car buildCar(CarType cartype){

        Car car = null;

        switch(cartype){

            case Mini:
                car = new MiniCar(Location.India);
                break;
            case Micro:
                car = new MicroCar(Location.India);
                break;
            case Luxury:
                car = new LuxuryCar(Location.India);
                break;
        }

        return car;
    }
}
//Child Factory
class UsaFactory{

    static Car buildCar(CarType cartype){

        Car car = null;

        switch(cartype){

            case Mini:
                car = new MiniCar(Location.Usa);
                break;
            case Micro:
                car = new MicroCar(Location.Usa);
                break;
            case Luxury:
                car = new LuxuryCar(Location.Usa);
                break;
        }

        return car;
    }
}
//Child Factory
class JapanFactory{

    static Car buildCar(CarType cartype){

        Car car = null;

        switch(cartype){

            case Mini:
                car = new MiniCar(Location.Japan);
                break;
            case Micro:
                car = new MicroCar(Location.Japan);
                break;
            case Luxury:
                car = new LuxuryCar(Location.Japan);
                break;
        }

        return car;
    }
}

//Parent Factory
class CarFactory{

    static Car buildCar(CarType cartype,Location location) {
        Car car = null;
        switch(location){
            case India:
                car = IndianFactory.buildCar(cartype);
                break;
            case Usa:
                car = UsaFactory.buildCar(cartype);
                break;
            case Japan:
                car = JapanFactory.buildCar(cartype);
                break;
        }
        return car;
    }

}


