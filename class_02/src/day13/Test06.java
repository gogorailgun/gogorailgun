package day13;

public class Test06 {

	public Test06() {
		Member memb1 = new Member("윤요셉", "joseph","joseph@increpas.com");
		Member memb2 = new Member();
		
		System.out.println(memb1);
		System.out.println(memb2);
	}
	public static void main(String[] args) {
		new Test06();
	}

}

class Member {
	String name, id, mail;
	
	public Member() {
		/*
		name = "홍길동";
		id = "hong";
		mail = "hong@increpas.com";
		*/
		this("홍길동","hong","hong@increpas.com"); // 생성자 함수중에 ( ) 안에 있는 조건을 불러와서 실행하는 함수
	}
	
	public Member(String name, String id, String mail) {
		this.name = name;
		this.id = id;
		this.mail = mail;
	}
	
	public String toString() {
		return name + " | " + id + " | " + mail;
	}
}