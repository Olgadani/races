import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.5);
        lada.addSponsor(new Sponsor("Test", 150000));
        lada.addMechanic(new Mechanics<Car>("Test", "Test","Test"));
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
        service(
                kia, lada, audi, bmw, kamaz, man, zil, iveko, ikarus, paz, uaz, sobol
        );
        List<Transport> transports = List.of(kia, lada, audi, bmw, kamaz, man, zil, iveko, ikarus, paz, uaz, sobol);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(lada);
        serviceStation.addTruck(kamaz);
        serviceStation.service();
        serviceStation.service();

        System.out.println("Task 2");
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        add("Владимир", queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        remove(queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);

        System.out.println("Task 3");
        example();

    }

    public static void service(Transport... transports) {
        for (int i = 0; i < transports.length; i++) {
            if (!transports[i].service()) {
                try {
                    throw new RuntimeException("Автомобиль " + transports[i].getMark()  + " диагностику не прошел");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;
    public final static List<String> NAMES = List.of("Иван", "Николай", "Галина", "Олеся", "Ирина", "Сергей", "Алексей", "Петр", "Лариса", "Лера");

    private static void add(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() < queue2.size() && queue1.size() < MAX_SIZE) {
            queue1.offer(name);
        } else if (queue2.size() < queue1.size() && queue2.size() < MAX_SIZE) {
            queue2.offer(name);
        } else {
            System.out.println("Нужно позвать Галю");
        }
    }

    private static void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    public static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, (i + j) % 2 != 0 ? "*" : "◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }


}