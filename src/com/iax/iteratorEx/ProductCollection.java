package com.iax.iteratorEx;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public ListIterator getIterator() {
      return new ListIterator(this);
  }

  public class ListIterator implements Iterator<Product> {
    private int index;
    private ProductCollection collection;

    public ListIterator(ProductCollection collection) {
      this.collection = collection;
    }

      @Override
      public boolean hasNext() {
        return (index < collection.products.size());
      }

      @Override
      public Product current() {
        return collection.products.get(index);
      }

      @Override
      public void next() {
        index++;
      }
  }
}
