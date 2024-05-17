package com.example.book.service;

import greetings.v2.Greetings;
import io.grpc.stub.StreamObserver;
import greetings.v2.GreetingsServiceGrpc;


import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingsServiceV2Impl extends GreetingsServiceGrpc.GreetingsServiceImplBase {

    @Override
    public void sayHello(Greetings.HelloRequest request, StreamObserver<Greetings.HelloResponse> responseObserver) {
        Greetings.HelloResponse response = Greetings.HelloResponse.newBuilder()
                .setMessage("Hello (V2) " + request.getName())
                .setExtraInfo("You are " + request.getAge() + " years old.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
