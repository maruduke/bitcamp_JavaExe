package pb3;

public class ArrayUtility {
	
	public static double[] intToDouble(int[] source) {
		double[] response = new double[source.length];
		
		for(int i=0; i< source.length; i++) {
			response[i] = (double) source[i];
		}
		return response;
	}
	
	public static int[] doubleToInt(double[] source) {
		int[] response = new int[source.length];
		
		for(int i=0; i< source.length; i++) {
			response[i] = (int) source[i];
		}
		return response;
		
	}
}
