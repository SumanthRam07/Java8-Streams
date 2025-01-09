import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question30 {

    //comparing chaingin

    public static void main(String[] args) {

        List<String> list = Arrays.asList("sumanth", "aohityt", "manoj", "bhanu", "jashwanth", "harsha");

        list.sort(
                (i, j)-> i.length() -j.length()


        );

        Collections.sort(list);

        System.out.println(list
        );

    }
}