package com.nw.internbu3.hw2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercise {

    public static double exercise1(double value) {
        return value * 0.0254;
    }

    public static String exercise2(long minutes) {
        long years = minutes / (60 * 24 * 365); // 1 năm có 525600 phút
        long remainingDays = (minutes % (60 * 24 * 365)) / (60 * 24); // Số ngày còn lại
        return years + " years and " + remainingDays + " days";
    }

    /**
     * Bài 3
     *
     * @param number
     * @return
     */
    public static String analyzeAndSortDigits(long number) {
        // Nếu là số âm, lấy giá trị tuyệt đối
        number = Math.abs(number);

        String numStr = String.valueOf(number);
        int length = numStr.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (digits[j] > digits[j + 1]) {
                    int temp = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = temp;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(digits[i]);
            if (i < length - 1) {
                result.append(",");
            }
        }

        return result.toString();
    }

    /**
     * Bài 4
     */
    public static void speedCalculator(){
        Scanner scanner = new Scanner(System.in);

        // Nhập dữ liệu từ người dùng
        System.out.print("Nhập quãng đường (m): ");
        double distance = Double.parseDouble(scanner.nextLine());
        if (distance <0){
            return;
        }
        System.out.print("Nhập số giờ: ");
        int hours = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập số phút: ");
        int minutes = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập số giây: ");
        int seconds = Integer.parseInt(scanner.nextLine());

        // Tính tổng thời gian (tính bằng giây)
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        // Kiểm tra tránh chia cho 0
        if (totalSeconds <= 0) {
            System.out.println("Thời gian không hợp lệ! Không thể tính tốc độ.");
            return;
        }

        // Tính tốc độ
        double speedMetersPerSecond = distance / totalSeconds;
        double speedKilometersPerHour = (distance * 3.6) / totalSeconds;

        // Hiển thị kết quả với 8 chữ số thập phân
        System.out.printf("Tốc độ m/s: %.8f%n", speedMetersPerSecond);
        System.out.printf("Tốc độ km/h: %.8f%n", speedKilometersPerHour);

        scanner.close();
    }

    /**
     * Bai 6
     */
    public static void bankInterestCalculator(){
        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền gốc
        System.out.print("Nhập số tiền gửi (P): ");
        BigDecimal principal = scanner.nextBigDecimal();

        System.out.print("Nhập lãi suất hàng năm (%): ");
        BigDecimal annualRate = scanner.nextBigDecimal().divide(BigDecimal.valueOf(100));

        System.out.print("Nhập số năm gửi (n): ");
        int years = Integer.parseInt(scanner.nextLine());

        BigDecimal onePlusRate = BigDecimal.ONE.add(annualRate);
        BigDecimal amount = principal.multiply(onePlusRate.pow(years));

        amount = amount.setScale(2, RoundingMode.HALF_UP);

        // In kết quả
        System.out.println("Số tiền sau " + years + " năm: " + amount + " VND");

        scanner.close();
    }

    public static void main(String[] args) {
        //Bài 1
        System.out.println(exercise1(10));
        //Bài 2
        System.out.println(exercise2(102312435));
        //Bài 3
        System.out.println(analyzeAndSortDigits(-123232));
        //Bài 4
        speedCalculator();
        //Bài 7
        bankInterestCalculator();
    }
}
