
### Windows
#### 已知进程名称
kill-java.bat
```shell
:: Windows 下 杀死指定进程
taskkill /f /t /im java.exe
```
-----------------------------------------

#### 已知进程端口号
> 通过端口号找到对应进程 PID
```shell
:: 查找指定端口占用程序的PID
netstat -aon | findstr "4000"
```
> 通过进程 PID 杀死指定进程
```shell
:: 通过 PID 杀死指定进程
taskkill  /pid  1700
```

