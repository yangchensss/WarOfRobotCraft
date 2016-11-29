package aiutil;

import java.util.LinkedList;

public class Stack {

	private LinkedList<String> stack;
	private String topElement;
	private int elementNum;
	
	public Stack () {
		this.stack = new LinkedList<String>();
		this.topElement = "";
		this.elementNum = 0;
	}

	/**
	 * this method is to do the pop action in the stack
	 */
	public void pop () {
		if ( !this.isEmpty() ) {
			this.getStack().removeFirst();
			this.setTopElement(this.getStack().getFirst());
			this.setElementNum(this.getElementNum() - 1);
		}
	}
	
	/**
	 * this method is to determine if the stack is null
	 * 
	 * @return true if the stack is null, otherwise false
	 */
	public boolean isEmpty() {
		return ( this.stack == null );
	}
	
	/**
	 * @return the stack
	 */
	public LinkedList<String> getStack() {
		return stack;
	}

	/**
	 * @param stack the stack to set
	 */
	public void setStack(LinkedList<String> stack) {
		this.stack = stack;
	}

	/**
	 * @return the topElement
	 */
	public String getTopElement() {
		return topElement;
	}

	/**
	 * @param topElement the topElement to set
	 */
	public void setTopElement(String topElement) {
		this.topElement = topElement;
	}

	/**
	 * @return the elementNum
	 */
	public int getElementNum() {
		return elementNum;
	}

	/**
	 * @param elementNum the elementNum to set
	 */
	public void setElementNum(int elementNum) {
		this.elementNum = elementNum;
	}
}
