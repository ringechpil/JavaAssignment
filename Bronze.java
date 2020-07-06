package aleksandar.cvetkovic;

public class Bronze {
    //defining the class fields; we allow for the turnover to also take negative values;
    private String ownerName = "Petar Petrovitj";
    private double turnover = 0;
    private double initialDiscountRate = 0;

    //defining the constructors
    public Bronze (){
        this(0);
        System.out.println("(Turnover set to zero)");
    }

    public Bronze(String ownerName){
        this(ownerName, 0);
        System.out.println("(Turnover set to zero)");
    }

    public Bronze(double turnover) {
       this("Petar Petrovitj", turnover);
       System.out.println("(Default card owner name assigned)");
    }

    public Bronze(String ownerName, double turnover) {
        this.ownerName = ownerName;
        this.turnover = turnover;
            System.out.println("The customer " + ownerName + " got the card.");
    }


    //defining the methods


    //calculating the discount rate
    protected double discountRate(double valueOfPurchase){

        if (valueOfPurchase < 0){
            return -1;
        }

        System.out.println("Purchase value: $" + String.format("%.2f", valueOfPurchase));

        double discountR = initialDiscountRate;

        if (turnover > 100 && turnover <= 300){
            discountR = 0.01;
        } else if (turnover > 300){
            discountR =  0.025;
        }

        System.out.println("Discount Rate: " + String.format("%.1f", discountR*100) + "%");
        return discountR;
    }

    //calculating the discount
    private double theDiscount(double valueOfPurchase){
        if (valueOfPurchase < 0){
            return -1;
        }

        double discount = valueOfPurchase*discountRate(valueOfPurchase);
        System.out.println("Discount: $" + String.format("%.2f", discount));
        return discount;
    }

    //calculating the final purchase value
    public void totalPurchaseValue(double valueOfPurchase){

        if(valueOfPurchase < 0){
            System.out.println("Invalid purchase value.");
            return;
        }

        double theTotal = valueOfPurchase - theDiscount(valueOfPurchase);
        System.out.println("Total: $" + String.format("%.2f", theTotal));
    }

    public void totalPurchaseValue(double monthlyTurnover, double valueOfPurchase){

        if(valueOfPurchase < 0){
            System.out.println("Invalid purchase value.");
            return;
        }

        setTurnover(monthlyTurnover);
        double theTotal = valueOfPurchase - theDiscount(valueOfPurchase);
        System.out.println("Total: $" + String.format("%.2f", theTotal));
    }


    //the getters and the turnover setter
    public String getOwnerName() {
        return ownerName;
    }

    public double getTurnover() {
        return turnover;
    }

    public double getInitialDiscountRate() {
        return initialDiscountRate;
    }

    protected void setTurnover(double turnover) {
        this.turnover = turnover;
    }

}
