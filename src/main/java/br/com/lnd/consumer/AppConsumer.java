package br.com.lnd.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static br.com.lnd.consumer.AppSink.INPUT;

@Component
@EnableBinding(AppSink.class)
public class AppConsumer {

    @StreamListener(target = INPUT)
    public void consume(final Message<String> message) {
        String payload = message.getPayload();
        Object partitionKey = message.getHeaders().get("aws_receivedPartitionKey");

        System.out.println("Partition Key: " + partitionKey);
        System.out.println("Consuming stream: " + payload);
    }
}
