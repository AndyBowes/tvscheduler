package uk.jfactory.scheduler;

import io.dropwizard.Configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.validator.constraints.NotEmpty;

import uk.jfactory.scheduler.config.AmazonCredentials;
import uk.jfactory.scheduler.config.QueueDefinition;

public class SchedulerConfiguration extends Configuration {

	@NotEmpty
	private AmazonCredentials amazonCredentials;
	
	@NotEmpty
	private QueueDefinition publishQueue;

	@JsonProperty("amazonCredentials")
	public AmazonCredentials getAmazonCredentials() {
		return this.amazonCredentials;
	}
	
	@JsonProperty("amazonCredentials")
	public void setAmazonCredentials(AmazonCredentials amazonCredentials){
		this.amazonCredentials = amazonCredentials;
	}

	
}
