// Coin.java
// Eldin Pita
// CSCI 1302
// Project 2
// 03/05/2020


public abstract class Coin {

    private String name;
    public static final String DIME="DIME";
    public static final String NICKLE="NICKLE";
    public static final String PENNY="PENNY";
    public static final String QUARTER="QUARTER";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coin() {

    }

    public Coin(String name) {
        this.name=name;
    }

    public abstract int getValue();

}