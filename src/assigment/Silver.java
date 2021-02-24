package assigment;

public class Silver extends Card
{
//    Low limit for discount
    public final int LOW_LIMIT= 300;

//    High discount value for purchase above LOW_LIMIT
    public final double HIGH_RATE= 3.5;

//    Initial discount ratio for Silver card
    public static final double IDR= 2.0;

    public Silver(User user, double previousMonthTurnover) {
        super(user, previousMonthTurnover, IDR);
    }

    @Override
    public double calculateDiscountRate() {
        return (super.getPreviousMonthTurnover()< LOW_LIMIT)? super.getInitialDiscountRate() : HIGH_RATE;
    }
}
