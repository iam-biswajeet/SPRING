package com.nt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/*@Getter
@Setter
@AllArgsConstructor//(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor(access=AccessLevel.PRIVATE)*/
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {
	@NonNull
	private int stuRollNo;
	@NonNull
	private String stuName;
	private String stuAddrs;
	private float stuMark;
	
	/*
	 * public Student() {
	 * 
	 * }
	 */
	public void setStuRollNo(int stuRollNo) {
		this.stuRollNo=stuRollNo;
	}
	public String toString() {
		return stuRollNo+"  "+stuName;
	}
	 
}
