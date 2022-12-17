package org.webp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Oyuncu_Puan {
    @Id @GeneratedValue
    private Long Puan_Id;

    private Long Puan;
    @ManyToOne
    private Oyuncular Oyuncu_Id;
    @ManyToOne
    private  Oyunlar Oyun_Id;

    public Long getPuan_Id() {
        return Puan_Id;
    }

    public Long getPuan() {
        return Puan;
    }

    public Oyuncular getOyuncu_Id() {
        return Oyuncu_Id;
    }

    public Oyunlar getOyun_Id() {
        return Oyun_Id;
    }

    public void setPuan_Id(Long puan_Id) {
        Puan_Id = puan_Id;
    }

    public void setPuan(Long puan) {
        Puan = puan;
    }

    public void setOyuncu_Id(Oyuncular oyuncu_Id) {
        Oyuncu_Id = oyuncu_Id;
    }

    public void setOyun_Id(Oyunlar oyun_Id) {
        Oyun_Id = oyun_Id;
    }

    public Oyuncu_Puan() {
    }
}
