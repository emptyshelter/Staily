package com.itwill.staily.detail.mapper;

import com.itwill.staily.util.Product;

public interface ProductdetailMapper {
	public Product selectProductOne(int pNo);
	
	public boolean createProduct(Product product);
	
	boolean viewMap(int pNo);
}
