package hu.mak.inheritanceMethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private String name;
    private BigDecimal unitWeight;
    private int numberOfDecimals;

    public String getName() {
        return name;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public Product(String name, BigDecimal unitWeight, int numberOfDecimals) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Product(String name, BigDecimal unitWeight) {
        this(name, unitWeight, 2);
    }

    public BigDecimal totalWeight(int pieces){
        return unitWeight.multiply(new BigDecimal(pieces)).setScale(numberOfDecimals, RoundingMode.HALF_UP);
    }


}
