# SleuthAndZipKin

To run this application,
*  Install Zipkin-Server jar file and run it. It will start on port 9411.
*  Run the order, payment, bank microservices which will get started at port no 8081,8082,8083 respectively.
*  Hit the endpoint http://localhost:8081(GET Request) from postman.
*  Goto http://localhost:9411 and search the order-service, we can see the request propagation from the order-service till the last service(in this case its bank       service)
*  In the logs of all microservice, we can see the traceId of the request. We can use that to search for particular request.

