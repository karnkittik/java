
public class StorageBox {
	private Object[] slot;
	private int topIndex;

	public StorageBox(Object[] slot, int topIndex) {
		super();
		this.slot = slot;
		this.topIndex = topIndex;
	}

	public StorageBox() {
		slot = new Object[5];
		topIndex = -1;
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

	public void setTopIndex(int topIndex) {
		this.topIndex = topIndex;
	}

	public boolean isEmpty() {
		return topIndex == -1;
	}

	public boolean isFull() {
		return slot.length - 1 == topIndex;
	}

	public void push(Object x) {
		if (isFull()) {
			Object[] slot2 = new Object[slot.length * 2];
			System.arraycopy(slot, 0, slot2, 0, slot.length);
			//System.arraycopy(src, srcPos, dest, destPos, length);
			slot = slot2;
		}
		slot[++topIndex] = x;
	}

	public Object pop() {
		if (isEmpty())
			return null;
		int i = topIndex;
		topIndex--;
		return slot[i];
	}

	public Object top() {
		if (isEmpty())
			return null;
		return slot[topIndex];
	}

}
