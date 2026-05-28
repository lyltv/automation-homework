import java.util.Scanner;

public class PersonalIncomeTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập thu nhập hàng năm của ông giáo (VNĐ): ");
        long income = scanner.nextLong(); //
        
        double tax = calculateTax(income);
        
        System.out.printf("Số thuế thu nhập cá nhân phải nộp là: %,.0f VNĐ%n", tax); //
        scanner.close();
    }

    public static double calculateTax(long income) {
        double tax = 0;

        // Mức 1: Thu nhập từ 0 đến 5 triệu đồng (5%)
        if (income <= 5000000) {
            tax = income * 0.05;
        } 
        // Mức 2: Thu nhập từ 5 đến 10 triệu đồng (10%)
        else if (income <= 10000000) {
            tax = (5000000 * 0.05) + (income - 5000000) * 0.10;
        } 
        // Mức 3: Thu nhập từ 10 đến 18 triệu đồng (15%)
        else if (income <= 18000000) {
            tax = 750000 + (income - 10000000) * 0.15; // 750k là tổng thuế mức 1+2
        } 
        // Mức 4: Thu nhập từ 18 đến 32 triệu đồng (20%)
        else if (income <= 32000000) {
            tax = 1950000 + (income - 18000000) * 0.20; // 1.95tr là tổng thuế mức 1+2+3
        } 
        // Mức 5: Thu nhập từ 32 đến 52 triệu đồng (25%)
        else if (income <= 52000000) {
            tax = 4750000 + (income - 32000000) * 0.25;
        } 
        // Mức 6: Thu nhập từ 52 đến 80 triệu đồng (30%)
        else if (income <= 80000000) {
            tax = 9750000 + (income - 52000000) * 0.30;
        } 
        // Mức 7: Thu nhập trên 80 triệu đồng (35%)
        else {
            tax = 18150000 + (income - 80000000) * 0.35;
        }

        return tax; //
    }
}
