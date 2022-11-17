package com.company.oops;
public class checking {
            static void prime_N(int N)  {
                System.out.println("All the Prime numbers within 1 and " + N + " are:");
                for (int i = 1; i <= N; i++) {
                     int  count = 1;
                    for (int j = 2; j <= i / 2; j++) {
                        if (i % j == 0) {
                            count = 0;
                            break;
                        }
                    }
                    if (count == 1)
                        System.out.print(i + " ");
                }
            }
            public static void main(String[] args)
            {
                int N = 45;
                prime_N(N);
            }
        }


