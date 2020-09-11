package hu.training360.javase.demos;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void raisePrice(int percent){
        this.price += this.price*percent/100;
    }

    public int comparePricePerCapacity(Pendrive other) {
        double ppc = pricePerCapacity();
        double otherPpc = other.pricePerCapacity();
        if (ppc > otherPpc) {
            return 1;
        }
        if (ppc < otherPpc) {
            return -1;
        }
        return  0;
    }

    private double pricePerCapacity() {
        return (double)price/capacity;
    }

    public boolean cheaperThan(Pendrive other) {
        return this.price < other.price;
    }


}
