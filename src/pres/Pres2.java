package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Pres2
{
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(new File("config.txt") );
        String daoClassName =scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.newInstance();
        String metierClassName=scanner.nextLine();
        Class cMetier =Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();
        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("Resultats =>"+metier.calcul());


       /* Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName =scanner.nextLine();// connetre le nom de la classe
        Class cDao=Class.forName(daoClassName);//charger la classe en memoire
        IDao dao=(IDao) cDao.newInstance();//instonciation dynamique de la classe
        System.out.println(dao.getData());*/
    }



}
