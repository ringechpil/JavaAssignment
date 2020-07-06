package aleksandar.cvetkovic;

public class Gold extends Silver{

    //defining the constructors

    public Gold() {
        super();
    }

    public Gold(String ownerName) {
        super(ownerName);
    }

    public Gold(double turnover) {
        super(turnover);
    }

    public Gold(String ownerName, double turnover) {
        super(ownerName, turnover);
    }

    //calculating the discount rate
    @Override
    protected double discountRate(double valueOfPurchase){

        if (valueOfPurchase < 0){
            return -1;
        }

        System.out.println("Purchase value: $" + String.format("%.2f", valueOfPurchase));

        double discountR = getInitialDiscountRate();

        discountR += ((int) valueOfPurchase/100)*0.01;

        if (discountR > 0.1){
            discountR =  0.1;
        }

        System.out.println("Discount Rate: " + String.format("%.1f", discountR*100) + "%");
        return discountR;
    }
}
