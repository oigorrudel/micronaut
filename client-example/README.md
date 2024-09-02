## client-example

Para fins de teste deve ser configurado a propriedade:
```properties
micronaut.http.client.ssl.insecure-trust-all-certificates=true
```

Para habilitar os log`s das requests no ```logback.xml```:
```xml
<logger level="TRACE" name="io.micronaut.http.client"/>
```