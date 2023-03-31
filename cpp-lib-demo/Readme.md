# C++ 库示例

C++编写，并以C接口开放的动态库

接口描述如下
````C++ 
//无参数，无返回值
void hello();

// Int数组 ，Int值 参数，无返回值
void pp(int* arg, int len);

// 结构体
struct MyUser{
    int age;
    int name_len;
    char* name;
};

// 结构体值传递
MyUser echo(MyUser user);

// 结构体 指针传递
MyUser* echoPoint(MyUser* user);
````

## 注意，编译32/64位需要和JAVA JVM一致。