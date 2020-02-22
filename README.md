启动服务：

```bash
$ mvn spring-boot:run
```

访问服务：

```bash
$ curl -v http://localhost:8080/hello
*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 8080 (#0)
> GET /hello HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.64.1
> Accept: */*
>
< HTTP/1.1 200
< Content-Type: application/octet-stream
< Content-Length: 13
< Date: Sat, 22 Feb 2020 10:47:09 GMT
<
* Connection #0 to host localhost left intact
Hello, world!* Closing connection 0
$
```
