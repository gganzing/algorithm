package additional_study;

// 자료구조 공부 - linked list

class LinkedList{
	
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node{
		// 노드가 저장할 데이터
		private Object data;
		// 다음 데이터에 대한 정보
		private Node next;
		
		// input -> 노드가 처음 생성시 갖는 값
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		public String toString() {
			
			return String.valueOf(this.data);
		}
	}

	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		
		if(head.next == null) {
			tail = head;
		}
	}

	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0) {
			addFirst(input);
			
		}else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	Node node(int index) {
		Node x = head;
		for(int i=0; i<index; i++) {
			x = x.next;
		}
		return x;
	}
	
	
	public void add(int k, Object input) {
		
		if(k == 0) {
			addFirst(input);
			
		}else {
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			
			size++;
			
			if(newNode.next == null) {
				tail = newNode;
			}
			
		}
	}
	
	
	public String toString() {
		
		if(head == null) {
			
			return "[]";
		}
		
		Node temp = head;
		String str = "[";
		
		while(temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		
//		마지막 데이터는 next가 없으므로 반복문을 돌지 못한채로 탈출!
		str += temp.data;
		
		return str+"]";
	}

	
	public Object removeFirst() {

		// 첫 번째 데이터를 지우면서 지운 값을 반환하는 메소드
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		
		return returnData;
	}

	
	public Object remove(int k) {
		
		if(k == 0) {
			
			return removeFirst();
		}
		
		Node pre = node(k-1);
		Node todoDeleted = pre.next;
		pre.next = pre.next.next;
		
		if(todoDeleted == tail) {
			tail = pre;
		}
		
		Object returnData = todoDeleted.data;
		todoDeleted = null;
		size--;
		
		return returnData;
	}

	
	public Object removeLast() {
		
		return remove(size-1);
	}

	
	public int size() {

		return size;
	}

	
	public Object get(int k) {

		return node(k).data;
	}

	
	public int indexOf(Object data) {

		Node temp = head;
		int index = 0;
		
		while(temp.data != data) {
			
			temp = temp.next;
			index++;
			
			if(temp == null) {
				
				return -1;
			}
		}
		
		return index;
	}
	
	
	public ListIterator listIterator() {
		
		return new ListIterator();
	}
	
	class ListIterator{
		
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		ListIterator(){
			next = head;
		}
		
		public Object next() {
			
			lastReturned = next;
			next = next.next;
			nextIndex++;
			
			return lastReturned.data;
		}

		public boolean hasNext() {
			
			return nextIndex < size();
		}

		public void add(Object input) {

			Node newNode = new Node(input);
			
//			처음에 위치
			if(lastReturned == null) {
				head = newNode;
				head.next = next;

//			중간에 위치
			} else {
				lastReturned.next = newNode;
				newNode.next = next;
			}
			
			
			lastReturned = newNode;
			nextIndex++;
			size++;
			
		}

		public void remove() {
			
//			아무런 요소도 선택되어있지 않은 상황에서 오류처리
//			next를 한번도 요청하지 않고 해당함수를 요청했을 경우
			if(nextIndex == 0) {
				throw new IllegalStateException();
			}
			
			LinkedList.this.remove(nextIndex-1);
			size--;
			
		};
		
	}
	
}


public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList numbers = new LinkedList();
//		numbers.addFirst(30);
//		numbers.addFirst(20);
//		numbers.addFirst(10);
//		numbers.addLast(5);
		numbers.addLast(10);
//		numbers.addLast(15);
		numbers.addLast(20);
		numbers.addLast(30);
//		numbers.add(2, 25);
		LinkedList.ListIterator i = numbers.listIterator();
		
//		System.out.println(numbers.removeFirst());
//		System.out.println(numbers.removeLast());
//		System.out.println(numbers.remove(0));
//		System.out.println(numbers.size());
//		System.out.println(numbers.get(1));
//		System.out.println(numbers.indexOf(5));
		
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		i.add(5);
//		i.next();
//		i.add(15);
		
		while(i.hasNext()) {
			if((int)i.next() == 20) {
				i.remove();
			}
		}
		System.out.println(numbers);
		
	}
	
}
