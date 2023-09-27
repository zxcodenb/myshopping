package com.zx;

import java.io.StringReader;

public class Key {

    public static void main(String[] args) throws Exception {

        String pubKey = "/home/zxx/Documents/key/rsa.pub";
        String priKey = "/home/zxx/Documents/key/rsa.pri";

        RsaUtils.generateKey(pubKey, priKey,"this a key",2048);

    }
}
