## crud-example

### h2-console
```
http://localhost:8082/
```
No pom.xml alterar o escopo da dependencia do h2 de ```runtime``` para ```compile```.

```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>compile</scope>
</dependency>
```

E no ```Application``` rodar manualmente

```java
public class Application {

    public static void main(String[] args) throws SQLException {
        Server.createWebServer().start();
        Micronaut.run(Application.class, args);
    }
}
```


