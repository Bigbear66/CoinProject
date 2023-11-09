// Dime.java
// Eldin Pita
// CSCI 1302
// Project 2
// 03/05/2020


public class Dime extends Coin{

    private int value=1;

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public Dime() {
        super.setName(Coin.DIME);
    }

    public Dime(String name) {
        super(name);
    }

    @Override
    public int getValue() {
        // TODO Auto-generated method stub

        return value;
    }

}