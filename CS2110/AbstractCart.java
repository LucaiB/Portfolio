import java.util.ArrayList;
import java.util.HashMap;
/**
 * The Abstract Cart class represents a user's cart. Items of Type T can be added 
 * or removed from the cart. A hashmap is used to keep track of the number of items
 * that have been added to the cart example 2 apples or 4 shirts. 
 * @author Your friendly CS Profs
 * @param <T> -Type of items that will be placed in the Cart.
 */
 public abstract class AbstractCart<T> {

	protected HashMap<T,Integer> cart;
	
	public AbstractCart() {
		this.cart = new HashMap<T,Integer>();
	}
	
	/**
	 * Calculates the total value of items in the cart.
	 * @return total (double) 
	 */
	public abstract double calculateTotal();
	
	/**
	 * Add an item of type T to the Cart (HashMap: The product is the key 
	 * and the value is the count).
	 * If product doesn't exist in the cart add it and set count to one. 
	 * Otherwise increment the value.  
	 * @param item
	 * @return boolean
	 */
	public void addItem(T item) {
		
		if(cart.containsKey(item))
		{
			int count = cart.get(item);
			cart.replace(item, count + 1);
		}
		else
			cart.put(item, 1);

		 //TODO: Implement this
	}
	
	/**
	 * Adds every item in the Arraylist of Type T or any subclass of T. 
	 * @param items: An array of items 
	 * @return true if items have been currently added. 
	 */
	public void addItems(ArrayList<? extends T> items) {
		   //TODO: Implement this
		for(T item: items)
			addItem(item);
	}
	
	/**
	 * Removes an item of type T from the list.
	 * If the only one item, we remove that item.
	 * If item count is greater than one decrement the count.
	 * If you are able to remove the item then return true.
	 * If the item doesn't exist return false.  
	 * @param item
	 * @return true 
	 * in the list. 
	 */
	public boolean removeItem(T item) {
	   //TODO: Implement this
		if(!(cart.containsKey(item)))
			return false;
		else if(cart.get(item).equals(1))
			cart.remove(item);
		else
		{
			int count = cart.get(item);
			cart.replace(item, count - 1);
		}
		return true;
	}
	
	
	/**
	 * Removes all of the item of items of Type T or any subclass of T from the cart. 
	 * @param item
	 * @return true if items have been successfully remove. 
	 */
	public void removeItems(ArrayList<? extends T> items) {
		   //TODO: Implement this
		for(T item: items)
			removeItem(item);
	}
	
	/**
	 * Check to see if the cart contains an item. 
	 * @param item
	 * @return true if cart contains the item. Returns False otherwize
	 */
	public boolean contains(T item) {
		return cart.containsKey(item);
	}
	

	
}
