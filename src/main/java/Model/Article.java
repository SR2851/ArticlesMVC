package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {

@Id
@GeneratedValue
private int idArticle;
private String nomArticle;
private String description;
private float prixArticle;
public int getIdArticle() {
	return idArticle;
}
public void setIdArticle(int idArticle) {
	this.idArticle = idArticle;
}
public String getNomArticle() {
	return nomArticle;
}
public void setNomArticle(String nomArticle) {
	this.nomArticle = nomArticle;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getPrixArticle() {
	return prixArticle;
}
public void setPrixArticle(float prixArticle) {
	this.prixArticle = prixArticle;
}
public Article(String nomArticle, String description, float prixArticle) {
	super();
	this.nomArticle = nomArticle;
	this.description = description;
	this.prixArticle = prixArticle;
}
public Article() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Article [idArticle=" + idArticle + ", nomArticle=" + nomArticle + ", description=" + description
			+ ", prixArticle=" + prixArticle + "]";
}


}
