package com.gjl.proxy.jdk;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author gjl
 * @create 2019-03-10 21:44
 **/
public class MyProxy {
    public static final String LN = "\r\n";
    public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h)
            throws IllegalArgumentException, IOException {
        //动态生成代码
        String scr = generateSce(interfaces);
        //通过java输出到磁盘
        String filePath = MyProxy.class.getResource("").getPath();
        File f = new File(filePath + "$Proxy0.java");
        FileWriter fw = new FileWriter(f);
        fw.write(scr);
        fw.flush();
        fw.close();
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null,null,null);
        Iterable iterable = fileManager.getJavaFileObjects(f);

        return null;
    }

    private static String generateSce(Class<?>[] interfaces) {
        //用代码写代码
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupao.demo.proxy.dynamic.myproxy;").append(LN);
        sb.append("import com.gupao.demo.proxy.dynamic.*;").append(LN);
        sb.append("import java.lang.reflect.*;").append(LN);
        sb.append("public class $Proxy0 implements" + interfaces[0].getName() + "{").append(LN);
        sb.append("MyInvocationHandler h;").append(LN);
        sb.append("public $Proxy0(MyInvocationHandler h){").append(LN);
        sb.append("this.h = h;").append(LN);
        sb.append("}").append(LN);
        for (Method method : interfaces.getClass().getMethods()) {
            sb.append("public " + method.getReturnType().getName() + " " + method.getName() + "(){").append(LN);
            sb.append("try{").append(LN);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" +method.getName()+ "\",new Class[]{});").append(LN);
            sb.append("this.h.invoke(this,m,null);").append(LN);
            sb.append("}catch(Exception e){").append(LN);
            sb.append("e.printStackTrace();").append(LN);
            sb.append("}").append(LN);
            sb.append("}");
        }

        sb.append("}");
        System.out.println(sb);
        return sb.toString();
    }
}
