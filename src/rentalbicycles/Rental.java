/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalbicycles;

/**
 *
 * @author Esteban Callegaro
 */
public class Rental{

   
    /**
     * Calculation of the final price x quantity of bicycles  
     * @param quantityBicycles
     * @param hour
     * @param day
     * @param week 
     * @return  
     */
    public double Rental(int quantityBicycles, int hour, int day, int week){
        double price;
        double total;
        if(quantityBicycles >= 3){
            //price per hour, day or week -30%
            price = quantityBicycles * (rentalxHour(hour) + rentalxDay(day) + rentalxWeek(week));
            total = price - price * (PriceEnum.PROMO.getValue()/100);
        }else{
            total = quantityBicycles * (rentalxHour(hour) + rentalxDay(day) + rentalxWeek(week));
        }
        return total;
    }

    public double rentalxHour(int hours) {
        return hours * PriceEnum.HOUR.getValue();
    }

    public double rentalxDay(int days) {
        return days * PriceEnum.DAY.getValue();
    }

    public double rentalxWeek(int weeks) {
        return weeks * PriceEnum.WEEK.getValue();
    }
   
}
