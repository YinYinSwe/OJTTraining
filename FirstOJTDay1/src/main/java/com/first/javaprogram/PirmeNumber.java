package com.first.javaprogram;

public class PirmeNumber {

    public static void main(String[] args) {
        int i=0;
        int count=0;
        for(i=1;i<100;i++) {
            count=0;
          for(int j=2;j<i-1;j++) {
              if(i%j==0) {
                  count++;
                  break;
              }
          }
          if(count==0) {
              System.out.println(i);
          }
        }

    }

}
