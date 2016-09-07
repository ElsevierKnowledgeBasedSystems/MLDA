package mldc.metricNames;

/**
* Class storing the imbalance metrics names
*
* @author Jose Maria Moyano Murillo
*/
public class ImbalanceMetrics {
	
	/**
	 * Get the names of the available imbalance metrics
	 * 
	 * @return An array with the names
	 */
	public static String[] getAvailableMetrics(){
		String [] metrics = new String[14];
		
		metrics[0] = "CVIR inter class";
		metrics[1] = "Kurtosis cardinality";
		metrics[2] = "Max IR inter class";
		metrics[3] = "Max IR intra class";
		metrics[4] = "Max IR per labelset";
		metrics[5] = "Mean of IR inter class";
		metrics[6] = "Mean of IR intra class";
		metrics[7] = "Mean of IR per labelset";
		metrics[8] = "Mean of kurtosis";
		metrics[9] = "Mean of skewness of numeric attributes";
		metrics[10] = "Mean of standard deviation of IR intra class";
		metrics[11] = "Proportion of maxim label combination (PMax)";
		metrics[12] = "Proportion of unique label combination (PUniq)";
		metrics[13] = "Skewness cardinality";
		
		
		return metrics;
	}

}
