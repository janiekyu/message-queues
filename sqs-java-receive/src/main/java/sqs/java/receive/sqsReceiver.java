package sqs.java.receive;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

import com.amazonaws.services.sqs.model.Message;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.lambda.runtime.events.SQSEvent.SQSMessage;
import java.util.Date;
import java.util.List;

public class sqsReceiver implements RequestHandler<SQSEvent, Void>{

    @Override
    public Void handleRequest(SQSEvent event, Context contex){

        String queueUrl = "https://sqs.us-west-2.amazonaws.com/999798490139/QueueC";
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();

        // receive messages from the queue
        List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();


        // delete messages from the queue

        for(SQSMessage msg : event.getRecords()){
            System.out.println(new String(msg.getBody()));
        }

        return null;
    }
}
