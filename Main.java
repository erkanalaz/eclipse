package kodlamaIO;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();
		instructor1.userName="Engin Demiro�";
		instructor1.password="12345";
		instructor1.authorityLevel="��erik Y�neticisi";
		
		Instructor instructor2 = new Instructor();
		instructor2.userName="Kerem Var��";
		instructor2.password="01245";
		instructor2.authorityLevel="Kullan�c� Y�neticisi";
		
		
		Student student = new Student();
		student.userName="Erkan Alaz";
		student.password="54321";
		student.studentLevel="Kay�ttan �zleme";
				
		
		InstructorManager instructorManager= new InstructorManager();
		StudentManager studentManager=new StudentManager();
		
		instructorManager.addLesson("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)");
		
		studentManager.watchLesson("JAVA & REACT");
		
		studentManager.writeComment("JAVA & REACT");
		
		instructorManager.writeComment("JAVA & REACT");
		
		instructorManager.deleteComment(5);
		
		

	}
		
}
