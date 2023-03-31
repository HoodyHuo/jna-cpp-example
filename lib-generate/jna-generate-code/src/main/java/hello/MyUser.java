package hello;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : library.h:9</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class MyUser extends Structure {
	public int age;
	public int name_len;
	/** C type : char* */
	public Pointer name;
	public MyUser() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("age", "name_len", "name");
	}
	/** @param name C type : char* */
	public MyUser(int age, int name_len, Pointer name) {
		super();
		this.age = age;
		this.name_len = name_len;
		this.name = name;
	}
	public MyUser(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends MyUser implements Structure.ByReference {
		
	};
	public static class ByValue extends MyUser implements Structure.ByValue {
		
	};
}
