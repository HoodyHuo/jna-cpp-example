#ifndef CPP_LIB_DEMO_LIBRARY_H
#define CPP_LIB_DEMO_LIBRARY_H

extern "C" {

    __declspec(dllexport)  void hello();
    __declspec(dllexport)  void pp(int* arg, int len);

struct MyUser{
    int age;
    int name_len;
    char* name;
};

__declspec(dllexport)  MyUser echo(MyUser user);

__declspec(dllexport)  MyUser* echoPoint(MyUser* user);

}
#endif //CPP_LIB_DEMO_LIBRARY_H
