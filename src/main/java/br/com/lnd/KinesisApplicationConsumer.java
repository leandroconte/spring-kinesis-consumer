package br.com.lnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KinesisApplicationConsumer {

    public static void main(String[] args) {
        SpringApplication.run(KinesisApplicationConsumer.class, args);
    }

}
