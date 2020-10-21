package hu.mak.inheritanceMethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product {
    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        int numberOfBoxes = pieces / packingUnit;
        if(pieces % (numberOfBoxes*packingUnit) != 0){
            numberOfBoxes++;
        }
        BigDecimal weightOfPackaging = weightOfBox.multiply(new BigDecimal(numberOfBoxes)).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);
        BigDecimal result = weightOfPackaging.add(super.totalWeight(pieces));
        return result;
    }
}
