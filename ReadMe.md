# Test for Java 9 modules and Spring Boot

## First example (Java 9 modules only)

Start simple example by executing the following statements

    mvn clean package
    java -p multi-test-client/target/multi-test-client-1.0-SNAPSHOT.jar:multi-test-api/target/multi-test-api-1.0-SNAPSHOT.jar:multi-test/target/multi-test-1.0-SNAPSHOT.jar -m multi.test.client/ch.gisel.test.multi.client.Client