package JAVA;

public class x009salaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold*bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        final int base = 1000;
        double total = base*salaryMultiplier(daysSkipped)+bonusForProductsSold(productsSold);

        return total > 2000 ? 2000 : total;
    } 
}

/*
In this exercise, you'll be implementing rules for calculating the total salary of an employee in a month. The International Siderurgy Company (ISC) requires assistance in calculating employee salaries, considering various factors that can impact the final wage.

You have three tasks, and you should use the ternary operator instead of if/else statements to implement them:

1. Implement the salaryMultiplier method, which returns the salary multiplier based on the number of days an employee skipped work. Apply a 15% penalty if the employee skipped at least five days.

2. Implement the bonusMultiplier and bonusForProductsSold methods. The ISC pays ten monetary units for each product sold, and if an employee sells twenty products or more, the multiplier improves to thirteen. bonusMultiplier should determine which multiplier to apply, and bonusForProductSold should return the total bonus in monetary units.

3. Implement the finalSalary method. It should multiply the base salary of 1000.00 by the salary multiplier, add the bonus, and return the result. However, salaries should be capped at 2000.00.
 */