package FirstClass;

public class Counter {
    protected String name;
    protected int conut;

    public Counter(String name, int conut){
        this.name = name;
        this.conut = conut;
    }
    public Counter(String name){
        this.name = name;
        this.conut = 0;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setConut(int count){
        this.conut = count;
    }
    public String getName() {
        return this.name;
    }
    public int getConut(){
        return this.conut;
    }
    public int inc(){
        return ++this.conut;
    }
    public int dec(){
        return --this.conut;
    }



}
