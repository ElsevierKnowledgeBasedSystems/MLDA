package mldc.metricNames;

/**
* Class storing the attribute metrics names
*
* @author Jose Maria Moyano Murillo
*/
public class AttributesMetrics {
	
	/**
	 * Get the names of the available attributes metrics
	 * 
	 * @return An array with the names
	 */
	public static String[] getAvailableMetrics(){
		String [] metrics = new String[12];
		
		metrics[0] = "Average absolute correlation between numeric attributes";
		metrics[1] = "Average gain ratio";
		metrics[2] = "Mean of entropies of nominal attributes";
		metrics[3] = "Mean of mean of numeric attributes";
		metrics[4] = "Mean of standard deviation of numeric attributes";
		metrics[5] = "Number of binary attributes";
		metrics[6] = "Number of nominal attributes";
		metrics[7] = "Number of numeric attributes";
		metrics[8] = "Proportion of binary attributes";
		metrics[9] = "Proportion of nominal attributes";
		metrics[10] = "Proportion of numeric attributes";
		metrics[11] = "Proportion of numeric attributes with outliers";
		
		return metrics;
	}

}
