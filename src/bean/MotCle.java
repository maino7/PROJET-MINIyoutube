/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Al-amine AHMED MOUSS
 */
@Entity
public class MotCle implements Serializable {



    
    @Id

    private String id;
    
    private String mot1;
    private String mot2;
    private String mot3;
    private String mot4;
    private String mot5;
    private String mot6;
    private String mot7;
    private String mot8;
    private String mot9;
    private String mot10;
    private String mot11;
    private String mot12;
    private String mot13;
    private String mot14;
    private String mot15;
    @ManyToMany
    private List<Vedio> vedios ;
    
    
        @ManyToMany(mappedBy = "motCles")
    private List<Categorie> categories;
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMot1() {
        return mot1;
    }

    public void setMot1(String mot1) {
        this.mot1 = mot1;
    }

    public String getMot2() {
        return mot2;
    }

    public void setMot2(String mot2) {
        this.mot2 = mot2;
    }

    public String getMot3() {
        return mot3;
    }

    public void setMot3(String mot3) {
        this.mot3 = mot3;
    }

    public String getMot4() {
        return mot4;
    }

    public void setMot4(String mot4) {
        this.mot4 = mot4;
    }

    public String getMot5() {
        return mot5;
    }

    public void setMot5(String mot5) {
        this.mot5 = mot5;
    }

    public String getMot6() {
        return mot6;
    }

    public void setMot6(String mot6) {
        this.mot6 = mot6;
    }

    public String getMot7() {
        return mot7;
    }

    public void setMot7(String mot7) {
        this.mot7 = mot7;
    }

    public String getMot8() {
        return mot8;
    }

    public void setMot8(String mot8) {
        this.mot8 = mot8;
    }

    public String getMot9() {
        return mot9;
    }

    public void setMot9(String mot9) {
        this.mot9 = mot9;
    }

    public String getMot10() {
        return mot10;
    }

    public void setMot10(String mot10) {
        this.mot10 = mot10;
    }

    public String getMot11() {
        return mot11;
    }

    public void setMot11(String mot11) {
        this.mot11 = mot11;
    }

    public String getMot12() {
        return mot12;
    }

    public void setMot12(String mot12) {
        this.mot12 = mot12;
    }

    public String getMot13() {
        return mot13;
    }

    public void setMot13(String mot13) {
        this.mot13 = mot13;
    }

    public String getMot14() {
        return mot14;
    }

    public void setMot14(String mot14) {
        this.mot14 = mot14;
    }

    public String getMot15() {
        return mot15;
    }

    public void setMot15(String mot15) {
        this.mot15 = mot15;
    }

    public List<Vedio> getVedios() {
        return vedios;
    }

    public void setVedios(List<Vedio> vedios) {
        this.vedios = vedios;
    }

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    public MotCle(String id) {
        this.id = id;
    }

    public MotCle() {
    }

    public MotCle(String id, String mot1, String mot2, String mot3, String mot4, String mot5, String mot6, String mot7, String mot8, String mot9, String mot10, String mot11, String mot12, String mot13, String mot14, String mot15) {
        this.id = id;
        this.mot1 = mot1;
        this.mot2 = mot2;
        this.mot3 = mot3;
        this.mot4 = mot4;
        this.mot5 = mot5;
        this.mot6 = mot6;
        this.mot7 = mot7;
        this.mot8 = mot8;
        this.mot9 = mot9;
        this.mot10 = mot10;
        this.mot11 = mot11;
        this.mot12 = mot12;
        this.mot13 = mot13;
        this.mot14 = mot14;
        this.mot15 = mot15;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotCle)) {
            return false;
        }
        MotCle other = (MotCle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MotCle{" + "id=" + id + ", mot1=" + mot1 + ", mot2=" + mot2 + ", mot3=" + mot3 + ", mot4=" + mot4 + ", mot5=" + mot5 + ", mot6=" + mot6 + ", mot7=" + mot7 + ", mot8=" + mot8 + ", mot9=" + mot9 + ", mot10=" + mot10 + ", mot11=" + mot11 + ", mot12=" + mot12 + ", mot13=" + mot13 + ", mot14=" + mot14 + ", mot15=" + mot15 + '}';
    }


    
}
