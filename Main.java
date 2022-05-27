package com.metanit;
abstract class Transpotation{
    public abstract IDeliveryMethod createTransport();
}
class SeaFactory extends Transpotation{
    public Boat createTransport() {
        return new Boat();
    }
}
class RoadFactory extends Transpotation{
    public Car createTransport() {
        return new Car();
    }
}
class AirFactory extends Transpotation{
    public Airplane createTransport() {
        return new Airplane();
    }
}
abstract class IDeliveryMethod{
    public abstract void getInfo();
}
class Boat extends IDeliveryMethod{
    @Override
    public void getInfo() {
        System.out.println("Лодка");
    }
}
class Airplane extends IDeliveryMethod{
    @Override
    public void getInfo() {
        System.out.println("Самолет");
    }
}
class Car extends IDeliveryMethod {
    @Override
    public void getInfo() {
        System.out.println("Машина");
    }
}
public class Main {

    public static void main(String[] args) {
        Transpotation airplane = new AirFactory();
        Transpotation boat = new SeaFactory();
        Transpotation car = new RoadFactory();
        IDeliveryMethod samolet = airplane.createTransport();
        IDeliveryMethod lodka = boat.createTransport();
        IDeliveryMethod mashina = car.createTransport();
        samolet.getInfo();
        lodka.getInfo();
        mashina.getInfo();
    }
}