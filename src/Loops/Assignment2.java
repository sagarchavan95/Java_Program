package Loops;

public class Assignment2 {
//Print the following patterns using loop
//*
//**
//***
//****
public static void main(String[] args) {
    for (int row=1;row<=7;row++){
        for (int column=1;column<=row;column++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
