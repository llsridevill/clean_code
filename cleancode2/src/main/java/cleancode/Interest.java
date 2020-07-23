package cleancode;

public class Interest {
	
	public static double calculateSimpleInterest(double principal, double interest_rate,double time_period) {
		return (principal*interest_rate*time_period)/100;
	}
	
	public static double calculateCompoundInterest(double principal, double interest_rate,double time_period,double times_per_period) {
		return (principal*(Math.pow(1+(interest_rate/times_per_period), times_per_period*time_period)))-principal;
	}
	
}
