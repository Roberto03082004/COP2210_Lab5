package app;
import cooling.AC;
import buildingunit.Room;
import building.House;
public class Controller {

    public static void main(String[] args){
        AC.acStats();

        //Step 6
        Room kitchen = new Room("Kitchen", "White", 15.5, 10.0, 78.0);
        kitchen.roomStats("");

        //Step 7

        Room livingRoom = new Room("Living Room", "Tan", 25.0, 20.7, 76.5);
        livingRoom.roomStats("");

        Room bathRoom = new Room("Bathroom", "White", 15.0, 10.0, 74.30);
        bathRoom.roomStats("");

        Room bedRoom = new Room("Bedroom", "Blue", 8.0, 8.0, 78.0);
        bedRoom.roomStats("");

        //Step 9
        House myHouse = new House(kitchen, livingRoom, bathRoom, bedRoom);
        myHouse.displayInfo();

        System.out.println("----------------------------------------------------------------");
        System.out.println("What is the house total square feet: " + myHouse.getHouseSquareFeet());
        System.out.println("----------------------------------------------------------------");
        System.out.println();

        //-----------------------------------------------------------------------------------
        AC.acStats();
        //-----------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------

        System.out.println("----------------------------------------------------------------");
        System.out.println("Call by Value " );
        System.out.println("----------------------------------------------------------------");

        AC.changeTemperatureDown(livingRoom.getTemperature(), 5 );

        livingRoom.roomStats("");

        AC.changeTemperatureDown(myHouse.getKitchen().getTemperature(), 3 );

        myHouse.getKitchen().roomStats("");

        AC.acStats();

        //-----------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------

        System.out.println("----------------------------------------------------------------");
        System.out.println("Call by Reference");
        System.out.println("----------------------------------------------------------------");
        System.out.println();

        AC.changeTemperatureDown(livingRoom, 5);

        livingRoom.roomStats("");

        AC.changeTemperatureDown(myHouse.getKitchen(), 3);
        myHouse.getKitchen().roomStats("");

        AC.acStats();




    }//end of main


}//end of Controller
