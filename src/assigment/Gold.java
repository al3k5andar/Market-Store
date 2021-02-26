package assigment;

public class Gold extends Card
{
//    Max discount value for Gold card
    public final int MAX_RATIO= 10;

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
        return (discount< MAX_RATIO)? discount : MAX_RATIO;
    }

    private int calculateExtraDiscount(){

        int extraDiscount= (int) super.getPreviousMonthTurnover()/ INCREASE_LIMIT;
        if(extraDiscount> MAX_RATIO)
            return MAX_RATIO;

        return extraDiscount;
    }
}
