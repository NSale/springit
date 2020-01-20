package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lesa.springit.repository.LinkRepository;

@Controller
public class LinkController {

	private LinkRepository linkRepository;
	
	public LinkController(LinkRepository linkRepository) {
		this.linkRepository = linkRepository;
	}
	
	@GetMapping("/")
	public String list(Model model) {
		model.addAttribute("links", linkRepository.findAll());
		return "link/index";
	}
	
}
