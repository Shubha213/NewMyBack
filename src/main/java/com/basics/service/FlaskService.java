package com.basics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class Sentence {
	private String sentence;

	public Sentence(String sentence) {
		super();
		this.sentence = sentence;
	}

	public Sentence() {
//		super();
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	} 
}

class GetLis{
	private List<Integer> similar_blog_ids;

	public GetLis() {
		super();
	}

	public GetLis(List<Integer> similar_blog_ids) {
		super();
		this.similar_blog_ids = similar_blog_ids;
	}

	public List<Integer> getSimilar_blog_ids() {
		return similar_blog_ids;
	}

	public void setSimilar_blog_ids(List<Integer> similar_blog_ids) {
		this.similar_blog_ids = similar_blog_ids;
	}

}

@Service
public class FlaskService {

    @Autowired
    RestTemplate restTemplate;

    public void callFlaskEndpoint(String sentence) {
    	Sentence ss = new Sentence(sentence);
        String flaskUrl = "http://localhost:5000/similar-blogs";
         GetLis gt = restTemplate.postForObject(flaskUrl, ss, GetLis.class);
        
    }
}
