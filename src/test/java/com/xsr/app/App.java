package com.xsr.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xs on 2017/6/9.
 */
public class App {

    public static void main(String[] args){
        String host = "localhost";
        String port = "3306";
        String userName = "root";
        String password = "admin";
        String genPackage = "com.xsr.sys";
        String dbName = "jeesite";
        List<String> tableNameList = new ArrayList<String>();

        MygenTest mygen = new MygenTest(host, port,dbName, userName, password, genPackage, tableNameList);
        try {
            mygen.gen();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
