
public class EstimateLog {

	
	public static double estimateLog(double x) {
		double result = 0;
		int n = 1;
		
		do {
			result = result + (Math.pow(-1, n+1)*((Math.pow(x, n)/n)));
			n = n + 1;

		} while(Math.abs(Math.log(1+x)-result)>.0001);
		System.out.println(result);
		return n-1;
		
	}
	
	public static void main(String[] args) {	
		double[] range =   {0,.1,.2,.3,.4,.5,.6,.7,.8,.9};
		for (int i = 0; i < range.length; i++) {
			  double result = estimateLog(range[i]);
			  System.out.println("ln(" + (1+range[i]) + ") is " + Math.log(1+range[i]));
			  System.out.println("It requires " + result + " iterations to estimate ln(" + (1+range[i]) + ") within .0001");
			}
		
	}
	
}
