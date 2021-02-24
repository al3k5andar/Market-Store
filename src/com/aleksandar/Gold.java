package com.aleksandar;

public class Gold extends Card
{
    public Gold(User user, double previousMonthTurnover) {
        super(user, previousMonthTurnover);
        super.setInitialDiscountRate(2);
    }

    @Override
    public double calculateDiscountRate() {
        return 2+ discountHelper();
    }

    private int discountHelper(){
        int discountGrow= 0;
        double pmtLabel= super.getPreviousMonthTurnover();

        while (pmtLabel > 0) {
            pmtLabel-= 100;
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
