package assigment;

public class Bronze  extends Card
{
//    All limits for discount for Bronze card
    public final int LOW_LIMIT= 100;
    public final int MID_LIMIT= 300;

//    All discount ratios for Bronze card
    public final double MID_RATIO= 1.0;
    public final double HIGH_RATIO= 2.5;

//    Initial discount rate for Bronze card
    public static final double IDR= 0.0;

    public Bronze(User user, double previousMonthTurnover) {
        super(user, previousMonthTurnover,IDR);
    }

    @Override
    public double calculateDiscountRate() {
        return ((super.getPreviousMonthTurnover()< LOW_LIMIT)
                ? super.getInitialDiscountRate(): (super.getPreviousMonthTurnover()<= MID_LIMIT)
                ? MID_RATIO : HIGH_RATIO);
    }
}
