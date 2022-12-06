package day31_Constructors.tasks.salary;

public class salaryCalculator {
    double hourlyRate;
    double stateTaxRate;
    double federalTaxRate;
    int weeklyHours;

    public salaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        return hourlyRate*weeklyHours*52;

    }
    public double stateTax(){

        return salary()*stateTaxRate;
    }
    public double federalTaxRate(){

        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary()-federalTaxRate()-stateTax();


    }


    public String toString() {
        return "salaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", salary= $" + salary() +
                ", stateTaxRate=$" + stateTax() +
                ", federalTaxRate=$" + federalTaxRate()+
                ", salary after tax= $" + salaryAfterTax() +
                '}';
    }
}
