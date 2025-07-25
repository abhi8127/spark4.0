package entity;

public class Customer {
    private int id;
    private String name;
    private String phone;

    public Customer(String name, String phone, int id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "[ Customer id = "+id+", name = "+name+", phone = "+phone+" ]";
    }
}
