package Collections;

import java.util.ArrayList;
import java.util.List;
/**В данном домашнем задании мы допишем нашу реализацию LinkedList
 Наша реализация будет не такой широкой как в java JDK но основные функции будет выполнять

 Список должен уметь:
 * Вернуть длину списка
 * Вернуть первый элемент
 * Вернуть последний элемент
 * Добавить новый элемент в конец списа (просто операция add)
 * Добавить элемент в начало списка
 * Добавить элемент в конец списка
 * Удалить элемент по индексу
 *** Реализовать возможность прохождения итератором по списку **/

public class Main {
    public static void main(String[] args) {
        CustomLinkList<String> list = new CustomLinkList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("ZXC");
        System.out.println(list.size());
        System.out.println(list.last());
        System.out.println(list.first());
        list.addFirst("VVV");
        System.out.println(list.first());
        System.out.println("********************");
        System.out.println(list.size());
        list.delete(1);
        System.out.println();
        System.out.println("********************");
        System.out.println(list.size());
        for(Object element : list) {
            System.out.println(element);

        }


            }
        }


