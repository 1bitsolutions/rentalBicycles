/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalbicycles;

/**
 *
 * @author ebing
 */
public enum PriceEnum {

    HOUR(5),
    DAY(20),
    WEEK(60),
    PROMO(30);
    
    private double value;

    private PriceEnum(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public static PriceEnum getByValue(double value) {
        for (PriceEnum price : PriceEnum.values()) {
            if (price.getValue() == value) {
                return price;
            }
        }
        return null;
    }

}
