package hu.mak.methodstructure;

public class Pendrive {
    private String name;
    private double capacity;
    private double price;

    public Pendrive(String name, double capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent){
        this.price += price * percent/100;
    }

    public int comparePricePerCapacity(Pendrive otherPendrive){
        double ppThisPendrive = this.price / this.capacity;
        double ppOtherPendrive = otherPendrive.price / otherPendrive.capacity;
        if(ppThisPendrive > ppOtherPendrive){
            return 1;
        }
        else if(ppOtherPendrive > ppThisPendrive){
            return -1;
        }
        else {
            return 0;
        }
    }

    boolean cheaperThan(Pendrive otherPendrive){
        if (this.price < otherPendrive.price){
            return true;
        }
        else {
            return false;
        }
    }


    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
