import java.util.NoSuchElementException;

public interface BasicIteratorInterface {
	/**
	 * Determines whether the iteration has completed its traversal and gone beyond
	 * the last entry in the collection of data.  
	 * @return true if the iteration has another entry to return
	 */
	public boolean hasCurrent();
	
	/**
	 * Advances the current position of the iteration by 1.
	 * @return true if the iteration has another entry to return
	 */
	public boolean advance();
	
	/**
	 * Retrieves the current entry in the iteration.
	 * @return a reference to the current entry in the iteration if there is one
	 * @throws NoSuchElementException, if no current entry exists
	 */
	public Object getCurrent() throws NoSuchElementException;
	
	/**
	 * Sets the iteration to begin with the 1st entry in the collection
	 */
	public void reset();
} // end BasicIteratorInterface
