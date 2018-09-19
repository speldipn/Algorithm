package data_struct.ch09_list;

import java.util.Comparator;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-17
 */
public class LinkedList<E> {

  class Node<E> {
    private E data;
    private Node<E> next;

    public Node(E data, Node<E> next) {
      this.data = data;
      this.next = next;
    }
  }

  private Node<E> head;
  private Node<E> crnt;

  public E search(E obj, Comparator<? super E> c) {
    Node<E> ptr = head;

    while (ptr != null) {
      if (c.compare(obj, ptr.data) == 0) {
        crnt = ptr;
        return ptr.data;
      }
      ptr = ptr.next;
    }
    return null; // 검색 실패
  }

  public void addFirst(E obj) {
    Node<E> ptr = head;
    head = crnt = new Node<E>(obj, ptr);
  }

  public void addLast(E obj) {
    if (head == null) {
      addFirst(obj);
    } else {
      Node<E> ptr = head;
      while (ptr.next != null) {
        ptr = ptr.next;
      }
      ptr.next = crnt = new Node<E>(obj, null);
    }
  }

  public void removeFirst() {
    if (head != null) {
      head = crnt = head.next;
    }
  }

  public void removeLast() {
    if (head != null) {
      if (head.next == null) {
        removeFirst();
      } else {
        Node<E> ptr = head;
        Node<E> pre = head;

        while (ptr.next != null) {
          pre = ptr;
          ptr = ptr.next;
        }
        pre.next = null;
        crnt = pre;
      }
    }
  }

  public void remove(Node p) {
    if (head != null) {
      if (head.next == null) {
        removeFirst();
      } else {
        Node<E> ptr = head;

        while (ptr.next != p) {
          if (ptr.next == null) return;
          ptr = ptr.next;
        }
        ptr.next = p.next;
        crnt = ptr;
      }
    }
  }

  public void removeCurrentNode() {
    remove(crnt);
  }

  public void clear() {
    while (head != null) {
      removeFirst();
    }
    crnt = null;
  }

  public boolean next() {
    if (crnt == null || crnt.next == null) {
      return false; // no move
    }
    crnt = crnt.next;
    return true;
  }

  public void printCurrentNode() {
    if (crnt == null) {
      System.out.println("선택한 노드가 없습니다.");
    } else {
      System.out.println(crnt.data);
    }
  }

  public void dump() {
    Node<E> ptr = head;
    while (ptr != null) {
      System.out.println(ptr.data);
      ptr = ptr.next;
    }
  }

  void purge(Comparator <? super E > c) {
    Node<E> ptr = head;
    while(ptr != null) {
      ptr = ptr.next;
    }
  }

  public E retrieve(int n) {
    if(n < 0) return null;

    Node<E> ptr;
    int i;
    for (ptr = head, i = 0; ptr != null && i < n; ++i, ptr = ptr.next) ;

    return ptr != null ? ptr.data : null;
  }
}
