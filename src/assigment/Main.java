package assigment;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        Card johnCard= new Bronze(new User("John","Dou"), 100);
        johnCard.purchase(100);

        Card smithCard = new Silver(new User("Smith","Jonson"), 600);
        smithCard.purchase(850);

        Card maxCard= new Gold(new User("Max","Payne"), 1500);
        maxCard.purchase(1300);

        List<Card> cards= Arrays.asList(johnCard, smithCard, maxCard);

        cards.forEach(Card::printInfo);
    }
}
