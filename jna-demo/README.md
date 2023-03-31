# JNA-demo java调用测试项目
## 注意
1. main函数下需要指定DLL文件的文件夹路径
```java
 // 输出JNA debug信息
System.setProperty("jna.debug_load","true");
// 指定JNA加载动态库的路径
System.setProperty("jna.library.path","F:\\workspace\\hoody\\jna\\cpp-lib-demo\\cmake-build-debug" );
```
