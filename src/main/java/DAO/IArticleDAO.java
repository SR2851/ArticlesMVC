package DAO;

import java.util.List;

import Model.Article;


public interface IArticleDAO {

	public int addArticle(Article article);
	public List<Article> getArticles();
	public int deleteArticle(int idArticle );
	public Article infoArticle(int idArticle);
}
