package helloWorld;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ecommerce {

	    private static String productName;

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        HashSet<Product> productSet = new HashSet<>();

	      
	        System.out.println("Enter the number of products:");
	        int num = sc.nextInt();
	        for (int i = 0; i < num; i++) {
	            Product product = new Product();
	            System.out.println("Enter the product id:");
	            product.setId(sc.nextInt());
	            System.out.println("Enter the product name:");
	            product.setName(sc.next());
	            System.out.println("Enter the product price:");
	            product.setPrice(sc.nextDouble());
	            productSet.add(product);
	        }

	     
	        Customer customer = new Customer();
	        System.out.println("Enter the number of product  you want to order:");
	        int orderCount = sc.nextInt();

	        for (int i = 0; i < orderCount; i++) {
	            System.out.println("Enter product name to order:");
	            String productName = sc.next();
	            boolean found = false;

	            Iterator<Product> iterator = productSet.iterator();
	            while (iterator.hasNext()) {
	                Product product = iterator.next();
	                if (productName .equalsIgnoreCase( product.getName())) {
	                    customer.orderProduct(product);
	                    found = true;
	                    break;
	                }
	            }

	            if (!found) {
	                System.out.println("Product with name " + productName + " not found.");
	            }
	        }

	    
	        double totalPrice = customer.calculateTotalPrice();
	        System.out.println("Total Price of ordered products: " + totalPrice);
	        
	        sc.close();
	    }
	}


package helloWorld;

public class Product {
	private int id;
    private String name;
    private double price;

    public Product() {}

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
package helloWorld;
	import java.util.HashSet;

	public class Customer {
	    private HashSet<Product> orderedProducts;

	    public Customer() {
	        orderedProducts = new HashSet<>();
	    }

	    public void orderProduct(Product product) {
	        orderedProducts.add(product);
	       // System.out.println("Ordered: " + product);
	    }

	    public double calculateTotalPrice() {
	        double totalPrice = 0.0;
	        for (Product product : orderedProducts) {
	            totalPrice += product.getPrice();
	        }
	        return totalPrice;
	    }

	    public HashSet<Product> getOrderedProducts() {
	        return orderedProducts;
	    }
	}

