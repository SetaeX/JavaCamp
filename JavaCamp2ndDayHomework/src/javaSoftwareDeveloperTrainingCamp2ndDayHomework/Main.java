package javaSoftwareDeveloperTrainingCamp2ndDayHomework;

public class Main {

	public static void main(String[] args) {
		Category category=new Category("Kategori","TÜMÜ","PROGRAMLAMA(3)");
		Category educator=new Category("Eðitmen","TÜMÜ","Engin Demirog");
		Category categoryArrays[]= {category,educator};
		for(Category categoryOptions:categoryArrays) {
			System.out.println(categoryOptions.type);
			System.out.println("\tSeçenek 1 ->"+categoryOptions.option1);
			System.out.println("\tSeçenek 2 ->"+categoryOptions.option2);
			System.out.println("---------------------------------------------------------------");
		}
		Courses course1=new Courses(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Engin Demiroð",0);
		Courses course2=new Courses(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Engin Demiroð",36);
		Courses course3=new Courses(3,"Programlamaya Giriþ için Temel Kurs","Engin Demiroð",0);
		Courses coursesArrays[]= {course1,course2,course3};
		for(Courses courseInformation:coursesArrays) {
			System.out.println("Kurs ID ->"+courseInformation.id);
			System.out.println("Kurs Adý ->"+courseInformation.courseName);
			System.out.println("Eðitmen Adý ->"+courseInformation.educator);
			System.out.println("Kursun Tamamlanma Yüzdesi ->"+courseInformation.complationRate+"%");
			System.out.println("---------------------------------------------------------------");
		}
		courseManager method=new courseManager();
		method.addACard();
		method.checkACourse();
	}

}
