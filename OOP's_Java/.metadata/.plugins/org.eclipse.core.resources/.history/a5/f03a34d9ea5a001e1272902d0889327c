package lambda_expr;

import static utils.ShopUtils.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {

//get product list
		List<Product> productList = populateProductList();
		System.out.println("Original list");
		productList.forEach(p -> System.out.println(p));
		// Sort the products in the list as per date : custom ordering
		Collections.sort(productList, (p1, p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate()));
		System.out.println("Sorted  list as per date");
		productList.forEach(p -> System.out.println(p));
		String s = "hello";// s : literal string
		int data = 100;// int literal
		// Function literal => assigning a functionality to a variable
		// price based desc sorting
		Comparator<Product> productComp = 
				(p1, p2) -> ((Double) p2.getPrice()).compareTo(p1.getPrice());
		Collections.sort(productList, productComp);//higher order func using func literal
		System.out.println("Sorted  list as per price desc");
		productList.forEach(p -> System.out.println(p));
		
		
		
		
		
		
		

	}

}
