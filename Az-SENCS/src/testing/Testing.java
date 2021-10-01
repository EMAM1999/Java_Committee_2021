/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package testing;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

/**

 @author EMAM
 */
public class Testing {
//                    [1, 2, 3, 4, 5, 6]
//                   [4, 5, 6, 7, 8, 9]
//                  [1, 2, 3, 7, 8, 9]


          public static void main(String[] args) throws SocketException, UnknownHostException {
                    Enumeration<NetworkInterface> networks = NetworkInterface.getByInetAddress(InetAddress.getLocalHost()).getNetworkInterfaces();
                    NetworkInterface inter;
                    while ( networks.hasMoreElements() ) {
                              inter = networks.nextElement();
                              byte[] mac = inter.getHardwareAddress();
                              if ( mac != null ) {
                                        for ( int i = 0 ; i < mac.length ; i++ ) {
                                                  System.out.format("%02X%s" , mac[i] , (i < mac.length - 1) ? "-" : "");
                                        }
                                        System.out.println("");
                              }
                    }
          }

}

