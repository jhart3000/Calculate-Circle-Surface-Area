Calculate-Surface-Area

This Spring Boot app uses Java 11 and Maven and requires lombok to be enabled in your IDE of choice.

The architecture of this app consists of one controller which contains a get API that takes in the radius of a circle as a path param. 
This controller talks to a service file that calculates the surface area of the circle to two decimal places based on the radius entered by the user.
The controller and service logic have their own separate unit test and an integration test has also been added.

This repo can be cloned or downloaded as a zip using the button above and can then be imported as an existing maven project to your IDE of choice.

Running the CalculateSurfaceAreaApplication.java file will deploy the app to the local server on port 8080.

The swagger documentation for this service can be viewed on the following link after the application is deployed locally: 

http://localhost:8080/swagger-ui.html#/

The api can be directly hit in the swagger ui where everything is set up for the user to enter the radius and execute the call or a software such as postman can be used.
A postmanCollection.json file has been added in this repository. This can be imported into postman so that the api is automatically set up and ready to call.

The following is the url that the GET request must be sent to:

http://localhost:8080/calculateSurfaceArea/radius/{radius}

Where {radius} must be replaced with a valid double value.
