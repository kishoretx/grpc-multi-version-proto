This application 2 version of .proto file.

When SpringBoot application starts, it will create the Service Bean.
Each of the service implements each of the proto file service methods.

Running the client will invoke service methods in corresponding proto file.
RUNNING:
1. Runn the SpringBoot main() method in Application.java and then runt he Client.
2. Run the SpringBoot main() method in Application.java and then use the Postman:
   3. localhost:9090 and SayHello from V1 proto file.
   4. localhost:9090 and SayHello from V2 proto file.