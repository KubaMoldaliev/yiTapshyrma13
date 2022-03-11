package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Balyk balyk1=new Balyk();
        balyk1.setAty("nemo");
        balyk1.setTyryy("tunes");
        balyk1.setVes(4.35);
        System.out.println(balyk1.getAty()+" "+balyk1.getTyryy()+" "+balyk1.getVes());

        Popugai pop1=new Popugai();
        pop1.setAty("kesha");
        pop1.setPoroda("jindi");
        pop1.setJashy(4);
        System.out.println(pop1.getAty()+" "+pop1.getPoroda()+" "+pop1.getJashy());

        It it=new It();
        it.setAty("laika");
        it.setPoroda("mops");
        it.setJash(5);
        System.out.println(it.getAty()+" "+it.getPoroda()+" "+it.getJash());

        Myshyk ms=new Myshyk();
        ms.setAty("barsik");
        ms.setSvet("kara");
        ms.setJash(2);
        System.out.println(ms.getAty()+" "+ms.getSvet()+" "+ms.getJash());
        }



    }



