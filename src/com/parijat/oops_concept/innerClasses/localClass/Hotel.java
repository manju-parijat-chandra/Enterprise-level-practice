package com.parijat.oops_concept.innerClasses.localClass;

public class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms){
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){
        // Class Inside Method
        class ReservationValidator{

            // Method inside the class
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name Can't be Empty");
                    return false;
                }
                if(numOfRooms < 0){
                    System.out.println("Number of Rooms should be Positive");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms){
                    System.out.println("Not Enough Rooms Available");
                    return false;
                }

                return true;
            }
        }

        // Able to create Object of Reservation Validator Class
        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()) {
            reservedRooms += numOfRooms;
            System.out.println("Reservation Successful for " + guestName + " for " + numOfRooms + " rooms.");
        }else{
            System.out.println("Reservation Failed");
        }
    }

}
