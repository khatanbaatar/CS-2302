import java.util.ArrayList;

import tester.Validation;


public class Stack<E>
{

	private ArrayList<E> data;
	/**
	 * postcondition: stack is empty
	 */
	public Stack()
	{
		data = new ArrayList<E>();
	}
	
	/**
	 * @return true if stack is empty, false otherwise
	 */
	public boolean isEmpty()
	{
		return data.isEmpty();
	}
	
	/**
	 * @return number of items in the stack
	 */
	public int size()
	{
		return data.size();
	}
	
	/**
	 * postcondition: e has been added to top of stack
	 * @param e 
	 */
	public void push (E e)
	{
		data.add(e);
	}
	
	/**
	 * precondition: stack is not empty
	 *  postcondition: item on top of the stack has been removed
	 */
	public void pop()
	{
		if (isEmpty())
			Validation.reportError("empty stack");
		else
			data.remove(data.size() - 1);
	}
	
	/**
	 * precondition: stack is not empty
	 * @return item on top of stack
	 */
	public E peek()
	{
		E result = null;
		if (isEmpty())
			Validation.reportError("empty stack");
		else
			result = data.get(data.size() - 1);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return data.toString();
	}
	
	
}
