package Main;

import DAO.ArticleDAO;
import DAO.IArticleDAO;
import Model.Article;

public class mainArticle {
public static void main(String[] args) {
	IArticleDAO daoA=new ArticleDAO();
	Article article=new Article("Tablette", "La plus fine", 420);
	
	daoA.addArticle(article);
	
	
}
}
