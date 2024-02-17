package section07;

public class EX07_13 {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.studentName = "홍길동";
		
		System.out.println(stu1.studentName);
		Student.goToSchool();
		stu1.hello();
		
		Student stu2 = new Student();
		stu2.studentName = "김철수";
		Student.goToSchool();
		stu2.hello();
	}

}
