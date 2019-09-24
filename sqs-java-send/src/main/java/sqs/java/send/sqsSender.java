package sqs.java.send;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.AmazonSQSException;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import java.util.Date;
import java.util.List;

public class sqsSender {
    public static void sender(int number){
        String queueUrl = "https://sqs.us-west-2.amazonaws.com/999798490139/QueueA";
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();

        SendMessageRequest send_msg_request = new SendMessageRequest()
                .withQueueUrl(queueUrl)
                .withMessageBody("hello world" + number)
                .withDelaySeconds(5);
        sqs.sendMessage(send_msg_request);
    }
}
