package kodlamaIO;

public class InstructorManager extends UserManager{

	public void addLesson(String lesson) {
		System.out.println(lesson+" dersini ba�ar�yla eklediniz");
	}
	
	public void deleteComment(int id) {
		System.out.println(id+" numaral� yorumu ba�ar�yla sildiniz");
	}
	
	public void writeComment(String lesson) {
		System.out.println(lesson+" dersine ait V�DEODAK� YORUMA CEVAP VERD�N�Z");
		
	}
	
}
