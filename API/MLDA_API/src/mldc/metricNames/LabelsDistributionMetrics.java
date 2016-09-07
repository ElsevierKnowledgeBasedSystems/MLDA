package mldc.metricNames;

/**
* Class storing the labels distribution metrics names
*
* @author Jose Maria Moyano Murillo
*/
public class LabelsDistributionMetrics {

	/**
	 * Get the names of the available labels distribution metrics
	 * 
	 * @return An array with the names
	 */
	public static String[] getAvailableMetrics(){
		String [] metrics = new String[6];
		
		metrics[0] = "Cardinality";
		metrics[1] = "Density";
		metrics[2] = "Maximal entropy of labels";
		metrics[3] = "Mean of entropies of labels";
		metrics[4] = "Minimal entropy of labels";
		metrics[5] = "Standard deviation of label cardinality";
		
		return metrics;
	}

}
