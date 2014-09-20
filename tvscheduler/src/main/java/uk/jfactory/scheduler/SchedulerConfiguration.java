package uk.jfactory.scheduler;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class SchedulerConfiguration extends Configuration {

	@NotEmpty
	private String amazonKey;

	@JsonProperty
	public String getAmazonKey() {
		return amazonKey;
	}

	@JsonProperty
	public void setAmazonKey(String amazonKey) {
		this.amazonKey = amazonKey;
	}
	
}
