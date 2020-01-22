package controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lesa.springit.domain.Link;
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
		return "link/list";
	}
	
	@GetMapping("/link/{id}")
	public String read(@PathVariable Long id, Model model) {
		Optional<Link> link = linkRepository.findById(id);
		
		if(link.isPresent()) {
			model.addAttribute("link", link.get());
			return "link/view";
		} else {
			return "redirect:/";
		}
	}
	
}
