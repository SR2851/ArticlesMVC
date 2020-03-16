package fr.adaming.articles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import Model.Article;
import Service.IArticleService;

@Controller
public class ArticleController {
	
		
		
		@Autowired
		private IArticleService service;
		
		public void setService(IArticleService service) {
			this.service = service;
		}

		
		@RequestMapping(value = "/listeArticle", method = RequestMethod.GET)
		public String afficheListe(Model model) {
			List<Article> liste = new ArrayList<Article>();
			liste=service.getArticles();
			model.addAttribute("articles",liste);
			
		
			
			return "listeArticle";
			
			
		
			
			
			
		}
		
		@RequestMapping(value = "/Article/{id}",method = RequestMethod.GET)
		public String afficheArticle(Model model,@PathVariable int id) {
			
			Article art = new Article();
			art = service.infoArticle(id);
			model.addAttribute("article", art);
			
			return "Article";
			
		
		}
		
		
		

}
