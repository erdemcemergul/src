package day31_Constructors.tasks.Adress;

public class adress {
    String buildingNumber, street, city, state, zipCode;


    public adress(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return
                 buildingNumber + '\t'+
              street + '\n' +
              city + '\t' +
               state +", " +
                zipCode
                ;
    }
}
