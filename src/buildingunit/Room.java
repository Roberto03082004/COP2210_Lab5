package buildingunit;

public class Room {

    private String type;
    private String color;
    private double length;
    private double width;
    private double temperature;

    public Room(String type, String color, double length, double width, double temperature){
        this.type = type;
        this.color = color;
        this.length = length;
        this.width = width;
        this.temperature = temperature;

    }//end of Room constructor

    public String getType(){
        return type;
    }//end of getType
    public void setType(String type){
        this.type = type;
    }//end of setType

    public String getColor(){
        return color;
    }//end of getColor

    public void setColor(String color){
        this.color = color;
    }//end of setColor
    public double getLength(){
        return length;
    }//end of getLength
    public void setLength(double length){
        this.length = length;
    }//end of setLength
    public double getWidth(){
        return width;
    }//end of getWidth
    public void setWidth(double width){
        this.width = width;
    }//end of setWidth
    public double getTemperature(){
        return temperature;
    }//end of getTemperature
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }//end of setTemperature
    public void roomStats(String tabs){
        System.out.println(tabs + "----------------------------------------------------------------");
        System.out.println(tabs + "Room Stats: \t\t" + type);
        System.out.println(tabs + "----------------------------------------------------------------");
        System.out.println(tabs + "Type: \t\t\t\t" + type);
        System.out.println(tabs + "Color: \t\t\t\t" + color);
        System.out.printf("%stemperature:\t\t%.2f\n", tabs, temperature);
        System.out.printf("%slength:\t\t\t\t%.2f\n", tabs, length);
        System.out.printf("%swidth:\t\t\t\t%.2f\n", tabs, width);
        System.out.printf("%sSquare feet:\t\t%.2f\n", tabs, calculateSquareFeet());
        System.out.println();
    }//end of roomStats
    private double calculateSquareFeet(){
        return length * width;
    }//end of calculateSquareFeet




}//end of Room
