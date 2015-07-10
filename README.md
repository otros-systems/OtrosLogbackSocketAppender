# OtrosLogbackSocketAppender
Implementation of Logback SocketAppender with fixed issue http://jira.qos.ch/browse/LOGBACK-905

Version 1.0 is in maven repository on Bintray https://bintray.com/artifact/download/otros-systems/maven.

If you are using Gradle, add following dependency:

```groovy
compile 'pl.otros.logback.socket:OtrosLogbackSocketAppender:1.0'
```

In logback configuration file define SOCKET appeder:
```xml
    <appender name="SOCKET" class="pl.otros.logback.socket.OtrosSocketAppender">
        <remoteHost>localhost</remoteHost>
        <port>5000</port>
        <includeCallerData>true</includeCallerData>
    </appender>
```    

Add SOCKET appender ref to root logger:
```xml
    <root level="debug">
        <appender-ref ref="SOCKET"/>
    </root>
```
