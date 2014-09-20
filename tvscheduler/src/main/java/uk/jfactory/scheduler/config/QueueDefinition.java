package uk.jfactory.scheduler.config;

import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class QueueDefinition {
	
	private static final int DEFAULT_READ_SIZE = 1;
	private static final int DEFAULT_WAIT_TIME = 10;
	private static final int DEFAULT_VISIBILITY_TIMEOUT = 60;
	
	@NotEmpty
	private String queueUrl;
	
	private Integer readBatchSize = DEFAULT_READ_SIZE;
	private Integer waitTime = DEFAULT_WAIT_TIME;
	private Integer visibilityTimeout = DEFAULT_VISIBILITY_TIMEOUT;
	
	@JsonProperty
	public String getQueueUrl() {
		return queueUrl;
	}

	@JsonProperty
	public void setQueueUrl(String queueUrl) {
		this.queueUrl = queueUrl;
	}

	@JsonProperty
	public Integer getReadBatchSize() {
		return readBatchSize;
	}
	
	@JsonProperty
	public void setReadBatchSize(Integer readBatchSize) {
		this.readBatchSize = readBatchSize;
	}

	@JsonProperty
	public Integer getWaitTime() {
		return waitTime;
	}

	@JsonProperty
	public void setWaitTime(Integer waitTime) {
		this.waitTime = waitTime;
	}

	@JsonProperty
	public Integer getVisibilityTimeout() {
		return visibilityTimeout;
	}

	@JsonProperty
	public void setVisibilityTimeout(Integer visibilityTimeout) {
		this.visibilityTimeout = visibilityTimeout;
	}
	
}
