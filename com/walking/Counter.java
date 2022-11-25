package com.walking;

public class Counter {
    private float value;
    private String name;
    private String measure;

    public Counter (String name, String measure, float value){
        this.name = name;
        this.measure = measure;
        this.value = value;
    }
    public Counter (String name, String measure){
        this(name, measure, 0);
    }


    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = this.name.isEmpty() ? this.name: name;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = this.measure.isEmpty() ? this.measure :measure;
    }
    public String toString(){
        return getName() + " :" + getValue();
    }
}
