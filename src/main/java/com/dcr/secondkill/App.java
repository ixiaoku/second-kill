package com.dcr.secondkill;

import com.dcr.secondkill.utils.MD5Util;
import lombok.var;

/**
 * @Author Luna
 * @Date 2022/3/20 下午 07:40
 * @Description
 */
public class App {

    public static void main(String[] args){

        var salt = "1a2b3c4d";
        var str = "" + salt.charAt(0) + salt.charAt(2) + "123456" + salt.charAt(5) + salt.charAt(4);
        var password = MD5Util.md5(str);
        System.out.println(password);
        String dbPass = MD5Util.formPassToDBPass(password, "1a2b3c");
        System.out.println(dbPass);
    }

}
