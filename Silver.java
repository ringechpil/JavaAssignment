package aleksandar.cvetkovic;

public class Silver extends Bronze{
    //defining the initial discount rate for the silver card;
    private double initialDiscountRate = 0.02;

    //defining the constructors
    public Silver() {
        super();
    }

    public Silver(String ownerName) {
        super(ownerName);
    }

    public Silver(double turnover) {
        super(turnover);
    }

    public Silver(String ownerName, double turnover) {
        super(ownerName, turnover);
    }


    //overriding the discount rate method


    //calculating the discount rate
    @Override
    protected double discountRate(double valueOfPurchase){

        if (valueOfPurchase < 0){
            return -1;
        }

        System.out.println("Purchase value: $" + String.format("%.2f", valueOfPurchase));

        double discountR = initialDiscountRate;

        if (getTurnover() > 300){
            discountR =  0.035;
        }

        System.out.println("Discount Rate: " + String.format("%.1f", discountR*100) + "%");
        return discountR;
    }


    //the initial discount rate getter
    public double getInitialDiscountRate() {
        return initialDiscountRate;
    }


}
