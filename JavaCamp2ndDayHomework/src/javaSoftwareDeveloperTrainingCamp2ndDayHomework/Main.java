package javaSoftwareDeveloperTrainingCamp2ndDayHomework;

public class Main {

	public static void main(String[] args) {
		Category category=new Category("Kategori","T�M�","PROGRAMLAMA(3)");
		Category educator=new Category("E�itmen","T�M�","Engin Demirog");
		Category categoryArrays[]= {category,educator};
		for(Category categoryOptions:categoryArrays) {
			System.out.println(categoryOptions.type);
			System.out.println("\tSe�enek 1 ->"+categoryOptions.option1);
			System.out.println("\tSe�enek 2 ->"+categoryOptions.option2);
			System.out.println("---------------------------------------------------------------");
		}
		Courses course1=new Courses(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�",0);
		Courses course2=new Courses(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demiro�",36);
		Courses course3=new Courses(3,"Programlamaya Giri� i�in Temel Kurs","Engin Demiro�",0);
		Courses coursesArrays[]= {course1,course2,course3};
		for(Courses courseInformation:coursesArrays) {
			System.out.println("Kurs ID ->"+courseInformation.id);
			System.out.println("Kurs Ad� ->"+courseInformation.courseName);
			System.out.println("E�itmen Ad� ->"+courseInformation.educator);
			System.out.println("Kursun Tamamlanma Y�zdesi ->"+courseInformation.complationRate+"%");
			System.out.println("---------------------------------------------------------------");
		}
		courseManager method=new courseManager();
		method.addACard();
		method.checkACourse();
	}

}
