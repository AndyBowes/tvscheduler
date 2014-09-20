package uk.jfactory.scheduler.messaging;

import io.dropwizard.setup.Environment;

import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;


/**
 * Factory which creates message consumers for a specific Queue on Amazon SQS
 * @author Andy
 */
public class AmazonSqsMessageConsumerFactory {
	
	private final AmazonSQSClient sqsClient;
	private final String queueName;
	
	public AmazonSqsMessageConsumerFactory(AmazonSQSClient sqsClient, String queueName) {
		super();
		this.sqsClient = sqsClient;
		this.queueName = queueName;
		ReceiveMessageRequest request = new ReceiveMessageRequest();
		request.
		this.sqsClient.receiveMessage(request);
	}
	
/*    public MessageQueueConsumer build(Environment environment) {
        MessageQueueClient client = new MessageQueueClient(getHost(), getPort());
        environment.lifecycle().manage(new Managed() {
            @Override
            public void start() {
            }

            @Override
            public void stop() {
                client.close();
            }
        };
        return client;
    }
*/}
