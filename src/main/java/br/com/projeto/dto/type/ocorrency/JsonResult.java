package br.com.projeto.dto.type.ocorrency;

import java.io.Serializable;

public class JsonResult<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long recordsTotal;
	
	private Long recordsFiltered;
	
	private T data;
	
	public JsonResult() {
		
	}
	
	public JsonResult(Long recordsTotal, Long recordsFiltered, T data) {
		super();
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsFiltered;
		this.data = data;
	}

	public Long getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(Long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public Long getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(Long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
