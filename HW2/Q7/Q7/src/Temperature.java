
public class Temperature {
	private float temperature;		//save temperature
	private char scale;				//save scale
	
	//constructor
	public Temperature() {
		temperature = 0;
		scale = 'C';
	}
	
	public Temperature(float temperature) {
		this.temperature = temperature;
		scale = 'C';
	}
	
	public Temperature(char scale) {
		temperature = 0;
		this.scale = scale;
	}
	
	public Temperature(float temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	//two accessor method
	public float getemperatureC() {
		
		if(scale == 'C') {
			return temperature;
		}else {
			return 5*(temperature-32)/9;
		}	
	}
	
	public float getemperatureF() {
		
		if(scale == 'F') {
			return temperature;
		}else {
			return 9*(temperature/5)+32;
		}	
	}
	
	// three mutator method
	public void setValue(float temperature) {
		this.temperature = temperature;
	}
	
	public void setScale(char scale) {
		this.scale = scale;
	}
	public void setall(float temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	//three comparison
	public boolean equals(Temperature othertemperature) {
		if(scale == 'C') {
			if(temperature == othertemperature.getemperatureC()) {
				return true;
			} else return false;
				
		}else {
			if(temperature == othertemperature.getemperatureF()) {
				return true;
			} else return false;
				
		}
	}
	
	public boolean greater(Temperature othertemperature) {
		if(scale == 'C') {
			if(temperature > othertemperature.getemperatureC()) {
				return true;
			}else return false;
		}else {
			if(temperature > othertemperature.getemperatureF()) {
				return true;
			}else return false;
		}
		
	}
	
	public boolean less(Temperature othertemperature) {
		if(scale == 'C') {
			if(temperature < othertemperature.getemperatureC()) {
				return true;
			}else return false;
		}else {
			if(temperature < othertemperature.getemperatureF()) {
				return true;
			}else return false;
		}
		
	}
	
	public String tostring() {
		return temperature + "degrees " + scale;
	}
}
