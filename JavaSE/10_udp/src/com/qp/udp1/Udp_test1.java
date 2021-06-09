package com.qp.udp1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Udp_test1 {
    public static void main(String[] args) throws UnknownHostException {
        test1();

    }
    private static void  test1() throws UnknownHostException {
        //InetAddress i1 =InetAddress.getByName("DESKTOP-15EGFOG");
        InetAddress i1 =InetAddress.getByName("172.29.153.209");

        System.out.println(i1.getHostAddress()); //172.29.153.209
        System.out.println(i1.getHostName()); // DESKTOP-15EGFOG
    }
}
