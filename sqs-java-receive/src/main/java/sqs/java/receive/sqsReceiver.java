package sqs.java.receive;

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

public class sqsReceiver {
    public static void receiver(){

        String queueUrl = "https://sqs.us-west-2.amazonaws.com/999798490139/QueueA";
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();

        // receive messages from the queue
        List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();


        // delete messages from the queue
        for (Message m : messages) {
            System.out.println(m.getBody());
            sqs.deleteMessage(queueUrl, m.getReceiptHandle());
        }
    }
}
