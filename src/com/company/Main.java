package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] array = {"name1","name2","name3","name4","name5"};
//        System.out.println(array[1]);
        System.out.println("nhap ten vao day: ");
        String name = sc.nextLine();
        boolean find = false;
//        System.out.println(name);
        for (int i = 0; i < array.length; i++) {
            if(name.equals(array[i])){
                find = true;
            }
        }
        System.out.println(find);
        if(find==true){
            System.out.println("tim thay");
        }else {
            System.out.println("khong tim thay");
        }
    }
}
