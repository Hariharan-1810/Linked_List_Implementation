package linked_list;

public class llist
{
    public class node
    {
        int data;
        node next;
    }                

    node head, last;
    int size;

    public void addfirst(int num)
    {
        node nn = new node();
        nn.data = num;
        nn.next = null;

        if(size == 0)
        {
            head = nn;
            last = nn;
            size++;
        }
        else
        {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void addlast(int num)
    {
        node nn = new node();
        nn.data = num;
        nn.next = null;

        if(size == 0)
        {
            head = nn;
            last = nn;
            size++;
        }
        else
        {
            last.next = nn;
            last = nn;

            size++;
        }
    }

    public void addat(int num, int n)
    {

        if(n > size + 1 || n < 1)
        {
            System.out.println("Invalid index");
        }
        else
        {
            node nn = new node();
            nn.data = num;
            nn.next = null;

            if(n == 1)
            {
                nn.next = head;
                head = nn;
            }
            else
            {
                int i = 1;
                node temp = head;
                
                while(i != n-1)
                {
                    temp = temp.next;
                    i++;
                }

                nn.next = temp.next;
                temp.next = nn;
            }
        }
    }

    public void search(int num)
    {
        if(size == 0)
        {
            System.out.println("List is empty");
        }
        else
        {
            int i = 0;
            node temp = head;

            
            System.out.println("Element is found in : ");
            System.out.print("\t");

            while(temp!= null)
            {
                if(temp.data == num)
                {
                    System.out.print(i + " ");
                }

                temp = temp.next;
                i++;
            }
        }
    }


    public boolean ispalin()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
            return false;
        }
        else
        {
            int i = 1;
            int j = size;
            node temp1 = head;
            node temp2 = last;

            while(i < j)
            {
                if(temp1.data!= temp2.data)
                {
                    return false;
                }
                temp1 = temp1.next;
                temp2 = getat(j-1);

                i++;
                j--;
            }
        }
        return true;
    }

    public boolean iscycle()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
            return false;
        }
        else
        {
            node slow = head;
            node fast = head.next;

            while(slow!=fast && fast.next!=null && slow.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }

            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    public void makecycle()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
        }
        else
        {
            last.next = head;
        }
    }

    public void printat(int in)
    {
        if(in >= size || in < 1)
        {
            System.out.println("Invalid index");
        }
        else if(size == 0)
        {
            System.out.println("List is empty");
        }
        else
        {
            int i = 1;
            node temp = head;

            while(i != in)
            {
                temp = temp.next;
                i++;
            }

            System.out.println(temp.data);
        }
    }

    public node getat(int in)
    {
        if(in >= size || in < 1)
        {
            System.out.println("Invalid index");
            return null;
        }

        else if(size == 0)
        {
            System.out.println("List is empty");
            return null;
        }

        int i = 1;
        node temp = head;

        while(i != in)
        {
            temp = temp.next;
            i++;
        }
        
        return temp;
    }

    public void rmfirst()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
        }
        else if(size == 1)
        {
            head = null;
            last = null;
            size--;
        }
        else
        {
            head = head.next;
            size--;
        }
    }

    public void rmlast()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
        }
        else if(size == 1)
        {
            head = null;
            last = null;
            size--;
        }
        else
        {
            node temp = head;

            while(temp.next!= last)
            {
                temp = temp.next;
            }

            last = temp;
            last.next = null;
        }
    }

    public void revmid()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
        }

        else if(size <= 2)
        {
            System.out.println("List has less than 3 elements");
        }
        else
        {
            int i;
            int j = size / 2;

            node temp = head;

            for(i = 1; i < j; i++)
            {
                temp = temp.next;
            }
            node mid = temp.next;
            temp.next = mid.next;
            mid.next = null;

        }
    }

    public void remove(int in)
    {
        int i = 1;
        node temp = head;

        if(size == 0)
        {
            System.out.println("List is empty");
        }
        else if(size < in)
        {
            System.out.println("index out of bound");
        }
        else
        {
            while(i != in)
            {
                temp = temp.next;
                i++;
            }
        }

        if(temp == head)
        {
            head = temp.next;
        }
        else
        {
            node prev = head;
            while(prev.next!= temp)
            {
                prev = prev.next;
            }
            prev.next = temp.next;
        }

    }

    public void rev()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
            return;
        }
        else if(size == 1)
        {
            return;
        }

        node prev = null;
        node current = head;
        node nextn = null;

        while(current!= null)
        {
            nextn = current.next;
            current.next = prev;
            prev = current;
            current = nextn;
        }

        current = head;
        head = last;
        last = current;
    }

    public void display()
    {
        node temp = head;
        while(temp!= null)
        {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public void disf()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println(head.data);
        }
    }

    public void disl()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println(last.data);
        }
    }

    public void printmax()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
        }
        else
        {
            int max = head.data;
            node temp = head.next;
            
            while(temp!= null)
            {
                if(temp.data > max)
                {
                    max = temp.data;
                }
                temp = temp.next;
            }

            System.out.println("Maximum value: " + max);
        }
    }

    public void printmin()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
        }
        else
        {
            int min = head.data;
            node temp = head.next;
            
            while(temp!= null)
            {
                if(temp.data < min)
                {
                    min = temp.data;
                }
                temp = temp.next;
            }

            System.out.println("Minimum value: " + min);
        }
    }
}
