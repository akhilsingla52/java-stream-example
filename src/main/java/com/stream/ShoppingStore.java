package com.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.stream.dao.Comment;
import com.stream.dao.Product;

public class ShoppingStore {
	static Collection<Product> products = new HashSet<>();
	static Collection<Product> prod;
	static Scanner scan;
	static int ch;
	
	static {
		scan = new Scanner(System.in);
		initializeProducts();
	}
	
	public static void initializeProducts() {
		List<Comment> comments=new ArrayList<>();
		comments.add(new Comment("Milan","Excellent"));
		comments.add(new Comment("Vikas","Good"));
		comments.add(new Comment("Akhil","Nice"));
		comments.add(new Comment("Deepak","Nice Quality"));
		comments.add(new Comment("Rahul","Cheap Quality"));
		comments.add(new Comment("Nirmal","Bad"));
		
		products.add(new Product(1, "IPhone 7", 50000.00, "Apple", "Latest Mobile", 4.5f, "Prasad", "Prasad co", comments));
		products.add(new Product(2, "IPhone 7 plus", 60000.00, "Apple", "Latest Mobile", 4.0f, "Prasad", "Prasad co", comments));
		products.add(new Product(3, "IPhone 6", 40000.00, "Apple", "Latest Mobile", 4.5f, "Prasad", "Prasad co", comments));
		products.add(new Product(4, "IPhone 6s", 45000.00, "Apple", "Latest Mobile", 4.8f, "Prasad", "Prasad co", comments));
		products.add(new Product(5, "Desire 460", 20000.00, "HTC", "Latest Mobile", 4.2f, "Prasad", "Prasad co", comments));
		products.add(new Product(6, "Mini Pro", 12000.00, "Sony", "Latest Mobile", 3.5f, "Prasad", "Prasad co", comments));
		products.add(new Product(7, "Galaxy On5", 10000.00, "Samsung", "Latest Mobile", 2.5f, "Prasad", "Prasad co", comments));
		products.add(new Product(8, "Redmi 4A", 6000.00, "Mi", "Latest Mobile", 4.5f, "Prasad", "Prasad co", comments));
		products.add(new Product(9, "Galaxy Edge 8", 50000.00, "Samsung", "Latest Mobile", 4.5f, "Prasad", "Prasad co", comments));
		products.add(new Product(10, "Redmi Note 3", 12000.00, "Mi", "Latest Mobile", 3.5f, "Prasad", "Prasad co", comments));
		products.add(new Product(11, "Lenovo P2", 12000.00, "Lenovo", "Latest Mobile", 2.5f, "Prasad", "Prasad co", comments));
		products.add(new Product(12, "Xperia Z", 25000.00, "Sony", "Latest Mobile", 3.5f, "Prasad", "Prasad co", comments));
		products.add(new Product(13, "Mi4", 15000.00, "Mi", "Latest Mobile", 4.5f,"Pradeep","Pradeep co",comments));
		products.add(new Product(14, "Mi5", 23000.00, "Mi", "Latest Mobile", 4.0f,"Pradeep","Pradeep co",comments));
		products.add(new Product(15, "Max 5", 15000.00, "vivo", "Latest Mobile", 4.5f,"Pradeep","Pradeep co",comments));
		products.add(new Product(16, "Selfie", 9000.00, "vivo", "Latest Mobile", 3.0f,"Pradeep","Pradeep co",comments));
		products.add(new Product(17, "Bolt", 5000.00, "Micromax", "Latest Mobile", 2.5f,"Pradeep","Pradeep co",comments));
		products.add(new Product(18, "Water", 6000.00, "lyf", "Latest Mobile", 1.5f,"Pradeep","Pradeep co",comments));
		products.add(new Product(19, "Earth", 10000.00, "lyf", "Latest Mobile", 2.5f,"Nilesh","Nilesh co",comments));
		products.add(new Product(20, "K4 note", 12000.00, "Lenovo", "Latest Mobile", 1.5f,"Nilesh","Nilesh co",comments));
	}
	
