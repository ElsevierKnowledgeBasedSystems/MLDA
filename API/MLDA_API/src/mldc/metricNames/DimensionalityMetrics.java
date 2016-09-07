package mldc.metricNames;

/**
* Class storing the dimensionality metrics names
*
* @author Jose Maria Moyano Murillo
*/
public class DimensionalityMetrics {
	
	/**
	 * Get the names of the available dimensionality metrics
	 * 
	 * @return An array with the names
	 */
	public static String[] getAvailableMetrics(){
		String [] metrics = new String[6];
		
		metrics[0] = "Attributes";
		metrics[1] = "Instances";
		metrics[2] = "Labels";
		metrics[3] = "Distinct labelsets";
		metrics[4] = "LxIxF";
		metrics[5] = "Ratio of number of instances to the number of attributes";
		
		return metrics;
	}

}
