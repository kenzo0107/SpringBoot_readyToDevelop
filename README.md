# Spring Boot stationery to ready to start project !

## URL design

- /api/internal : internal api 
- /api : external api
- /admin : administration

else url is for public users.

## Exception

- ErrorController manages all exceptions !

- set application.properties

```
server.error.path=/globalError
```

## Transaction

All Transactions is set at transaction-context.xml.

## Batch

I take TaskScheduler to run the bathes !

## Divide the settings for each Environment.

- application.properties
- application-staging.properties
- application-producation.properties

## Logging

I use SLF4J + logback instead of log4j !

## Security

- XSS : thymeleaf
- SQL Injection : MyBatis
- CSRF : SpringSecurity
- Http Security Headers : SpringSecurity

## DevTools

- Spring DevTools



### References

- [sinsengumi](https://speakerdeck.com/sinsengumi/spring-boot-application-infrastructure)