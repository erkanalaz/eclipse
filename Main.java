package kodlamaIO;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();
		instructor1.userName="Engin Demiroð";
		instructor1.password="12345";
		instructor1.authorityLevel="Ýçerik Yöneticisi";
		
		Instructor instructor2 = new Instructor();
		instructor2.userName="Kerem Varýþ";
		instructor2.password="01245";
		instructor2.authorityLevel="Kullanýcý Yöneticisi";
		
		
		Student student = new Student();
		student.userName="Erkan Alaz";
		student.password="54321";
		student.studentLevel="Kayýttan Ýzleme";
				
		
		InstructorManager instructorManager= new InstructorManager();
		StudentManager studentManager=new StudentManager();
		
		instructorManager.addLesson("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)");
		
		studentManager.watchLesson("JAVA & REACT");
		
		studentManager.writeComment("JAVA & REACT");
		
		instructorManager.writeComment("JAVA & REACT");
		
		instructorManager.deleteComment(5);
		
		

	}
		
}
