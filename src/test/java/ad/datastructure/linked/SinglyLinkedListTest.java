package ad.datastructure.linked;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SinglyLinkedListTest {

    @Test
    public void reverseRecursion() {
        SinglyLinkedList<String> strings = new SinglyLinkedList<>();
        strings.append("1");
        strings.append("2");
        strings.append("3");
        strings.append("4");
        strings.append("5");
        for (String string : strings) {
            System.out.println("string = " + string);
        }
        strings.reverseRecursion();
//        strings.reverse();
        for (String string : strings) {
            System.out.println("string = " + string);
        }
    }
}