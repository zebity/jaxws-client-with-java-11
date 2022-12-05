# JakartaEE JAX-WS & Apache CXF SOAP Web Service Client With Java 11 and Maven 

This project demonstrates how to generaton either:
 - a JakartaEE JAX-WS Java client (using wsimport)
 - using Apache CXF (using wsdl2java). 
 - in both cases this was done with Java 11 and Maven 3 or

This was to get an ONVIF client application that will talk with ONVIF compatible devices

See this [post](https://tips.graphica.com.au/onvif-ws-client-consumption/)

I used the article to help with the initial very simple starting point: [post](https://sorenpoulsen.com/jax-ws-soap-web-service-client-for-java-11-with-maven)

It boils the Maven / JavaEE and Jakarta EE down to its the most basic case. Then expanded from there...

The much longer directory structure reflects ONVIF wsdl one ...

NOTE: Wound out changes to pom.xml that broke CXF generation, need to diagnosis issue/s.
 (wsimport -> Jakarta EE works - for generation but needs extra depencies to build)

## Requirements

* JDK 11 on path. (OpenJDK is fine)
* A recent Maven 3.

### Build

`mvn install`

## Source

