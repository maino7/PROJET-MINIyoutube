/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.stream.events.Comment;
import static org.eclipse.persistence.expressions.ExpressionOperator.Like;

/**
 *
 * @author Al-amine AHMED MOUSS
 */
@Entity
public class Vedio implements Serializable {



  

    @Id
    private String id;
    private String titre1;
    private String titre2;
    private String description;
    private Date date_ajout ;
    private  int nb_vue ;
    
        @OneToMany(mappedBy = "vedio")
    private List<Comment> comments;
          @OneToMany(mappedBy = "vedio")
    private List<Like> likes;
    @ManyToOne
    
    private Chaine chaine;
    
    
    @ManyToMany(mappedBy = "vedios")
    private List<HistoriqueVedio> historiqueVedios;
    @ManyToOne
    private Categorie categorie;
    @ManyToMany(mappedBy = "vedios")
    private List<MotCle> motCles;
    

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre1() {
        return titre1;
    }

    public void setTitre1(String titre1) {
        this.titre1 = titre1;
    }

    public String getTitre2() {
        return titre2;
    }

    public void setTitre2(String titre2) {
        this.titre2 = titre2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<bean.Like> getLikes() {
        return likes;
    }

    public void setLikes(List<bean.Like> likes) {
        this.likes = likes;
    }

    public Chaine getChaine() {
        return chaine;
    }

    public void setChaine(Chaine chaine) {
        this.chaine = chaine;
    }

    public Date getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(Date date_ajout) {
        this.date_ajout = date_ajout;
    }

    public int getNb_vue() {
        return nb_vue;
    }

    public void setNb_vue(int nb_vue) {
        this.nb_vue = nb_vue;
    }

    public List<HistoriqueVedio> getHistoriqueVedios() {
        return historiqueVedios;
    }

    public void setHistoriqueVedios(List<HistoriqueVedio> historiqueVedios) {
        this.historiqueVedios = historiqueVedios;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }


    
    

    
    public Vedio() {
    }

    public Vedio(String id) {
        this.id = id;
    }



    public Vedio(String id, String titre1, String titre2, String description , Date date_ajout , int nb_vue) {
        this.id = id;
        this.titre1 = titre1;
        this.titre2 = titre2;
        this.description = description;
        this.date_ajout = date_ajout;
        this.nb_vue = nb_vue;
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
        if (!(object instanceof Vedio)) {
            return false;
        }
        Vedio other = (Vedio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vedio{" + "id=" + id + ", titre1=" + titre1 + ", titre2=" + titre2 + ", description=" + description + ", date_ajout=" + date_ajout + ", nb_vue=" + nb_vue + '}';
    }






    
}
