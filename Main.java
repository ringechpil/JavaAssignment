package aleksandar.cvetkovic;

public class Main {

    public static void main(String[] args) {

        //default bronze card with the zero monthly turnover and a purchase of 150$
        Bronze bronzeCard = new Bronze();
        bronzeCard.totalPurchaseValue(150);

        System.out.println("----------------------------------------");

        //silver card with 600$ monthly turnover and a purchase of 850$
        Silver silverCard = new Silver(600);
        silverCard.totalPurchaseValue(600, 850);

        System.out.println("----------------------------------------");

        //gold card with 1500$ monthly turnover and a purchase of 1300$
        Gold goldCard = new Gold(1500);
        goldCard.totalPurchaseValue(1300);





    }















}






