package assigment;

public class Gold extends Card
{
//    Max discount value for Gold card
    public final int MAX_RADIO= 10;

//    Initial discount value for Gold card
    public static final double IDR= 2.0;

//    Limit for increasing extra discount
    public final int INCREASE_LIMIT= 100;

    public Gold(User user, double previousMonthTurnover) {
        super(user, previousMonthTurnover, IDR);
    }

    @Override
    public double calculateDiscountRate() {
        double discount= super.getInitialDiscountRate()+ calculateExtraDiscount();
        return (discount< MAX_RADIO)? discount : MAX_RADIO;
    }

    private int calculateExtraDiscount(){

        int extraDiscount= (int) super.getPreviousMonthTurnover()/ INCREASE_LIMIT;
        if(extraDiscount> MAX_RADIO)
            return MAX_RADIO;

        return extraDiscount;
    }
}
