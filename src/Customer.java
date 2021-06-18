import java.util.ArrayList;

public class Customer {
    private String name;
    private String lastname;
    private int age;
    private String address;
    private int phone;
    ArrayList<Book> booksRental;


    public Customer(String name, String lastname, int age, String address, int phone ) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.booksRental = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void showCustomer(){
        System.out.println(this.getName()+", "+this.getLastname()+", "+this.getPhone());
    }

}
