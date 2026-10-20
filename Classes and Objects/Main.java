class Main {
    public static void main(String[] args) {
        // Using the default constructor
        HotelRoom room1 = new HotelRoom();

        // Using the parameterized constructor
        HotelRoom room2 = new HotelRoom(101, "Deluxe", 2500.00);

        System.out.println("Room 1:");
        room1.displayDetails();

        System.out.println("\nRoom 2:");
        room2.displayDetails();
    }
}


