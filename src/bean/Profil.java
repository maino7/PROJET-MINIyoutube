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
import javax.persistence.OneToMany;

/**
 *
 * @author Al-amine AHMED MOUSS
 */
@Entity
public class Profil implements Serializable {


    @Id
    private String id;
    private String zone_geo ;
    private String pays ;
    private String adressIP;
    @OneToMany(mappedBy = "profil")
    private List<Viewer> viewers ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZone_geo() {
        return zone_geo;
    }

    public void setZone_geo(String zone_geo) {
        this.zone_geo = zone_geo;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdressIP() {
        return adressIP;
    }

    public void setAdressIP(String adressIP) {
        this.adressIP = adressIP;
    }

    public List<Viewer> getViewers() {
        return viewers;
    }

    public void setViewers(List<Viewer> viewers) {
        this.viewers = viewers;
    }

    public Profil() {
    }

    public Profil(String id) {
        this.id = id;
    }

    public Profil(String id, String zone_geo, String pays, String adressIP) {
        this.id = id;
        this.zone_geo = zone_geo;
        this.pays = pays;
        this.adressIP = adressIP;
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
        if (!(object instanceof Profil)) {
            return false;
        }
        Profil other = (Profil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Profil{" + "id=" + id + ", zone_geo=" + zone_geo + ", pays=" + pays + ", adressIP=" + adressIP + '}';
    }


    
}
