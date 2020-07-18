# dubbo-implementation

This repo consists of three different projects working in sync with eachother.

- `dub-api`
- `myProducer`
- `myConsumer`

the `dub-api` is a Java interface used to communicate with both the consumer and provider.

So, you need to first of all package the `dub-api` using `mvn package` and then download it to your local `.m2` repository using
`mvn install`.

Then the `dub-api` is inherited into the two other projects and mentioned in their POM file.

The Service is exposed in `dubbo://127.0.0.1:12345`

The Consumer is exposed at `localhost:8080/hello` as REST

##### Note:
This implementation does not use any sort of service registry and discovery as it directly redirects the consumer to port `12345`.
For further implementation, add the `zookeeper` dependency and configure the registry address.

