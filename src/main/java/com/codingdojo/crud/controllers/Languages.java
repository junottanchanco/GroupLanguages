package com.codingdojo.crud.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codingdojo.crud.models.Language;
import com.codingdojo.crud.services.LanguageService;

@Controller
public class Languages {
	
	private final LanguageService languageService;
	
	public Languages(LanguageService languageService) {
		this.languageService = languageService;
	}
	@RequestMapping("/")
	public String index() {
		return "redirect:/languages";
	}
	@RequestMapping("/languages")
	public String lang(Model model, @ModelAttribute("language") Language language ) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "languages.jsp";
	}
	
	@RequestMapping("/langauges/new")
	public String newLang(@ModelAttribute("language") Language language) {
		return "redirect:/";
	}
	@PostMapping("/languages/new")
	public String createLang(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/";
		}else {
			languageService.addLanguage(language);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String editLang(@PathVariable("id") int id, Model model) {
		Language language = languageService.findLanguageByIndex(id);
		if(language != null) {
			model.addAttribute("language", language);
			return "editLanguage.jsp";
		}else {
			return "redirect:/";
		}
	}
	@PostMapping("/languages/edit/{id}")
	public String updateLang(@PathVariable("id") int id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "editLanguage.jsp";
		}else {
			languageService.updateLanguage(id, language);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/languages/delete/{id}")
	public String deleteLang(@PathVariable("id") int id) {
		languageService.deleteLanguage(id);
		return "redirect:/";
	}
	
	@RequestMapping("/languages/show/{id}")
	public String showLang(@PathVariable("id") int id, Model model) {
		Language language = languageService.findLanguageByIndex(id);
		if(language != null) {
			model.addAttribute("language", language);
			return "showLanguage.jsp";
		}else {
			return "redirect:/";
		}
	}
}
