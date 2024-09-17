Fan API for Interview
==============================


## Description
This project provides API for controling the Static Fan status with endpoints to pull
two of its chords. 
It has 2 endpoints to pull two of its chords to control the fan.

## APIs List
Following are the list of API endpoints created.
1. To Pull Chord One to controll Speed:
   Endpoint: http://localhost:8080/pull-chord-1 <br/>
   Method  : GET
2. To pull Chord to Control Direction: <br/>
   Endpoint: http://localhost:8080/pull-chord-2 <br/>
   Method: GET

## Build And Deployment
To run build and run the project you should have Java 17 and Maven installed in your system.
To check if they are installed run the following commands. <br/>
`java -version` <br/>
`mvn -version`

To build project run:
`mvn clean install`

To run the project: `mvn spring-boot:run `

## Junit Tests 
Unit testscovers are scenarios and validations defined by the API.

## Local Testing
To test in local use the postman collection present in folder: `/postman-collection`


