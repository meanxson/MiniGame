package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        History history = new History();

        System.out.println("Hello! \n Welcome to Game! ");
        System.out.println("Are you ready? (Y/N)");
        String ans = scan.nextLine();

        if(ans.equalsIgnoreCase("Y")){
            history.History();
        }else {
            System.out.println("Bye!");
            System.exit(0);
        }
        System.out.println("Please choose sects! from next list!");
        System.out.println("\t[1] West Sect" +
                            "\t[2] South Sect" +
                            "\t[3] Right Sect" + "" +
                            "\t[4] Left Sect");
    }
}
