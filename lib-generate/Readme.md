## JNA 接口代码 生成说明

1. 拷贝动态库`*.DLL`文件和对应头文件`*.h`到当前此目录

2. 执行如下命令，通过`jnaerator-0.12-shaded.jar`生成java的调用库接口  
> 参数说明
````powershell
# -runtime JNA                     #生成JNA的调用代码  
# -mode Maven                      #生成Maven项目  
# -mavenGroupId tech.hoody         #Maven项目的组织名称  
# -mavenArtifactId cpp-lib-jar     #Maven项目的项目名称  
# -o jna-generate-code             #生成代码的文件夹名称  
# -package hello                   #生成代码接口类的包
#                                  libcpp_lib_demo  库名称
#                                  ./libcpp_lib_demo.dll 动态库文件路径
#                                  ./library.h 头文件路径  
# -f -library libcpp_lib_demo ./libcpp_lib_demo.dll ./library.h  
````
> 命令示例
````cmd
java -jar ./jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId tech.hoody -mavenArtifactId cpp-lib-jar  -o jna-generate-code -package hello -f -library libcpp_lib_demo ./libcpp_lib_demo.dll ./library.h
````
3. 生成结果 在[`jna-generate-code`](./jna-generate-code) 目录下
4. 可直接复制`jna-generate-code/src/main/java/hello`目录下文件直接到项目中使用
5. 也可以使用Maven 编译`jna-generate-code`项目，作为依赖库使用。
