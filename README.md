# SleuthAndZipKin

To run this application,
1.) Install Zipkin-Server jar file and run it. It will start on port 9411.
2.) Run the order, payment, bank microservices which will get started at port no 8081,8082,8083 respectively.
3.) Hit the endpoint http://localhost:8081(GET Request) from postman.
4.) Goto http://localhost:9411 and search the order-service, we can see the request propagation from the order-service till the last service(in this case its bank       service)
5.) In the logs of all microservice, we can see the traceId of the request. We can use that to search for particular request.

