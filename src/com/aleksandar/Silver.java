package com.aleksandar;

public class Silver extends Card
{
    public Silver(User user, double previousMonthTurnover) {
        super(user, previousMonthTurnover);
        super.setInitialDiscountRate(2);
    }

    @Override
    public double calculateDiscountRate() {
        return (super.getPreviousMonthTurnover()< 300)? super.getInitialDiscountRate() : 3.5;
    }
}
