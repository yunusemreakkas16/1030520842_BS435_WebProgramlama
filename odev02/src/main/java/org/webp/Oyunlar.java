package org.webp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Oyunlar {

    @Id @GeneratedValue
    private Long Oyun_Id;

    @NotBlank
    @Length(min=1, max = 128)
    private String Oyun_Adi;

    private Integer value;

    public Integer getValue() {return value;
    }

    public Long getOyun_Id() {
        return Oyun_Id;
    }

    public String getOyun_Adi() {return Oyun_Adi;
    }

    public void setValue(Integer value) {this.value = value;
    }

    public void setOyun_Id(Long oyun_Id) {Oyun_Id = oyun_Id;
    }

    public void setOyun_Adi(String oyun_Adi) {Oyun_Adi = oyun_Adi;
    }

    public Oyunlar() {
    }

}

