package func_strms;

import static utils.ShopUtils.populateProductList;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// product list
			List<Product> productList = populateProductList();
			System.out.println("Orig list");
			productList.forEach(p -> System.out.println(p));
			System.out.println("Enter a category");
			Category cat=Category.valueOf(sc.next().toUpperCase());
			// accept category from user n display the products from the chosen category
			// src : list
			// intermediate : filter
			// term : forEach
			System.out.println("Filtered  list");
					productList.stream() //Stream<Product>
					.filter(p -> p.getProductCategory()==cat) //Stream<Product> : filtered strm
					.forEach(p -> System.out.println(p));
			
			
		}

	}

}
