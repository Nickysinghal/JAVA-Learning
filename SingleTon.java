public class SingleTon {
    public static void main(String[] args) {
        Car car1 = Car.createObject("thar", "mahindra", "petrol");
        Car car2 = Car.createObject("thar2", "mahindra2", "petrol2");
        Car car3 = Car.createObject("thar3", "mahindra3", "petrol3");

        System.out.println(car1.name);
        System.out.println(car2.name);
        System.out.println(car3.name);
    }
}

class Car {
    static Car obj = null;
    String name;
    String brand;
    String fuel;

    private Car(String name, String brand, String fuel) {
        this.name = name;
    }

    static Car createObject(String name, String brand, String fuel) {
        if (obj == null) {
            obj = new Car(name, brand, fuel);
        }
        return obj;

    }
    // Car(String x,String brand,String fuel){
    // name=x;
    // }
}

// class Car{
// String _name;
// String brand;
// String fuel;

// Car(String name,String brand,String fuel){
// _name=name;
// }

// }
