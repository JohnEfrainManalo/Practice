class HotelRoom {
    private int roomNumber;
    private double pricePerStay;
    private boolean isOccupied;
    private String roomType;

    // --- CONSTRUCTORS ---

    // Constructor 1: Default constructor
    public HotelRoom() {
        this(0, "Standard", 1000.00);
    }

    // Constructor 2: Room number only
    public HotelRoom(int roomNumber) {
        this(roomNumber, "Standard", 1000.00);
    }

    // Constructor 3: Room number and room type
    public HotelRoom(int roomNumber, String roomType) {
        this(roomNumber, roomType, 1500.00);
    }

    // Constructor 4: All parameters
    public HotelRoom(int roomNumber, String roomType, double pricePerStay) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerStay = pricePerStay;
    }

    // --- GETTERS ---

    public double getPricePerStay() {
        return pricePerStay;
    }

    // --- CHECK-IN METHODS (OVERLOADED) ---

    // No parameters
    public void checkIn() {
        if (!isOccupied) {
            isOccupied = true;
            System.out.println("Guest checked in.");
        } else {
            System.out.println("Room is already occupied.");
        }
    }

    // One parameter: Guest Name
    public void checkIn(String guestName) {
        if (!isOccupied) {
            isOccupied = true;
            System.out.println(guestName + " checked in to Room " + roomNumber);
        } else {
            System.out.println("Room is already occupied.");
        }
    }

    // Two parameters: Guest Name and Length of Stay
    public void checkIn(String guestName, int stay) {
        if (!isOccupied) {
            isOccupied = true;
            System.out.println(guestName + " checked in to Room " + roomNumber);
            System.out.println("Stay: " + stay);
            System.out.println("Total: Php " + (pricePerStay * stay));
        } else {
            System.out.println("Room is already occupied.");
        }
    }

    // --- DISPLAY METHODS ---

    // Display room details
    public void displayDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price per Stay: Php " + pricePerStay);
    }
}
