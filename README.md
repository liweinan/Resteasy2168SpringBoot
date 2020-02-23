启动服务：

```bash
$ mvn spring-boot:run
```

访问服务：

```bash
$ curl -v http://localhost:8080/rest/hello
*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 8080 (#0)
> GET /rest/hello HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.64.1
> Accept: */*
>
< HTTP/1.1 200
< Content-Type: application/octet-stream
< Content-Length: 13
< Date: Sun, 23 Feb 2020 02:47:58 GMT
<
* Connection #0 to host localhost left intact
Hello, world!* Closing connection 0
$
```

访问`actuator`：

```bash
$ curl -v http://localhost:8080/actuator
*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 8080 (#0)
> GET /actuator HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.64.1
> Accept: */*
>
< HTTP/1.1 200
< Content-Type: application/vnd.spring-boot.actuator.v3+json
< Transfer-Encoding: chunked
< Date: Sun, 23 Feb 2020 02:43:25 GMT
<
* Connection #0 to host localhost left intact
{"_links":{"self":{"href":"http://localhost:8080/actuator","templated":false},"health":{"href":"http://localhost:8080/actuator/health","templated":false},"health-path":{"href":"http://localhost:8080/actuator/health/{*path}","templated":true},"shutdown":{"href":"http://localhost:8080/actuator/shutdown","templated":false}}}* Closing connection 0
$
```
