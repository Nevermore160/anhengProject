import com.alibaba.fastjson.JSONObject;
import com.anheng.pojo.DisposalSuggestions;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static com.anheng.utils.Main2.*;

public class Mytest {
    @Test
    public void test1() throws IOException {
        readF1("C:\\Users\\Nevermore\\Desktop\\securityevent.log");
    }

    @Test
    public void test2() throws IOException {

        readF3("C:\\Users\\Nevermore\\Desktop\\securityevent.log");
    }

    @Test
    public void test3() throws IOException {
        Map<String,String> map1 = new HashMap<String, String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:\\Users\\Nevermore\\Desktop\\gj.txt")));
        String str = "";
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            str += line;
        }
        String str1;
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            str1 = split[i].substring(1,split[i].length() - 1);
            String[] split1 = str1.split("\":\"");
            map1.put(split1[0],split1[1]);
        }
        Map<String,String> map = new HashMap<String, String>();
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            map.put(entry.getValue(),entry.getKey());
        }
        System.out.println(map);
    }
    @Test
    public void test4() throws IOException {
        String csvFilePath = "C:\\Users\\Nevermore\\Desktop\\template.csv";
        BufferedReader br = new BufferedReader(new FileReader(csvFilePath));

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }

}

