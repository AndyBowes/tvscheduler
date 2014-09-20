package uk.jfactory.scheduler.config;

import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AmazonCredentials {

	@NotEmpty
	private String accessKeyId;
	
	@NotEmpty
	private String secretKey;

	@JsonProperty
	public String getAccessKeyId() {
		return accessKeyId;
	}

	@JsonProperty
	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}

	@JsonProperty
	public String getSecretKey() {
		return secretKey;
	}

	@JsonProperty
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	
}
