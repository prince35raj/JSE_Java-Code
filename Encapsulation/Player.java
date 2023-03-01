package Encapsulation;

public class Player {
    private String pName;
    private int age;
    private String ganetype;

    public Player(String pName, int age, String ganetype) {

        this.pName=pName;
        this.age=age;
        this.ganetype=ganetype;
    }

    public String getpName() {
        return pName;
    }

    public int getAge() {
        return age;
    }

    public String getGanetype() {
        return ganetype;
    }


    public static void main(String[] args) {
        Player aboj = new Player("Sachin", 40, "cricket");
        String playername = aboj.getpName();
        int playerage = aboj.getAge();
        String playerGameType = aboj.getGanetype();

        System.out.println("Player Name:" + playername);
        System.out.println("Player Age:" + playerage);
        System.out.println("Player Game Type:"+playerGameType);


    }

}

