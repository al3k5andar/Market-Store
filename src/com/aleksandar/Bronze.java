package com.aleksandar;

public class Bronze  extends Card
{
    public Bronze(User user, double previousMonthTurnover) {
        super(user, previousMonthTurnover);
        super.setInitialDiscountRate(0.0);
    }

    @Override
    public double calculateDiscountRate() {
        return ((super.getPreviousMonthTurnover()< 100)
                ? super.getInitialDiscountRate(): (super.getPreviousMonthTurnover()<= 300)
                ? 1.0 : 2.5);
    }
}
