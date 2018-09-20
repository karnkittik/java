package exercise1;
import java.util.ArrayList;

import javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder;

public class StorageBox {
	private Object[] slot;
	private int topIndex;

	public StorageBox() {
		slot = new Object[5];
		topIndex = -1;

	}

	public StorageBox(int size) {
		slot = new Object[size];
		topIndex = -1;

	}

	public boolean isEmpty() {
		return topIndex == -1;
	}

	public boolean isFull() {
		return topIndex == slot.length - 1;
	}

	public void push(Object object) {
		if (!this.isFull()) {

			slot[topIndex] = object;
			++topIndex;
		} else {
			System.out.println("Cannot push. Storage is full");
		}
	}

	public Object pull() {
		if (!isEmpty()) {
			Object topObject = slot[topIndex];
			slot[topIndex] = null;
			--topIndex;
			return topObject;
		}
		else
			return null;

	}

	public Object top() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getSlot() {
		return slot;
	}

	public void setSlot(Object[] slot) {
		this.slot = slot;
	}

	public int getTopIndex() {
		return topIndex;
	}

	public void setTopIndex(int top) {
		this.topIndex = top;
	}

}
