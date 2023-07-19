package building;
import buildingunit.Room;

public class House {

    private Room kitchen;
    private Room livingRoom;
    private Room bedroom;
    private Room bathroom;

    public House(Room kitchen, Room livingRoom, Room bedroom, Room bathroom){
        this.kitchen = kitchen;
        this.livingRoom = livingRoom;
        this.bedroom = bedroom;
        this.bathroom = bathroom;

    }//end of House constructor

    public Room getKitchen(){
        return kitchen;
    }//end of getKitchen
    public Room getLivingRoom(){
        return livingRoom;
    }//end of getLivingRoom
    public Room getBedroom(){
        return bedroom;
    }//end of getBedroom
    public Room getBathRoom(){
        return bathroom;
    }//end of getBathRoom
    public void displayInfo(){

        System.out.println("----------------------------------------------------------------");
        System.out.println("House DisplayInfo");
        System.out.println("----------------------------------------------------------------");

        kitchen.roomStats("\t");
        System.out.println();
        livingRoom.roomStats("\t");
        System.out.println();
        bedroom.roomStats("\t");
        System.out.println();
        bathroom.roomStats("\t");
        System.out.println();

    }//end of displayInfo
    public double getHouseSquareFeet(){
        return calculateHouseSquareFeet();
    }//end of getHouseSquareFeet
    private double calculateHouseSquareFeet(){
        return kitchen.getLength() * kitchen.getWidth() + livingRoom.getLength() * livingRoom.getWidth() + bedroom.getLength() * bedroom.getWidth() + bathroom.getLength() * bathroom.getWidth();
    }//end of calculateHouseSquareFeet

}
