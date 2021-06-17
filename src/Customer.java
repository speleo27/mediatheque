public class Customer {
    private String name;
    private String lastname;
    private int age;
    private String adress;
    private int phone;


    public Customer(String name, String lastname, int age, String adress, int phone) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
