package com.easy.kotlin;

import com.alibaba.fastjson.JSON;

/**
 * Created by jack on 2017/7/14.
 */
public class JSONUtils {

    static JSONUtils jsonUtils = new JSONUtils();

    public static String toJsonString(Object o) {
        return JSON.toJSONString(o);
    }

    public static void main(String[] args) {
        String url = "http://www.baidu.com";
        String result = OkhttpUtils.INSTANCE.get(url);
        System.out.println(result);

        try {
            jsonUtils.parseObject("{}");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void testCallingKotlinObjectFun(){
    }

    public Object parseObject(String jsonText) throws Exception {
        throw new Exception("Test Exception");
    }
}
