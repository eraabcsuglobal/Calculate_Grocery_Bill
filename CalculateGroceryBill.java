
import java.util.Scanner;  // Import the Scanner class

public class CalculateGroceryBill {
	
	double CalculateWeeklyAverage(double groceryBills[])
	{
		double averageGroceryBill = 0.00;
		double totalGroceryBill = 0.00;
		
		for (int i = 0; i < groceryBills.length; i++)
		{
				totalGroceryBill += groceryBills[i];
		}
		
		averageGroceryBill = totalGroceryBill / 4;
		
		return averageGroceryBill;
	}
	
	double CalculateMonthlyTotal(double groceryBills[])
	{
		double totalGroceryBill = 0.00;
		
		for (int i = 0; i < groceryBills.length; i++)
		{
				totalGroceryBill += groceryBills[i];
		}
		
		return totalGroceryBill;	
	}
	
	double ApplyCoupon(double billAmt, double couponAmt)
	{
		double amtAfterCoupon = 0.00;
		double couponDiscount = 0.00;
		
		couponDiscount = billAmt * couponAmt;
		
		amtAfterCoupon = billAmt - couponDiscount;
		
		return amtAfterCoupon;
		
	}
	
	public static void main(String args[])
	{
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.print("Enter coupon amount: ");
		
		double couponAmt = scannerObj.nextDouble();
		
		if (couponAmt > 1 || couponAmt <= 0)
		{
			couponAmt = .10;
			
		}
		
		double groceryBills[] = new double[4];
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print("Enter week " + i + " grocery bill: ");
			double groceryBill = scannerObj.nextDouble();
			
			groceryBills[i] = groceryBill;
		}
		
		CalculateGroceryBill calculateBill = new CalculateGroceryBill();
		
		double weeklyAverage = calculateBill.CalculateWeeklyAverage(groceryBills);
		double monthlyTotal = calculateBill.CalculateMonthlyTotal(groceryBills);
		
		System.out.println("Weekly Average: " + weeklyAverage);
		System.out.println("Monthly total: " + monthlyTotal);
		
		double weeklyAverageWithCoupon = calculateBill.ApplyCoupon(weeklyAverage, couponAmt);
		double monthlyTotalWithCoupon = calculateBill.ApplyCoupon(monthlyTotal, couponAmt);
		
		// with coupons
		System.out.println("Weekly average with coupon: " + weeklyAverageWithCoupon);
		System.out.println("Monthly total with coupon: " + monthlyTotalWithCoupon);
		
	}

}
