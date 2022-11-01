package com.bitcamp.onemoaproject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitcamp.onemoaproject.dao.ProductDao;
import com.bitcamp.onemoaproject.vo.product.Product;

@Service
public class DefaultProductService implements ProductService {

  @Autowired
  ProductDao productDao;

  //  @Override
  //  public void add(Product product) throws Exception {
  //
  //  }

  //  @Override
  //  public boolean update(Product product) throws Exception {
  //    // TODO Auto-generated method stub
  //    return false;
  //  }

  @Override
  public Product get(int no) throws Exception {
    return productDao.findByNo(no);
  }

  //  @Override
  //  public boolean delete(int no) throws Exception {
  //    // TODO Auto-generated method stub
  //    return false;
  //  }

  @Override
  public List<Product> list() throws Exception {
    return productDao.findAll();
  }

}
