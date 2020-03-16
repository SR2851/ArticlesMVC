package DAO;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import Model.Article;
@Repository
public class ArticleDAO implements IArticleDAO {

	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public int addArticle(Article article) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(article);
			session.getTransaction().commit();
			System.out.println("article ajouté");
			return 1;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("erreur ajout");
		}
		
		return 0;
	}

	@Override
	public List<Article> getArticles() {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			return session.createQuery("from Article").list();
			
			
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int deleteArticle(int idArticle) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			Article art=new Article();
			art.setIdArticle(idArticle);
			session.delete(art);
			session.getTransaction().commit();
			return 1;
			
			
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public Article infoArticle(int idArticle) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			Query query = session.createQuery("from Article where idArticle = :idArticle");
			query.setParameter("idArticle", idArticle);
			return (Article) query.uniqueResult();
			
			
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

}
