package com.company;

import java.util.Scanner;

public enum Choosing {
    WEST_SECT,
    SOUTH_SECT,
    LEFT_SECT,
    RIGHT_SECT;
    private Scanner userInput = new Scanner(System.in);
        public Choosing Asking(){
            System.out.println("Please choose sects! from next list!");
            System.out.println("\t[1] West Sect" +
                    "\t [2] South Sect" +
                    "\t [3] Right Sect" + "" +
                    "\t [4] Left Sect");
            return WEST_SECT;
        }
    }
