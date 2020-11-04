package Solutions.ModuleTwo;

import Solutions.ModuleTwo.Solutions.Functions;

import java.util.Scanner;

public class ModuleTwoAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee Ids
        int[] ids = new int[5];
        // Employee names
        String[] names = new String[5];
        // Employee salaries
        double[] salaries = new double[5];
        for(int i=0;i<5;++i){
            System.out.print("Enter employee id:");
            ids[i] = sc.nextInt();
            System.out.print("Enter employee name:");
            names[i]= sc.next();
            System.out.print("Enter employee salary:");
            salaries[i] = sc.nextDouble();
        }
        sc.nextLine(); // consumes "\n"
        Functions.display(ids,names,salaries);
        Functions.display(ids,names);
        System.out.print("Enter name of the employee:");
        String named = sc.next();
        Functions.display(named,ids,names,salaries);
    }
}
