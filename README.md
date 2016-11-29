# jaxrs-jpa-swarm
Test Project for jax-rs, jpa, jta, bean validation wildfly swarm

1. run:
 mvn clean install && java -jar target/jaxrs-jpa-swarm.jar

2. test call:

okay:
curl -i -H "content-type: Application/Json" -d '{"cardNr": "123454", "coupon": "halloworld"}' "http://localhost:8080/jaxrs-jpa/coupon/redemption"

404:
curl -i -H "content-type: Application/Json" -d '{"cardNr": "123454", "coupon": ""}' "http://localhost:8080/jaxrs-jpa/coupon/redemption"
