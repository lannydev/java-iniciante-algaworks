package encapsulamento;

public class Cliente {

    private String firstName;
    private String lastname;
    private String phone;

    public String getName() {
        return firstName + " " + lastname;
    }

    public void setName(String name) {
        String [] fullName = name.split(" ");
        firstName = fullName[0];
        lastname = fullName[1];
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
