## exception-handler-example

Por default o Micronaut utiliza a estrutura de JSON da classe 
```java 
io.micronaut.http.hateoas.JsonError
```

Para customizar o erro necessita ser sobreescrita a bean ```ErrorResponseProcessor```