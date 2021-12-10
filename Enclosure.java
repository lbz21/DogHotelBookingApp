public class Enclosure {
    private Dog dogDetails;
    private int daysIn, enclosureNum;
    private double price;
    private Boolean occupied;



    public Enclosure(){}

    public Enclosure(int enclosureNum, Dog dogDetails, int daysIn, double price, Boolean occupied){
        this.enclosureNum = enclosureNum;
        //this.dogDetails = new Dog(dogDetails.getDogName(), dogDetails.getDogAge(), dogDetails.getOwnerName(), dogDetails.getBreed(), dogDetails.getGeneralNotes() , dogDetails.getGender());
        this.dogDetails = dogDetails;
        this.daysIn = daysIn;
        this.price = price;
        this.occupied = occupied;
    }

    public Boolean getOccupied(){
        return this.occupied;
    }

    public void setOccupied(Boolean occupied){
        this.occupied = occupied;
    }

    public int getEnclosureNum(){
        return this.enclosureNum;
    }

    public void setEnclosureNum(int enclosureNum){
        this.enclosureNum = enclosureNum;
    }


    public Dog getDogDetails() {
        return this.dogDetails;
    }

    public void setDogDetails(Dog dogDetails) {
        this.dogDetails = dogDetails;
    }

    public int getDaysIn() {
        return this.daysIn;
    }

    public void setDaysIn(int daysIn) {
        this.daysIn = daysIn;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Kennel ID: " + getEnclosureNum() + " | Dogs Name: " + dogDetails.getDogName() + " | Dog Age: " + dogDetails.getDogAge() + " | Breed: " + dogDetails.getBreed() + " | Dog's Gender: " + dogDetails.getGender() + " | Notes about Dog: " + dogDetails.getGeneralNotes() + " | Dog's Owner Name: " + dogDetails.getOwnerName() + " | Total Days in Enclosure: " + getDaysIn() + " | Enclosure Price: " + getPrice() + " | Enclosure Occupied: " + getOccupied();

    }

}
