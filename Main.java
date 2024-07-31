import linked_list.llist;

public class Main
{
    public static void main(String args[])
    {
        llist l = new llist();

        l.addlast(10);
        l.addlast(20);
        l.addlast(30);
        l.addlast(40);
        l.addlast(50);

        //l.addfirst(5);

        //l.remove(3);
        //l.printat(2);
        //System.out.println(l.getat(2));

        //l.rev();

        //l.display();

        // l.disf();
        // l.disl();

        l.revmid();
        // l.addat(15, 2);
        l.display();

        //l.makecycle();

        //System.out.println(l.iscycle());
        
        //l.printmax();
        //l.printmin();

        //l.search(20);
    }
}
