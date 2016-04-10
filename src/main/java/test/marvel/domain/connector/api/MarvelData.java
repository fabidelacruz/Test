package test.marvel.domain.connector.api;

public class MarvelData {

	private Integer id;
	private String name;
	private MarvelThumbnail thumbnail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MarvelThumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(MarvelThumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}
}
