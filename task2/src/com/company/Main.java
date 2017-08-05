package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(30);
        Scanner in = new Scanner(System.in);
        fillMap(map);
        System.out.print("Введите код ошибки : ");
        System.out.print("Ошибка : " + map.get(in.nextInt()));

    }

    private static void fillMap(Map<Integer, String> map) {
        for (int i = 0; i < 30; i++) {
            switch (i) {
                case 0 : map.put(400, "Bad Request");break;
                case 1 : map.put(401, "Unauthorized");break;
                case 2 : map.put(402, "Payment Required");break;
                case 3 : map.put(403, "Forbidden");break;
                case 4 : map.put(404, "Not Found");break;
                case 5 : map.put(405, "Method Not Allowed");break;
                case 6 : map.put(406, "Not Acceptable");break;
                case 7 : map.put(407, "Proxy Authentication Required");break;
                case 8 : map.put(408, "Request Timeout");break;
                case 9 : map.put(409, "Conflict");break;
                case 10 : map.put(410, "Gone");break;
                case 11 : map.put(411, "Length Required");break;

                case 12 : map.put(412, "Precondition Failed");break;
                case 13 : map.put(413, "Request Entity Too Large");break;
                case 14 : map.put(414, "Request-URI Too Large");break;
                case 15 : map.put(415, "Unsupported Media Type");break;
                case 16 : map.put(416, "Requested Range Not Satisfiable");break;
                case 17 : map.put(417, "Expectation Failed");break;
                case 18 : map.put(418, "I’m a teapot");break;
                case 19 : map.put(422, "Unprocessable Entity");break;
                case 20 : map.put(423, "Locked");break;
                case 21 : map.put(424, "Failed Dependency");break;
                case 22 : map.put(425, "Unordered Collection");break;
                case 23 : map.put(426, "Upgrade Required");break;

                case 24 : map.put(428, "Precondition Required");break;
                case 25 : map.put(429, "Too Many Requests");break;
                case 26 : map.put(431, "Request Header Fields Too Large");break;
                case 27 : map.put(444, "Nonstandard code");break;
                case 28 : map.put(449, "Retry With");break;
                case 29 : map.put(451, "Unavailable For Legal Reasons");break;
            }
        }
    }
}
