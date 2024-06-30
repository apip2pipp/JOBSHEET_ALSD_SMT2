public class Discount {
    public static double calculateDiscount(double totalPrice) {
        double discount = 0.0;

        if (totalPrice >= 1000) {
            discount = 0.2 * totalPrice; // 20% discount for total price >= 100
        } else if (totalPrice >= 500) {
            discount = 0.1 * totalPrice; // 10% discount for total price >= 50
        }

        return discount;
    }
}