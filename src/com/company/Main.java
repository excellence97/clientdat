package com.company;

import com.company.skill.ProvideSkill;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("" +
                "Options :\n" +
                "1 : SkillGrp ");

        final var s = scanner.nextLine();
        if (s.equals("1"))
        {
            new ProvideSkill();
        }
    }
}


