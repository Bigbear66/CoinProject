// Penny.java
// Eldin Pita
// CSCI 1302
// Project 2
// 03/05/2020


public class Penny extends Coin{

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public Penny() {
        super.setName(Coin.PENNY);
    }

    public Penny(String name) {
        super(name);
    }

    @Override
    public int getValue() {
        // TODO Auto-generated method stub
        return value;
    }

}