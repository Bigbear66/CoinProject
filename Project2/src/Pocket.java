// Pocket.java
// Eldin Pita
// CSCI 1302
// Project 2
// 03/05/2020


import java.util.ArrayList;
import java.util.Iterator;

public class Pocket {

    private ArrayList<Coin> list;


    public ArrayList<Coin> getList() {
        return list;
    }


    public void setList(ArrayList<Coin> list) {
        this.list = list;
    }


    public Pocket() {
        this.list=new ArrayList<Coin>();
        // TODO Auto-generated constructor stub
    }

    public void addCoin(Coin coin){
        this.list.add(coin);
    }

    public void removeCoin(String type){
        ArrayList<Coin> coins = this.list;
        Iterator<Coin> iter = coins.iterator();

        while (iter.hasNext()) {
            Coin coin = iter.next();

            if (coin.getName().equalsIgnoreCase(type))
            {
                iter.remove();
                break;
            }
        }
        this.list=coins;
    }


    public int countCoins(String type)
    {
        int count=0;
        for(Coin c:this.list)
        {
            if(c.getName().equalsIgnoreCase(type))
            {
                count++;
            }
        }
        return count;

    }

    public float totalValue(){
        float d=0; //dimes
        float n=0; //nickles
        float p=0;//pennys
        float q=0;//quarters
        for(Coin c:this.list){
            if(c.getName().equalsIgnoreCase(Coin.DIME))
                d++;
            if(c.getName().equalsIgnoreCase(Coin.NICKLE))
                n++;
            if(c.getName().equalsIgnoreCase(Coin.PENNY))
                p++;
            if(c.getName().equalsIgnoreCase(Coin.QUARTER))
                q++;

        }
        float totalValue = (d*10)+(n*5)+(p)+(q*25); // value in cents

        return totalValue;
    }
}