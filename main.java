package oopIntro;

public class main {

	public static void main(String[] args) {

		// örnek oluþturma , !!!!referans oluþturma !!!!!, Ýnstance
		
		
		
		
		
/*		product product1 = new product(1,"Lenovo Thinkpad","2Gb Ram , gt710 CPU",15000);
		product product2 = new product(2,"Monster abra","32Gb Ram , rtx 3060 CPU",15000);
		
		product[] products = { product1, product2 };

		for (product product : products) {
			System.out.println(product.name);
		}


		ProductManager productManager = new ProductManager();
		
		productManager.addToCard(product1);
		
		
		productManager.addToCard(product2);

*/
		
		
		
		Course course1 = new Course(1,"Java Kursu","Hoca : Engin Demirog");
		Course course2 = new Course(2,"C# Kursu","Hoca : Engin Demirog");
		
		Course[] courses = {course1,course2};
		
		for(Course course : courses) {
			System.out.println(course.name);
		}
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addCourse(course1);
		
		courseManager.addCourse(course2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
	}

}
