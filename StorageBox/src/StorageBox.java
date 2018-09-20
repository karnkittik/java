

public class StorageBox {

	protected int count, capacity;
	protected Object[] stacks;

	public StorageBox(int _capacity) {
		this.count = 0;
		this.stacks = new Object[this.capacity = _capacity];
	}

	public StorageBox() {
		this(10);
	}

	public boolean isEmptry() {
		return this.count == 0;
	}

	public boolean isFull() {
		return this.count == this.capacity;
	}

	public boolean push(Object x) {
		if (!this.isFull()) {
			stacks[this.count++] = x;
			return true;
		} else {
			return false;
		}
	}

	public Boolean pop() {
		if (this.isEmptry()) return false;
		this.count -=1;
		return true;
	}

	public Object top() {
		if (this.isEmptry()) return null;
		return this.stacks[this.count-1];
	}

}
