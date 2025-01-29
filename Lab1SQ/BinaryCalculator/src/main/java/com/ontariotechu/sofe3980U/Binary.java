package com.ontariotechu.sofe3980U;

/**
 * Unsigned integer Binary variable
 */
public class Binary {
    private String number = "0";  // string containing the binary value '0' or '1'

    public Binary(String number) {
        if (number == null || number.isEmpty()) {
            this.number = "0"; 
            return;
        }
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (ch != '0' && ch != '1') {
                this.number = "0"; 
                return;
            }
        }
        int beg;
        for (beg = 0; beg < number.length(); beg++) {
            if (number.charAt(beg) != '0') {
                break;
            }
        }
        this.number = (beg == number.length()) ? "0" : number.substring(beg);
    }

    public String getValue() {
        return this.number;
    }

    public static Binary add(Binary num1, Binary num2) {
        int ind1 = num1.number.length() - 1;
        int ind2 = num2.number.length() - 1;
        int carry = 0;
        String num3 = "";
        while (ind1 >= 0 || ind2 >= 0 || carry != 0) {
            int sum = carry;
            if (ind1 >= 0) {
                sum += (num1.number.charAt(ind1) == '1') ? 1 : 0;
                ind1--;
            }
            if (ind2 >= 0) {
                sum += (num2.number.charAt(ind2) == '1') ? 1 : 0;
                ind2--;
            }
            carry = sum / 2;
            sum = sum % 2;
            num3 = ((sum == 0) ? "0" : "1") + num3;
        }
        return new Binary(num3);
    }

    /**
     * Perform bitwise OR operation on two binary numbers.
     */
    public Binary or(Binary other) {
        int maxLength = Math.max(this.number.length(), other.number.length());
        String a = String.format("%" + maxLength + "s", this.number).replace(' ', '0');
        String b = String.format("%" + maxLength + "s", other.number).replace(' ', '0');
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            result.append((a.charAt(i) == '1' || b.charAt(i) == '1') ? '1' : '0');
        }
        return new Binary(result.toString());
    }

    /**
     * Perform bitwise AND operation on two binary numbers.
     */
    public Binary and(Binary other) {
        int maxLength = Math.max(this.number.length(), other.number.length());
        String a = String.format("%" + maxLength + "s", this.number).replace(' ', '0');
        String b = String.format("%" + maxLength + "s", other.number).replace(' ', '0');
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            result.append((a.charAt(i) == '1' && b.charAt(i) == '1') ? '1' : '0');
        }
        return new Binary(result.toString());
    }

    /**
     * Multiply two binary numbers.
     */
    public Binary multiply(Binary other) {
        int a = Integer.parseInt(this.number, 2);
        int b = Integer.parseInt(other.number, 2);
        int product = a * b;
        return new Binary(Integer.toBinaryString(product));
    }
}