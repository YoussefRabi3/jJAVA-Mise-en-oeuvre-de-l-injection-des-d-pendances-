package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // c'est le principe de couplage faible
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp *540/Math.cos(tmp*Math.PI);
        return  res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
