package mldc.attributes;

import java.util.Set;

import mldc.base.MLDataMetric;
import mulan.data.MultiLabelInstances;
import weka.core.Attribute;

/**
* Class implementing the Number of nominal attributes
*
* @author Jose Maria Moyano Murillo
*/
public class NominalAttributes extends MLDataMetric{

	/**
	 * Constructor
	 */
	public NominalAttributes() {
		super("Number of nominal attributes");
	}
	
	/**
	 * Calculate metric value
	 * 
	 * @param mlData Multi-label dataset to which calculate the metric
	 * @return Value of the metric
	 */
	public double calculate(MultiLabelInstances mlData){
		Set<Attribute> attributeSet = mlData.getFeatureAttributes();
        
        int count = 0;
        
        for(Attribute att : attributeSet){
            if(att.isNominal()){
                count++;
            }
        }
		
		this.value = count;
		return value;
	}

}
