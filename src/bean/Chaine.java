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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Al-amine AHMED MOUSS
 */
@Entity
public class Chaine implements Serializable {

   
    @Id
    private String id;
    private String nom;
    @OneToMany(mappedBy = "chaine")
    private List<Vedio> vedios;
    @ManyToOne
    private Admin admin ;
    private int nb_abonnee ;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Vedio> getVedios() {
        return vedios;
    }

    public void setVedios(List<Vedio> vedios) {
        this.vedios = vedios;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getNb_abonnee() {
        return nb_abonnee;
    }

    public void setNb_abonnee(int nb_abonnee) {
        this.nb_abonnee = nb_abonnee;
    }

    public Chaine() {
    }

    public Chaine(String id) {
        this.id = id;
    }

    public Chaine(String id, String nom, int nb_abonnee) {
        this.id = id;
        this.nom = nom;
        this.nb_abonnee = nb_abonnee;
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
        if (!(object instanceof Chaine)) {
            return false;
        }
        Chaine other = (Chaine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chaine{" + "id=" + id + ", nom=" + nom + ", nb_abonnee=" + nb_abonnee + '}';
    }


    
}
