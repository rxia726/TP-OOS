package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClient {

    private static final Logger logger = LoggerFactory.getLogger(MainClient.class);

    public static void main(String[] args) {
        // Example log messages
        logger.info("Starting the gRPC client");

        // Your gRPC client logic here

        try {
            // Simulate client logic and interaction with the gRPC server
            logger.debug("Attempting to connect to gRPC server");

            // Example gRPC call, adjust according to your code
            // stub.someGrpcMethod();

            logger.info("Successfully connected to gRPC server");
        } catch (Exception e) {
            logger.error("Error occurred while interacting with gRPC server", e);
        }
    }
}
