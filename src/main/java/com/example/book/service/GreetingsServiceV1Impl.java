package com.example.book.service;

import greetings.v1.Greetings;
import io.grpc.stub.StreamObserver;
import greetings.v1.GreetingsServiceGrpc;


import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingsServiceV1Impl extends GreetingsServiceGrpc.GreetingsServiceImplBase {

    @Override
    public void sayHello(Greetings.HelloRequest request, StreamObserver<Greetings.HelloResponse> responseObserver) {
        Greetings.HelloResponse response = Greetings.HelloResponse.newBuilder()
                .setMessage("Hello (v1)" + request.getName())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
