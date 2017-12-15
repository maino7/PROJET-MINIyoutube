/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Al-amine AHMED MOUSS
 */
@Entity
public class Like implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean islike ;
    private boolean isdislike ;
    @ManyToOne
    private Vedio vedio ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIslike() {
        return islike;
    }

    public void setIslike(boolean islike) {
        this.islike = islike;
    }

    public boolean isIsdislike() {
        return isdislike;
    }

    public void setIsdislike(boolean isdislike) {
        this.isdislike = isdislike;
    }

    public Vedio getVedio() {
        return vedio;
    }

    public void setVedio(Vedio vedio) {
        this.vedio = vedio;
    }

    public Like() {
    }

    public Like(int id) {
        this.id = id;
    }

    public Like(int id, boolean islike, boolean isdislike) {
        this.id = id;
        this.islike = islike;
        this.isdislike = isdislike;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Like)) {
            return false;
        }
        Like other = (Like) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Like{" + "id=" + id + ", islike=" + islike + ", isdislike=" + isdislike + '}';
    }


    
}
