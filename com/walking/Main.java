package com.walking;

public class Main {
    private static void printCounters(Counter[] arrayCounters){
        for (Counter counter: arrayCounters) {
            System.out.println(counter);
        }
    }

    public static void main(String[] args) {
        CounterService counterService = new CounterService();
        Counter gazCounter = new Counter("Газ", "кубический метр", 10);
        Counter elecCounter = new Counter("Электричество", "кВт");
        elecCounter.setValue(10);
        Counter hotWater = new Counter("Горячая вода", "литр", 1);

        counterService.addCounter(gazCounter);
        counterService.addCounter(elecCounter);
        counterService.addCounter(hotWater);

        counterService.incValueCounter("Газ");
        counterService.incValueCounter("Газ", 5);

        Counter hotWater2 = counterService.getCounterByName("Электричество");
        counterService.resetValueCounter(hotWater2);
        System.out.println(hotWater2);

        counterService.incValueCounter(hotWater2);

        Counter arrayCounter[] = counterService.getArrayCounters();

        printCounters(arrayCounter);

    }
}