	public static void display() {
		System.out.println("\n\nProduct ID\t"
				+ "Product Name\t"
				+ "Product Price\t"
				+ "Product Brand\t"
				+ "Product Description\t"
				+ "Product Rating");
		for(Product prod:products)
			System.out.println(prod);
	}
	
	public static String brandList() {
		System.out.println("\n\nBrand List");
		int count = 0;
		Collection<String> brands = new HashSet<>();
		for(Product p:products)
			brands.add(p.getProductBrand());
		for(String b:brands)
			System.out.println(++count +".\t"+ b);
		
		System.out.print("Enter The Brand Name : ");
		scan.nextLine();
		return scan.nextLine();
	}
	
	public static void brandListOperation() {
			String brand = brandList();
			products.stream().filter(p -> p.getProductBrand().equalsIgnoreCase(brand)).forEach(System.out::println);
	}
	
	public static int priceList() {
		System.out.println("\n\nPrice List Range");
		System.out.println("1. 5000 - 10000");
		System.out.println("2. 10000 - 20000");
		System.out.println("3. 20000 - 40000");
		System.out.println("4. 40000 - 60000");
		
		System.out.print("Enter The Choice : ");
		return scan.nextInt();
	}
	
	public static void priceListOperation() {
			switch(ch = priceList()) {
				case 1:
					products.stream().filter(p -> p.getProductPrice()>4999).filter(p -> p.getProductPrice()<10001).forEach(System.out::println);
					break;
				case 2:
					products.stream().filter(p -> p.getProductPrice()>9999).filter(p -> p.getProductPrice()<20001).forEach(System.out::println);
					break;
				case 3:
					products.stream().filter(p -> p.getProductPrice()>19999).filter(p -> p.getProductPrice()<40001).forEach(System.out::println);
					break;
				case 4:
					products.stream().filter(p -> p.getProductPrice()>39999).filter(p -> p.getProductPrice()<60001).forEach(System.out::println);
					break;
				default:
					System.out.println("Wrong Choice");
			}
	}
	
	public static int menuList() {
		System.out.println("\n\nAnil Trading Centre Ltd");
		System.out.println("1.Sort The Product based on Product ID");
		System.out.println("2.Sort The Product based on Product Name");
		System.out.println("3.Sort The Product based on Selected Brand");
		System.out.println("4.Sort The Product based on Product Price in ascending Order");
		System.out.println("5.Sort The Product based on filter Price List");
		System.out.println("6.Show 20% discount on above 15000");
		System.out.println("7.Show 10% discount on below 15000");
		
		System.out.print("Enter The Choice : ");
		return scan.nextInt();
	}
	
	public static void operations() {
		do {
			prod = new HashSet<>();
			products.stream().forEach( p -> prod.add(p.clone()) );
			
			switch(ch = menuList()) {
				case 1:
					prod.stream().sorted((p1,p2) -> p1.getProductID()-p2.getProductID()).forEach(System.out::println);
					break;
				case 2:
					prod.stream().sorted((p1,p2) -> p1.getProductName().compareTo(p2.getProductName())).forEach(System.out::println);
					break;
				case 3:
					brandListOperation();
					break;
				case 4:
					prod.stream().sorted((p1,p2) -> (int)(p1.getProductPrice()-p2.getProductPrice())).forEach(System.out::println);
					break;
				case 5:
					priceListOperation();
					break;
				case 6:
					prod.stream().filter(p -> p.getProductPrice()>15000).map(p -> {p.setProductPrice(p.getProductPrice()*0.8); return p;}).forEach(System.out::println);
					break;
				case 7:
					prod.stream().filter(p -> p.getProductPrice()<15000).map(p -> {p.setProductPrice(p.getProductPrice()*0.9); return p;}).forEach(System.out::println);
					break;
				default:
					System.out.println("Wrong Choice");
			}
			System.out.print("\n\nEnter for exit 0 and continue for 1: ");
		} while(scan.nextInt()!=0);
	}
	
	public static void store() {
		operations();
	}
}
