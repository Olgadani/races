public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.5);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmw = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4);
        Bus ikarus = new Bus("Ikarus", "123",3);
        Bus paz = new Bus("Paz", "4251", 2.4);
        Bus uaz = new Bus("Uaz", "542", 3);
        Bus sobol = new Bus("Sobol", "Business", 1.5);
        Truck man = new Truck("Man", "", 7.2);
        Truck kamaz = new Truck("Kamaz", "", 5.6);
        Truck zil = new Truck("Zil", "", 6.6);
        Truck iveko = new Truck("Iveko", "", 7.2);
        lada.pitStop();
        audi.pitStop();
        bmw.pitStop();
        kia.pitStop();
        lada.bestTime();
        audi.bestTime();
        bmw.bestTime();
        kia.bestTime();
        lada.maxSpeed();
        audi.maxSpeed();
        bmw.maxSpeed();
        kia.maxSpeed();
        man.maxSpeed();
        man.bestTime();
        man.pitStop();
        kamaz.pitStop();
        kamaz.maxSpeed();
        kamaz.bestTime();
        ikarus.bestTime();
        ikarus.pitStop();
        ikarus.maxSpeed();
        DriverB alex = new DriverB("Alex", "B", 5, lada);
        DriverC bob = new DriverC("Bob", "C", 7, man);
        DriverD jack = new DriverD("Jack", "D", 4, ikarus);
        alex.printing();
        bob.printing();
        jack.printing();
    }
}