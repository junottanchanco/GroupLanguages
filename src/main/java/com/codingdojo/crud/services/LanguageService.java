package com.codingdojo.crud.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.crud.models.Language;

@Service
public class LanguageService {
	private List<Language> languages = new ArrayList<Language>(Arrays.asList());
	
	public List<Language> allLanguages(){
		return languages;
	}
	
	public Language findLanguageByIndex(int index) {
		if(index < languages.size()) {
			return languages.get(index);
		}else {
			return null;
		}
	}
	
	public void addLanguage(Language language) {
		languages.add(language);
	}
	
	public void updateLanguage(int id, Language language) {
		languages.set(id, language);
	}
	
	public void deleteLanguage(int id) {
		if(id < languages.size()) {
			languages.remove(id);
		}
	}
}
