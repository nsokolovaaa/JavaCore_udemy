package Collections;


import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomLinkList<Element>  implements Iterable{
    private Node<Element> first;
    private Node<Element> last;
    private int size;

    public void add(Element element) {
        if (first == null) {
            Node<Element> node = new Node<>(element, null, null);
            first = node;
            last = node;
            size++;
        } else {
            Node<Element> node = new Node<>(element, null, last);
            last.next = node;
            last = node;
            size++;
        }
    }

    public Element get(int index) {
        return getByIndex(index).item;
    }
    public int  size() {
        return size;
    }
    public void delete(int index) {
        Node<Element> delete = getByIndex(index);
        Node<Element> elementBefore =  delete.prev;
        Node<Element> elementAfter =  delete.next;
        elementBefore.next = elementAfter;
        elementAfter.prev = elementBefore;
        size--;

    }

    private Node<Element> getByIndex(int index) {
        Node<Element> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result;
    }

    public Element first() {
        return first.item;
    }
    public Element  last() {
        return last.item;
    }
    public void addFirst(Element element) {
        Node<Element> newFirstElement = new Node<>(element, first, null);
        Node<Element> firsts = first;
        firsts.prev = newFirstElement;
        first = newFirstElement;
        size++;
    }

    @Override
    public Iterator<Element> iterator() {
        return new Iterator<Element>() {
            private Node<Element> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Element next() {
                Node<Element> tmp = current;
                current = current.next;
                return tmp.item;
            }
        };
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }


    private static class Node<Element> {
        Element item;
        Node<Element> next;
        Node<Element> prev;


        public Node(Element item, Node<Element> next, Node<Element> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public Element getItem() {
            return item;
        }

        public void setItem(Element item) {
            this.item = item;
        }

        public Node<Element> getNext() {
            return next;
        }

        public void setNext(Node<Element> next) {
            this.next = next;
        }

        public Node<Element> getPrev() {
            return prev;
        }

        public void setPrev(Node<Element> prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    ", prev=" + prev +
                    '}';
        }
    }
}





