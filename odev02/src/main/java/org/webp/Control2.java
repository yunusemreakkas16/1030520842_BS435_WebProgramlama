package org.webp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class Control2 {
    @PersistenceContext
    private EntityManager em;

    public Control2(){}
    public void updateDB(int y){

        Oyuncular oyuncu= em.find(Oyuncular.class,0L);
        if(oyuncu==null){
            oyuncu= new Oyuncular();
            oyuncu.setOyuncu_Id(0L);
            em.persist(oyuncu);
        }
        oyuncu.setValue(y);
    }
    public int readDb(){
        Oyuncular oyuncu = em.find(Oyuncular.class,0L);
        if(oyuncu == null){
            updateDB(0);
            return 0;
        }
        return  oyuncu.getValue();
    }
}