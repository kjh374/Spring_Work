package com.spring.myweb.freeboard.dto.request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString 
@EqualsAndHashCode
public class FreeModifyRequestDTO {
	
	private int bno;
	private String writer;
	private String title;
	private String content;

}
