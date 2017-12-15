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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Al-amine AHMED MOUSS
 */
@Entity
public class HistoriqueVedio implements Serializable {
    
    @Id
    private String id;
    @OneToOne
    private Viewer viewer ;
    @ManyToMany
    private List<Vedio> vedios ;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }

    public List<Vedio> getVedios() {
        return vedios;
    }

    public void setVedios(List<Vedio> vedios) {
        this.vedios = vedios;
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
        if (!(object instanceof HistoriqueVedio)) {
            return false;
        }
        HistoriqueVedio other = (HistoriqueVedio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.HistoriqueVedio[ id=" + id + " ]";
    }
    
}
