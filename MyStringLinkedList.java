public class MyStringLinkedList  implements MyStringList {
    private StringNode head;

    public void add(String value) {



        if (this.head == null) {
            this.head = new StringNode (value);
            return;
        }
        StringNode current = head;
        while (current.hasNext()) {
            current = current.getNext();
        }
            current.setNext(new StringNode(value));


        }




    public String remove() {

        if (this.head == null)
            return null;

        if (!this.head.hasNext()) {
            String value = this.head.getValue();
            this.head = null;
            return value;
        }


        StringNode last = head;
        StringNode second_last = null;
        while (last.hasNext()) {
            second_last = last;
            last = last.getNext();
        }

        second_last.setNext(null);

        return last.getValue();
    }


    public void clear() {

    this.head = null;

    }


    public int size() {
        if (this.head == null) {
            return 0;
        }
        int count = 0;
        StringNode n = this.head;
        while (n != null) {
            count++;
            n = n.getNext();
        }
        return count;
    }
}
