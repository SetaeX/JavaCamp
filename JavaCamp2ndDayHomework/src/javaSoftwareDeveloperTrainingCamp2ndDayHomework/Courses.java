package javaSoftwareDeveloperTrainingCamp2ndDayHomework;

public class Courses {
	public Courses() {
		
	}public Courses(int id,String courseName,String educator,int complationRate){
		this.complationRate=complationRate;
		this.courseName=courseName;
		this.educator=educator;
		this.id=id;
	}
	int id;
	int complationRate;
	String educator;
	String courseName;
}
