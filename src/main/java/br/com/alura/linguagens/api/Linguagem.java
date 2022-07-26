package br.com.alura.linguagens.api;

public class Linguagem {
	
	private String title;
	private String image;
	private int ranking;
	
	public Linguagem() {}
	
	public Linguagem(String title, String image, int ranking) {
		super();
		this.title = title;
		this.image = image;
		this.ranking = ranking;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	

}
