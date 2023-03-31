
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import hello.Libcpp_lib_demoLibrary;
import hello.MyUser;


import java.nio.IntBuffer;

public class App{
    public static void main(String[]args){

//        System.setProperty("jna.debug_load","true"); // 输出JNA debug信息
//        System.setProperty("jna.library.path","F:\\workspace\\hoody\\jna\\cpp-lib-demo\\cmake-build-debug" ); // 指定JNA加载动态库的路径

        //Test hello
        Libcpp_lib_demoLibrary.INSTANCE.hello();

        //Test  pp
        int[] array = new int[]{1,2,3,4,5,6};
        IntBuffer inBuffer = IntBuffer.allocate(array.length);
        System.out.println(inBuffer.order());
        for (int i = 0; i < array.length; i++) {
            inBuffer.put(array[i]);
        }
        inBuffer.position(0);
        Libcpp_lib_demoLibrary.INSTANCE.pp(inBuffer,array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(inBuffer.get());
        }
        //Test echoPoint
        MyUser.ByReference user = new MyUser.ByReference();
        user.age = 10;
        user.name = new Memory(4);
        user.name.write(0,"John".getBytes(),0,4);
        user.name_len = 4;
        MyUser user2 = Libcpp_lib_demoLibrary.INSTANCE.echoPoint(user);
        System.out.println(user2);
        Native.free(Pointer.nativeValue(user.name));

        //Test echo
        MyUser.ByValue byValue = new MyUser.ByValue();
        byValue.age = 20;
        byValue.name = new Memory(5);
        byValue.name.write(0,"Johns".getBytes(),0,5);
        byValue.name_len = 5;

        MyUser.ByValue b2 = Libcpp_lib_demoLibrary.INSTANCE.echo(byValue);
        System.out.println(b2);
        Native.free(Pointer.nativeValue(byValue.name));

    }

}

