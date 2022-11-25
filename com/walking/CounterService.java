package com.walking;

public class CounterService {
    private static Counter arrayCounters[];

    public CounterService(){}
    public CounterService(Counter counter) {
        addCounter(counter);
    }
    void addCounter(Counter counter){
        int length = 0;
        if (arrayCounters != null) {
            length = arrayCounters.length;
        }

        Counter newArray[] = new Counter[length + 1];
        for (int numCounter = 0; numCounter < length; numCounter++) {
            newArray[numCounter] = arrayCounters[numCounter];
        }
        newArray[length] = counter;
        arrayCounters = newArray;
    }
    public Counter[] getArrayCounters(){
        return arrayCounters;
    }
    public Counter getCounterByName(String name){
        Counter counterResult = null;
        for (Counter counter: arrayCounters) {
            String counterName = counter.getName();
            if (counterName == name){
                counterResult = counter;
            }
        }
        if (counterResult == null) {
            System.out.println("Счетчик с именем " + name + " не найден!");
        }
        return counterResult;
    }
    public void incValueCounter(Counter counter, float value){
        counter.setValue(counter.getValue() + value);

    }
    public void incValueCounter(String name, float value){
        Counter counter = getCounterByName(name);
        if (counter != null){
            counter.setValue(counter.getValue() + value);
        }
    }
    public void incValueCounter(String name){
        Counter counter = getCounterByName(name);
        if (counter != null){

            counter.setValue(counter.getValue() + 1);
        }
    }
    public void incValueCounter(Counter counter){
        counter.setValue(counter.getValue() + 1);

    }
    public void resetValueCounter(String name){
        Counter counter = getCounterByName(name);
        if (counter != null){
            counter.setValue(0);
        }
    }
    public void resetValueCounter(Counter counter){
        counter.setValue(0);

    }


}
