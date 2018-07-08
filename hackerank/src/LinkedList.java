public class LinkedList{
static Node head;

static class Node {
public int data;
public Node next;

public Node(int d)
{
	data=d;
	next=null;
}
}

public void printList()
{
	//System.out.println("head is :"+head.data);
	
	Node n=head;
	while(n!=null)
	{
		System.out.println(n.data);
		n=n.next;
	}
	
	
}

public static void main(String[] args)
{
	LinkedList list=new LinkedList();
	/*list.head=new Node(1);
	Node second=new Node(2);
	Node third=new Node(3);
	list.head.link=second;
	second.link=third;
	list.printList();
	
	//inserting 4 at the beginning
	Node fourth=new Node(4);
	fourth.link=head;
	head=fourth;
	
	//inserting node 5 at end
	Node fifth=new Node(5);
	third.link=fifth;
	fifth.link=null;
	
	//inserting 6 between 2 and 3
	Node sixth=new Node(6);
	second.link=sixth;
	sixth.link=third;*/
	list.insertAtStart(-5);
	//list.insertAtEnd(1);
	//list.insertAtEnd(2);
	//list.insertAtEnd(3);
	//list.insertAtEnd(4);
	//list.insertAtEnd(5);
	//list.insertAtStart(0);
	
	list.insertAtPos(6, 2);
	//list.deleteNodeHead();
	//list.deleteNodeHead();
	//list.deleteNodeEnd();
	//list.deleteNodeEnd();
	//list.deleteNodeAtPos(4);
	list.printList();
}
public void insertAtStart(int data)
{
	Node new_node=new Node(data);
	new_node.next=head;
	head=new_node;
}

public void insertAtEnd(int data)
{
	Node new_node=new Node(data);
	if(head==null)
	{
		head=new Node(data);
		return;
	}
	new_node.next=null;
	
	Node last=head;
	while(last.next!=null)
	{
		last=last.next;
	}
	last.next=new_node;
	return;
	
	
	
}

public void insertAtPos(int data, int pos)
{
	Node new_node=new Node(data);
	Node temp=head;
	int i=0;
	while(i<pos-2)
	{
		temp=temp.next;
		i++;
	}
	new_node.next=temp.next;
	temp.next=new_node;
	return;
	
	
}

public void deleteNodeHead()
{
	Node new_head=head;
	head=head.next;
	new_head.next=head;
}

public void deleteNodeEnd()
{
	//traverse to end-1
	int i=0;
	int size=0;
	Node last=head;
	while(last!=null){
		last=last.next;
		size+=1;
	}
	last=head;
	while(i<size-2)
	{
		last=last.next;
		i++;
	}
	last.next=null;
	//System.out.println("size of list :"+size);
}

public void deleteNodeAtPos(int pos)
{
	Node temp=head;
	Node position=head;
	int i=0;
	while(i<pos-1)
	{
		temp=temp.next;
		position=position.next;
		i++;
	}
	position=position.next;
	temp=position;
	position.next=temp;
	
}

}




