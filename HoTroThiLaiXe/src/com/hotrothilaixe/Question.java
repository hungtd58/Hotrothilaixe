package com.hotrothilaixe;

public class Question {
	private int id;
	private String content;
	private String ans_A, ans_B, ans_C, ans_D, result;
	private int num_q, imgID;
	public String current = NONE; // hold the answer picked by the user, initial
									// is
									// NONE(see below)
	public static final String NONE = "None"; // No answer selected
	public static final String ANSWER_ONE_SELECTED = "A"; // first answer
															// selected
	public static final String ANSWER_TWO_SELECTED = "B"; // second answer
															// selected
	public static final String ANSWER_THREE_SELECTED = "C"; // third answer
															// selected
	public static final String ANSWER_FOUR_SELECTED = "D"; // forth answer
															// selected

	public Question(int id, String content, String ans_A, String ans_B,
			String ans_C, String ans_D, String result, int num_q, int imgID) {
		super();
		this.id = id;
		this.content = content;
		this.ans_A = ans_A;
		this.ans_B = ans_B;
		this.ans_C = ans_C;
		this.ans_D = ans_D;
		this.result = result;
		this.num_q = num_q;
		this.imgID = imgID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAns_A() {
		return ans_A;
	}

	public void setAns_A(String ans_A) {
		this.ans_A = ans_A;
	}

	public String getAns_B() {
		return ans_B;
	}

	public void setAns_B(String ans_B) {
		this.ans_B = ans_B;
	}

	public String getAns_C() {
		return ans_C;
	}

	public void setAns_C(String ans_C) {
		this.ans_C = ans_C;
	}

	public String getAns_D() {
		return ans_D;
	}

	public void setAns_D(String ans_D) {
		this.ans_D = ans_D;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getNum_q() {
		return num_q;
	}

	public void setNum_q(int num_q) {
		this.num_q = num_q;
	}

	public int getImgID() {
		return imgID;
	}

	public void setImgID(int imgID) {
		this.imgID = imgID;
	}

}
