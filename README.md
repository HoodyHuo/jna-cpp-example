# Java JNA 调用C style 动态库Demo

## 目录简介
- [`cpp-lib-demo`](./cpp-lib-demo) ： C++ 动态库项目 
- [`jna-demo`](./jna-demo) ： Java 调用测试项目 
- [`lib-generate`](./lib-generate) ： 自动通过头文件生成java接口类 工具 


## 注意
1. C++ 动态库需要以C 接口形式暴露
2. 动态库编译 平台和Java 的必须一致，同是64或32，且同操作系统。 
