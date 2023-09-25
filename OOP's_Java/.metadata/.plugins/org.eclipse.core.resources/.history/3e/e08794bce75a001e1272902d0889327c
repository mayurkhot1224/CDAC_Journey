package func_strms;

import static utils.ShopUtils.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test8 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// product map --display name of most expensive product from the specified
			// category
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("Orig Map");
			productMap.forEach((k, v) -> System.out.println(v));
			System.out.println("Enter a category");
			Category cat = Category.valueOf(sc.next().toUpperCase());

			// src : map ---> Collection --stream()
			// intermediate : filter
			// terminal : , max
			Optional<Product> optionalProduct = productMap.values() // Collection<Product>
					.stream() // Stream<Product> : all : src
					.filter(p -> p.getProductCategory() == cat)// Stream<Product> : filtered as per cat
					.max((p1, p2) -> ((Double) p1.getPrice()).compareTo(p2.getPrice()));
			if (optionalProduct.isPresent())
				System.out.println("Name of most expensive product " + optionalProduct.get().getName());
			else
				System.out.println("No product!!!!!");

		}

	}

}
