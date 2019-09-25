# LAB 37: SQS & Lambda

## Overview

For this lab, I created 3 Lambda functions that recieves messages from three different SQS queues. The Lambda functions use the java app that I wrote for lab 36.

## Screenshots

### Successful test of Lambda function

![test](https://github.com/janiekyu/message-queues/blob/master/assets/test.png)

### Cloudwatch logs 

![Logs](https://github.com/janiekyu/message-queues/blob/master/assets/logs.png)

# Lab 36: SQS - Message Queues

## Overview
- Created queues using the AWS SQS service
- [```sqs-java-send```](https://github.com/janiekyu/message-queues/tree/master/sqs-java-send/src/main/java/sqs/java/send) - is a java app that sends messages to a AWS SQS queue
- [```sqs-java-receive```](https://github.com/janiekyu/message-queues/tree/master/sqs-java-receive/src/main/java/sqs/java/receive) - is a java app that receives and deletes messages from the queue

## Resources
- https://github.com/awsdocs/aws-doc-sdk-examples/blob/master/java/example_code/sqs/src/main/java/aws/example/sqs/SendReceiveMessages.java
- Kevin Couture


