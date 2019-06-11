package com.lisek.composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Supervisor dean = new Supervisor("General", "Dean");
        Supervisor headOfDept1 = new Supervisor("Head 1", "Dept2");
        Supervisor headOfDept2 = new Supervisor("Head 2", "Dept 2");

        dean.add(headOfDept1);
        dean.add(headOfDept2);

        Faculty prof1 = new Professor("1", "Math");
        Faculty prof2 = new Professor("2", "Biology");
        Faculty prof3 = new Professor("3", "Chemistry");
        Faculty prof4 = new Professor("4", "Physics");

        headOfDept2.add(prof1);
        headOfDept2.add(prof2);
        headOfDept2.add(prof3);
        headOfDept2.add(prof4);

        System.out.println(dean.getDetails());
        List<Faculty> heads = dean.getFaculty();
        for (Faculty faculty : heads) {
            System.out.println("\t" + faculty.getDetails());
        }
        List<Faculty> professors = headOfDept2.getFaculty();
        for(Faculty faculty : professors) {
            System.out.println("\t\t" + faculty.getDetails());
        }

        headOfDept2.remove(prof2);

        System.out.println(dean.getDetails());
        heads = dean.getFaculty();
        for (Faculty faculty : heads) {
            System.out.println("\t" + faculty.getDetails());
        }
        professors = headOfDept2.getFaculty();
        for(Faculty faculty : professors) {
            System.out.println("\t\t" + faculty.getDetails());
        }

    }
}
