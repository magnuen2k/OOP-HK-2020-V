public class Electrician extends Worker {
    private double wiringCost = 0.0d;
    public Electrician(String fName, String lName, Address address, int idNumber, double hours, double rate){
        super(fName, lName, address, idNumber, hours, rate);
    }

    public void setWiringCost(double amount){
        wiringCost = amount;
    }

    public String doWork(){
        return "install electrical components";
    }

    @Override
    public String toString(){
        return "Electrician: " + super.toString() + "\n" + doWork();
    }
    public double calculatePay(){
        return hoursWorked * hourlyRate + wiringCost;
    }
}
