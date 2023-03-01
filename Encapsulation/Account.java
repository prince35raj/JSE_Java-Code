package Encapsulation;

public class Account
{
    private long Ac_number;
    private String Name;
    private String Email;
    private float Ammount;

    public long getAc_number() {
        return Ac_number;
    }

    public void setAc_number(long ac_number) {
        this.Ac_number = ac_number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public float getAmmount() {
        return Ammount;
    }

    public void setAmmount(float ammount) {
        this.Ammount = ammount;
    }
}


