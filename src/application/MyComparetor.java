package application;

import java.util.Comparator;

import entitiess.Product;

public class MyComparetor implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
