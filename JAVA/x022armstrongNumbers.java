class x022armstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {        
        String number = String.valueOf(numberToCheck);
        int digits = number.length();
        int sum = 0;
        
        for(int i = 0; i < digits; i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            sum += Math.pow(digit, digits);
        }

        return sum == numberToCheck;
    }

}

/*
An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.

For example:

    9 is an Armstrong number, because 9 = 9^1 = 9
    10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
    153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
    154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190

 */