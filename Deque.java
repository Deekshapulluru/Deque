public class Deque<Item> implements Iterable<Item> {
    public Node first,last;
    private int count;

    public class Node{
        Item data;
        Node next;
    }

    // construct an empty deque
    public Deque()
    {
        first=null;
        last=null;
        count=0;
    }

    // is the deque empty?
    public boolean isEmpty()
    {
        return count==0;
    }

    // return the number of items on the deque
    public int size()
    {
        return count;
    }

    // add the item to the front
    public void addFirst(Item item)
    {
        if (item == null){
            throw new IllegalArgumentException("cannot add null to the deque.");
        }else{
        Node newone=new Node(); 
        newone.data=item;
        if(first==null)
        {
            first=last=newone;
        }
        else
        {
            newone.next=first;
            first=newone;
        }
        count++;
    }
    }

    // add the item to the back
    public void addLast(Item item)
    {
        if (item == null){
            throw new IllegalArgumentException();
        }else{
        Node newone=new Node();
        newone.data=item;
        if(last==null)
        {
            last=first=newone;
        }
        else{
            newone.next=last;
            last=newone;
        }
        count++;
    }
    }

    // remove and return the item from the front
    public Item removeFirst()
    

    // remove and return the item from the back
    public Item removeLast()

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator()

    // unit testing (required)
    public static void main(String[] args)

}

