package kodlamaIO;

public class InstructorManager extends UserManager{

	public void addLesson(String lesson) {
		System.out.println(lesson+" dersini baþarýyla eklediniz");
	}
	
	public void deleteComment(int id) {
		System.out.println(id+" numaralý yorumu baþarýyla sildiniz");
	}
	
	public void writeComment(String lesson) {
		System.out.println(lesson+" dersine ait VÝDEODAKÝ YORUMA CEVAP VERDÝNÝZ");
		
	}
	
}
