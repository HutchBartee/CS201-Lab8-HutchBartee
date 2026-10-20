import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


class Main {
    public static void main(String[] args) {
        
        //create an arraylist of instrument objects
        ArrayList<Instrument> inventory = new ArrayList<>();

        //set input for menu choices
        Scanner scanner = new Scanner(System.in);
        String inputFile  = "instrument.csv";
        String errorFile  = "error.txt";
        String reportFile = "report.txt";

        //readFile will open & close error file
        InventoryManager.readFile(inputFile, errorFile, inventory);
        System.out.print("Inventory loaded: " + inventory.size() + " items.\n");

        //try to open the output file for the report 
        try (PrintWriter writer = new PrintWriter(new FileWriter(reportFile))) {
            int choice = 0;
            //print the menu & stay in loop until '4' is chosen
            //add logic (switch?) to choose which function to do based on input
            while(choice != 4){
                System.out.print("\nWelcome to the Instrument Database\n" +
                                    "Your choices are:\n" +
                                    "1. List All Instruments\n" +
                                    "2. Find Specific Instruments\n" +
                                    "3. List All Instruments for a Manufacturer\n" +
                                    "4. Exit\n" +
                                    "Enter choice: ");
                choice = scanner.nextInt();
                if(choice == 1){
                    InventoryManager.listInstruments(inventory,writer);
                }
            }
            scanner.close();
        
        } catch (IOException e) {
            System.err.println("Could not write report: " + e.getMessage());
        }
    }
}
