package assigment;

public abstract class Card
{
    private final User user;
    private final double previousMonthTurnover;
    private final double initialDiscountRate;
    private double currentPurchase;

    public Card(User user, double previousMonthTurnover, double initialDiscountRate) {
        this.user = user;
        this.previousMonthTurnover = previousMonthTurnover;
        this.initialDiscountRate = initialDiscountRate;
    }

    public abstract double calculateDiscountRate();

    public double purchase(double purchaseValue){

        try {
            this.currentPurchase= purchaseValue;
            return purchaseValue- calculatePurchaseDiscount(purchaseValue, calculateDiscountRate());
        }
        catch (Exception e){
            return 0;
        }
    }

    public void printInfo(){

        double theDiscountRate= calculateDiscountRate();
        double theDiscount= calculatePurchaseDiscount(currentPurchase, theDiscountRate);

        System.out.printf("Purchase value: $%.2f\n", currentPurchase);
        System.out.printf("Discount rate: %.1f%% \n", theDiscountRate);
        System.out.printf("Discount: $%.2f \n", theDiscount);
        System.out.printf("Total: $%.2f \n\n", (purchase(currentPurchase)));
    }

    private double calculatePurchaseDiscount(double purchaseValue, double discountRate){
        return purchaseValue * discountRate/ 100;
    }

    public double getPreviousMonthTurnover() {
        return previousMonthTurnover;
    }

    public double getInitialDiscountRate() {
        return initialDiscountRate;
    }

}
