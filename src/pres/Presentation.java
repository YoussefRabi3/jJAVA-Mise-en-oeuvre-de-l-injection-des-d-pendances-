package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import ext.DaoImplVWS;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*injection des dependances par instanciation statique ===> new*/
        DaoImplVWS dao = new DaoImplVWS();
        MetierImpl metier =new MetierImpl();
        metier.setDao(dao);
        System.out.println("Resultat  : "+metier.calcul());

    }

}
