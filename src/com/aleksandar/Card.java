package com.aleksandar;

public abstract class Card
{
    private User user;
    private double previousMonthTurnover;
    private double initialDiscountRate;

    public Card(User user, double previousMonthTurnover){
        this.user= user;
        this.previousMonthTurnover= previousMonthTurnover;
    }

    public abstract double calculateDiscountRate();


    public void purchase(double purchaseValue){

        double theDiscountRate= calculateDiscountRate();
        double theDiscount= calculatePurchaseDiscount(purchaseValue, theDiscountRate);

        System.out.printf("Purchase value: $%.2f\n", purchaseValue);
        System.out.printf("Discount rate: %.1f%% \n", theDiscountRate);
        System.out.printf("Discount: $%.2f \n", theDiscount);
        System.out.printf("Total: $%.2f \n\n", (purchaseValue- theDiscount));
    }

    private double calculatePurchaseDiscount(double purchaseValue, double discountRate){
        return purchaseValue * discountRate/ 100;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getPreviousMonthTurnover() {
        return previousMonthTurnover;
    }

    public void setPreviousMonthTurnover(double previousMonthTurnover) {
        this.previousMonthTurnover = previousMonthTurnover;
    }

    public double getInitialDiscountRate() {
        return initialDiscountRate;
    }

    public void setInitialDiscountRate(double initialDiscountRate) {
        this.initialDiscountRate = initialDiscountRate;
    }
}
