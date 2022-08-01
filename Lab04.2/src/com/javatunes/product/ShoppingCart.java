/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Shopping class is a ge
// nric class because of<T>
public class ShoppingCart<T extends Product> {
  // storage for the cart's contents
  private Collection<T> items = new ArrayList<T>();  // diamond not used here just to emphasize the T

  public double total(){
    Double result =0.0;
    for ( T items: items) {
      result = result + items.getPrice();
    }
    return result;
  }
  
  public void addItem(T item) {
    items.add(item);
  }
  
  public void removeItem(T item) {
    items.remove(item);
  }
  public Collection<T> allItems(){
    return Collections.unmodifiableCollection(items);
  }

  public int size(){
    return items.size();
  }

}