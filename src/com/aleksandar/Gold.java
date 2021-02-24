package com.aleksandar;

public class Gold extends Card
{
    public Gold(User user, double previousMonthTurnover) {
        super(user, previousMonthTurnover);
        super.setInitialDiscountRate(2);
    }

    @Override
    public double calculateDiscountRate() {
        return 2+ calculateExtraDiscount();
    }

    private int calculateExtraDiscount(){
        int discountGrow= 0;
        double previousTurnover= super.getPreviousMonthTurnover();

        while (previousTurnover > 0) {
            previousTurnover-= 100;
            discountGrow++;
            try {
                if (discountGrow> 8)
                    throw new RuntimeException();
            }
            catch (Exception e){
                return 8;
            }
        }
        return discountGrow;
    }
}
