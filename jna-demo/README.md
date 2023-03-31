# JNA-demo java调用测试项目

## 提示信息

### 1.手动开启JNA加载Debug信息
```java
System.setProperty("jna.debug_load","true");
```
### 2. 动态库文件`DLL`，`SO` 打包到Jar包里面
- 动态库编译完成后，按平台分文件夹放在`resources`目录下
- 平台文件夹在Windows下为[`win32-x86-64`](src/main/resources/win32-x86-64)
- 通过这种方式，能够将库封装为跨平台Jar 库
