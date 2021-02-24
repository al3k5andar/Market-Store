package com.aleksandar;

public class Main
{
    public static void main(String[] args) {

        User john= new User("John","Dou");
        Card johnCard= new Bronze(john, 150);
        johnCard.purchase(100);

        User smith= new User("Smith","Jonson");
        Card smithCard = new Silver(smith, 600);
        smithCard.purchase(850);

        User max= new User("Max","Payne");
        Card maxCard= new Gold(max, 800);
        maxCard.purchase(1300);
    }
}
