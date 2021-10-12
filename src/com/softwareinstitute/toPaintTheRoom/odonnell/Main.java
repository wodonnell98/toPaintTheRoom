package com.softwareinstitute.toPaintTheRoom.odonnell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        /*System.out.print("Please enter shape of room: Choose 1 for cuboid and 2 for cylindrical: ");
        int roomShape = reader.nextInt();
        String shape;
        switch (roomShape){
            case 1: shape = "Cuboid";
                    System.out.println("Cuboid room selected");
                    cuboidRoom();
            case 2: shape = "Cylindrical";
                System.out.println("Cylindrical room selected");





        public static void cuboidRoom(String[] args) {*/


        System.out.print("Please enter length of room: ");
        int askLength = reader.nextInt();
        System.out.println("Length is: " + askLength);

        System.out.print("Please enter width of room: ");
        int askWidth = reader.nextInt();
        System.out.println("Width is: " + askWidth);

        System.out.print("Please enter length of room: ");
        int askHeight = reader.nextInt();
        System.out.println("Height is: " + askHeight);

        int surfaceArea = (askLength * askWidth) + 2*(askLength * askHeight) + 2*(askWidth * askHeight);
        System.out.println("Surface Area is" + " " + surfaceArea);

        double totalLitresNeeded = (double)surfaceArea / 6  ; //assume coverage of 6L/m^2
        //int litresRounded = (int)litresceil;
        System.out.println("Volume is" + " " + totalLitresNeeded + " litres");

        System.out.print("Please enter litres of paint per can: ");
        double askLitresPerCan = reader.nextDouble();
        System.out.println("Volume per can is: " + askLitresPerCan + "L");

        double numberOfCans = totalLitresNeeded / askLitresPerCan;

        System.out.print("Please enter cost per paint can: ");
        double pricePerCan = reader.nextDouble();
        System.out.println("Price is is: " + pricePerCan);

        //double paintCansNumber = numberOfCans ;
        double roundedNumberOfCans = Math.ceil(numberOfCans);
        System.out.println("Rounded number of cans: " + roundedNumberOfCans);

        int totalPrice = (int)(roundedNumberOfCans * pricePerCan);
        System.out.println("Total Paint Price is: " + totalPrice);

        System.out.print("Please enter decorator price: ");
        double decoratorPrice = reader.nextDouble();
        System.out.println("Decorator Price is: " + decoratorPrice);

        double sumPrice = totalPrice + decoratorPrice;
        System.out.println("Total Price is: " + sumPrice);
    }


}
