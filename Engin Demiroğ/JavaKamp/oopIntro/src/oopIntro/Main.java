package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V14",15000,"16GB Ram",10); // �rnek Olu�turma, Referans olu�turma instance olu�turma
		
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		Product product3 = new Product();
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("��ecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println();
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		
		
	}
	
	

}
