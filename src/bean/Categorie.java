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
import javax.persistence.OneToMany;

/**
 *
 * @author Al-amine AHMED MOUSS
 */
@Entity
public class Categorie implements Serializable {

    @Id
  
    private String id;
    @OneToMany(mappedBy = "categorie")
    private List<Vedio> vedios;
    @ManyToMany
    private List<MotCle> motCles ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Vedio> getVedios() {
        return vedios;
    }

    public void setVedios(List<Vedio> vedios) {
        this.vedios = vedios;
    }

    public List<MotCle> getMotCles() {
        return motCles;
    }

    public void setMotCles(List<MotCle> motCles) {
        this.motCles = motCles;
    }

    public Categorie() {
    }

    public Categorie(String id) {
        this.id = id;
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
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Categorie[ id=" + id + " ]";
    }
    
}
