import java.util.Scanner;
public class LoanEx_with_Scanner {

	public static void main(String[] args) {
		Scanner kpReader = new Scanner(System.in);
		System.out.print("What's the loan amount?($)");
		int loanAmount = kpReader.nextInt(); 
		System.out.print("What's the loan length?(years)");
		int loanLength = kpReader.nextInt();
		System.out.print("What's the interest rate?(%)");
		double interestRate = kpReader.nextInt();
	
		int p = loanAmount;
		int n = loanLength*12;
		double yearRate = interestRate/100;
		double r = yearRate/12;
		double a = p*(r*(Math.pow((1+r),n)))/(Math.pow((1+r),n)-1);
		double monthlyPayment = round(a,2);
		System.out.println("The monthly payment for a $"+loanAmount+" loan will take over "+loanLength+" years at an anual percantage rate of "+interestRate+" % is "+monthlyPayment);
		
		}
	private static double round (double x, int i){
		int y = (int) (Math.round(x*(Math.pow(10, i))));
		return(double) y / (Math.pow(10, i));
	}}