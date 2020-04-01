import java.time.LocalDate;
import java.util.ArrayList;

public class ContractorTest {
    public static void main(String[] args) {
        Address client1 = new Address("Gata 2", "Et Sted", "Enda et sted", "2332");
        Address client2 = new Address("Gata 3", "Kult sted", "Et morsomt sted", "4422");

        LocalDate startTimeClient1 = LocalDate.parse("2019-12-22");
        LocalDate endTimeClient1 = LocalDate.parse("2020-01-12");
        Project project1 = new Project("Motion Lights", "Petter Kultetternavn", client1, startTimeClient1, endTimeClient1);

        LocalDate startTimeClient2 = LocalDate.parse("2019-11-02");
        LocalDate endTimeClient2 = LocalDate.parse("2020-03-23");
        Project project2 = new Project("House", "Johan Test", client2, startTimeClient2, endTimeClient2);

        Address elecAddress = new Address("Gata 5", "Byen", "BS", "2320");
        Address carpAddress = new Address("Gata 6", "Byen" , "BS", "2320");
        Address plumAddress = new Address("40", "Gata", "Byen", "BS", "2320");

        Worker elec = new Electrician("Marcus", "TheElectrician", elecAddress, 4021, 23, 20);
        Worker carp = new Carpenter("Jonas", "TheCarpenter", carpAddress, 4361, 25, 19);
        Worker plum = new Plumber("Eric", "ThePlumber", plumAddress, 4021, 30, 21);

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(elec);
        workers.add(carp);
        workers.add(plum);
        ((Electrician)elec).setWiringCost(3200);
        ((Carpenter)carp).setLumberCosts(2000);
        ((Plumber)plum).setPlumbingCost(2750);
        project1.addWorkers(workers);
        project1.setOverhead(.18);

        System.out.printf(project1.toString(), project1.getName(), project1.getTotalCost(), project1.getOverhead());
        System.out.println("*********************************************" + "\n *********************************************");

        workers.remove(plum);
        workers.remove(carp);
        ((Electrician)elec).setWiringCost(300);
        workers.get(0).setHoursWorked(20);
        project2.addWorkers(workers);
        //System.out.printf(project2.toString(), project2.getName(), project2.getTotalCost(), project2.getOverhead());

        if (project2.compareTo(project1) < 0){
            System.out.println("\nThe " + project2.getName() + " project is " + "scheduled before " + project1.getName());
        } else {
            System.out.println("\nThe " + project1.getName() + " project is " + "scheduled prior to " + project2.getName());
        }
        System.out.println("\n");
        // project2.printPayRoll();
    }
}
