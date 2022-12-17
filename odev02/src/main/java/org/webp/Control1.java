package org.webp;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class Control1 {
    @PersistenceContext
    private EntityManager em;

    public Control1(){}
    public void updateDB(int y){

        Oyunlar oyun= em.find(Oyunlar.class,0L);
        if(oyun==null){
            oyun= new Oyunlar();
            oyun.setOyun_Id(0L);
            em.persist(oyun);
        }
       oyun.setValue(y);
    }
public int readDb(){
Oyunlar oyun = em.find(Oyunlar.class,0L);
if(oyun == null){
updateDB(0);
return 0;
}
return  oyun.getValue();
}
}