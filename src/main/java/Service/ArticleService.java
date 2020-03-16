package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import DAO.IArticleDAO;
import Model.Article;
@Service
public class ArticleService implements IArticleService {
@Autowired
	private IArticleDAO daoA;
	
	public void setDaoA(IArticleDAO daoA) {
		this.daoA = daoA;
	}

	@Override
	public int addArticle(Article article) {
		// TODO Auto-generated method stub
		return daoA.addArticle(article);
	}

	@Override
	public List<Article> getArticles() {
		// TODO Auto-generated method stub
		return daoA.getArticles();
	}

	@Override
	public int deleteArticle(int idArticle) {
		// TODO Auto-generated method stub
		return daoA.deleteArticle(idArticle);
	}

	@Override
	public Article infoArticle(int idArticle) {
		// TODO Auto-generated method stub
		return daoA.infoArticle(idArticle);
	}

}
