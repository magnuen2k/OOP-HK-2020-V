public class Plumber extends Worker {
    private double plumbingMaterials = 0d;
    public Plumber(String fName, String lName, Address address, int idNumber, double hours, double rate){
        super(fName, lName, address, idNumber, hours, rate);
    }

    public void setPlumbingCost(double amount){
        plumbingMaterials = amount;
    }

    public String doWork(){
        return "Install plumbing";
    }

    @Override
    public String toString(){
        return "Plumber: " + super.toString() + "\n" + doWork();
    }

    public double calculatePay(){
        return hoursWorked * hourlyRate + plumbingMaterials;
    }
}
