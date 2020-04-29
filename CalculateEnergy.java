/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class CalculateEnergy {
    static int partitionEnergy1;
    static int partitionEnergy2;
    static int partitionEnergy3;
 
    public void setPart1(int a) {
        partitionEnergy1 = a;
    }
    public void setPart2(int b) {
        partitionEnergy2 = b;
    }
    public void setPart3(int c) {
        partitionEnergy3 = c;
    }
    
    public int getPart1() {
        return partitionEnergy1;
    }
    public int getPart2() {
        return partitionEnergy2;
    }
    public int getPart3() {
        return partitionEnergy3;
    }
    public static double getEfficiency(int actualEnergy, int totalEnergy) {
        System.out.println("actual power " + actualEnergy + " total power " + totalEnergy);
        double e = (double)actualEnergy / (double)totalEnergy;
        System.out.println("Efficiency is = " + e);
        return (e * 100);
    }

    public double findFileEnergy(int size, String partitionName) {
        if(partitionName.equals("Partition1"))
            return ((double)size * partitionEnergy1);
        else if(partitionName.equals("Partition2"))
            return ((double)size * partitionEnergy2);
        else
            return ((double)size * partitionEnergy3);
    }

    /*
     * This method is used to calculate the amount of power consumed when
     */
    public static double calculateSleepingPower(int partitionEnegry) {
        return (partitionEnegry * 0.25);
    }

    /*
     * This method is used to calculate the electricity bill when number of units
     * is passed as parameter
     */
    public static double costIncured(int powerConsumed) {
        // Link where electricty bill calculation was seen 
        //http://chdengineering.gov.in/pages/elex.htm
        double per150Cost = 5.0;
        double per250Cost = 5.30;
        double perAbove = 5.60;
        double dutyCost = 0.11;
        
        double normalCost;
        double execiseDutyCost = powerConsumed * dutyCost;
 
        if (powerConsumed <= per150Cost) {
            normalCost = (powerConsumed * per150Cost);
        } else if (powerConsumed > per150Cost && powerConsumed <= 400) {
            normalCost =  (150 * per150Cost) + ((powerConsumed - 150) * per250Cost);
        } else {
            normalCost = (150 * per150Cost) + (250 * per250Cost) + ((powerConsumed - 400) * perAbove);
        }
        return normalCost + execiseDutyCost;
    }
 
    /*
     * this method calculates the cost of idleSever which is on all the time.
     */
    public static double idlePowerConsumptionCost() {
        int avgPower = 850;
        int perDay = avgPower * 24;
        int perYear =  avgPower * 365;
        //average use is 850 watts per hour
        // multiplied by 24 that equals 20,400 watts daily, or 20.4 kilowatts (kWh).
        // Multiply that by 365 days a year for 7,446 kWh per year. 
        double costForDay = costIncured(perDay);
        return costForDay;
    }

    /*
     * power consumption at each partition in watts (joules/sec)
     */
    public static double powerAtEachPartition(int partitionEnergy) {
        return (partitionEnergy / 3600);
    }
}
