// Nickle.java
// Eldin Pita
// CSCI 1302
// Project 2
// 03/05/2020


public class Nickle extends Coin{

    private int value=1;

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nickle() {
        super.setName(Coin.NICKLE);
    }

    public Nickle(String name) {
        super(name);
    }

    @Override
    public int getValue() {
        // TODO Auto-generated method stub
        return value;
    }

}