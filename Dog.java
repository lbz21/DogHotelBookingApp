public class Dog {

  // these are the instance variables and the basic data information
  private String dogName; // attributes of the dog class
  private String ownerName;
  private String generalNotes;
  private Integer dogAge;
  private String breed;
  private String gender;

  public Dog() {
  }

  // the constructor constructor
  public Dog(String dogName, int dogAge, String ownerName, String breed, String generalNotes, String gender) {
    this.dogName = dogName;
    this.ownerName = ownerName;
    this.generalNotes = generalNotes;
    this.dogAge = dogAge;
    this.breed = breed;
    this.gender = gender;
  }

  public String getDogName() {
    return this.dogName;
  }

  public void setDogName(String dogName) {
    this.dogName = dogName;
  }

  public String getOwnerName() {
    return this.ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getGeneralNotes() {
    return this.generalNotes;
  }

  public void setGeneralNotes(String generalNotes) {
    this.generalNotes = generalNotes;
  }

  public Integer getDogAge() {
    return this.dogAge;
  }

  public void setDogAge(Integer dogAge) {
    this.dogAge = dogAge;
  }

  public String getBreed() {
    return this.breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
