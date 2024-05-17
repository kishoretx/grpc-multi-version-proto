package com.example.book.client;

import greetings.v2.Greetings;
import greetings.v2.GreetingsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

;

public class GrpcClientV2 {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        GreetingsServiceGrpc.GreetingsServiceBlockingStub stub = GreetingsServiceGrpc.newBlockingStub(channel);

        Greetings.HelloRequest request = Greetings.HelloRequest.newBuilder()
                .setName("John")
                .setAge(55)
                .build();

        Greetings.HelloResponse response = stub.sayHello(request);
        System.out.println(response);

        channel.shutdown();
    }
}
