	package chapter2;

public class ArrayUtil {
	public static int[] doubleToInt(double[] d) {
		int[] result = new int[d.length];
		for(int i = 0; i < d.length; i++) {
			result[i] = (int)d[i];
		}
		return result;
	}

	public static double[] intToDouble(int[] i) {
		double[] result = new double[i.length];
		for(int j = 0; j < i.length; j++) {
			result[j] = i[j];
		}
		return result;
	}
	
	public static int[] concat(int[] i, int[] j) {
		int[] result = new int[i.length + j.length];
		
		int index = 0;
		
		for(int val : i) {
			result[index++] = val;
		}

		for(int val : j) {
			result[index++] = val;
		}
		
		return result;
	}
}
