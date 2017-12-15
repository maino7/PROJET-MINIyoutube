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
import javax.persistence.OneToOne;

/**
 *
 * @author Al-amine AHMED MOUSS
 */
@Entity
public class Viewer implements Serializable {

    @Id
    
    private String id;
    private String email;
    private String nom ;
    @OneToOne(mappedBy = "viewer")
    private HistoriqueVedio historiqueVedio;
    @ManyToOne
    private Profil profil;

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public HistoriqueVedio getHistoriqueVedio() {
        return historiqueVedio;
    }

    public void setHistoriqueVedio(HistoriqueVedio historiqueVedio) {
        this.historiqueVedio = historiqueVedio;
    }
    
    

    public Viewer() {
    }

    public Viewer(String id) {
        this.id = id;
    }

    public Viewer(String id, String email, String nom) {
        this.id = id;
        this.email = email;
        this.nom = nom;
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
        if (!(object instanceof Viewer)) {
            return false;
        }
        Viewer other = (Viewer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Viewer{" + "id=" + id + ", email=" + email + ", nom=" + nom + '}';
    }


    
}
