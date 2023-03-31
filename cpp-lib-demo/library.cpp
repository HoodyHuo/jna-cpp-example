#include "library.h"

#include <iostream>

 extern "C" __declspec(dllexport) void hello() {
    std::cout << "Hello, World!" << std::endl;
}

 extern "C" __declspec(dllexport) void pp(int* arg, int len){
    std::cout << "Length of array: " << len << std::endl;
    for(int i = 0; i < len; i++){
        arg[0] += arg[i];
        std::cout << "index:" << i << "  value:" << arg[i]  << std::endl;
    }
}

 extern "C" __declspec(dllexport) void recive(MyUser user) {
    std::cout << "Hello, " << user.name << "AGE:" << user.age << "nameLen:" << user.name_len << std::endl;
}

 extern "C" __declspec(dllexport) MyUser echo(MyUser user) {
    user.age = user.age + 1;
    std::cout << "Hello, " << user.name << "AGE:" << user.age << "nameLen:" << user.name_len << std::endl;
    return user;
}


 extern "C" __declspec(dllexport) MyUser* echoPoint(MyUser* user) {
    user->age = user->age + 2;
    std::cout << "Hello, " << user->name << "AGE:" << user->age << "nameLen:" << user->name_len << std::endl;
    return user;
}
