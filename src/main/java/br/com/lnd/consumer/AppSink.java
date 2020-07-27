package br.com.lnd.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface AppSink {

    String INPUT = "input";

    @Input(INPUT)
    SubscribableChannel channel();

}
