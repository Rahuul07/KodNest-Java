
public class ElecticityBill {

    public static void main(String[] args) {

        String customerName = "rahul";
        int unitsConsumed = 350;

        double bill = 0;
        double surcharge = 0;
        double totalBill = 0;

        if (unitsConsumed <= 0) {

            System.out.println("Invalid units");

        } else {

            if (unitsConsumed <= 100) {
                bill = unitsConsumed * 2;
            } else if (unitsConsumed <= 200) {
                bill = unitsConsumed * 3;
            } else if (unitsConsumed <= 300) {
                bill = unitsConsumed * 5;
            } else {
                bill = unitsConsumed * 7;
            }

            if (bill > 1000) {
                surcharge = bill * 0.05;
            }

            totalBill = bill + surcharge;

            System.out.println("Customer Name: " + customerName);
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.println("Electricity Bill: Rs." + bill);
            System.out.println("Surcharge: Rs." + surcharge);
            System.out.println("Total Bill: Rs." + totalBill);

        }
    }
}
