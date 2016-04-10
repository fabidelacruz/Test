package test.marvel.domain.connector.api;

public class MarvelResponse {

	private Integer code;
	private String status;
	private MarvelResponseData data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MarvelResponseData getData() {
		return data;
	}

	public void setData(MarvelResponseData data) {
		this.data = data;
	}
}
