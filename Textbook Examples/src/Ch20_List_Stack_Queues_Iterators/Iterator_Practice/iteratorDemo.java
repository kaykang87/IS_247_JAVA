package Ch20_List_Stack_Queues_Iterators.Iterator_Practice;

/**
 * Created by kyong on 10/28/2016.
 */
import java.util.*;

class iteratorDemo

{

    public static void main(String[] arg)

    {

        List  demoList = new ArrayList();    // create new list

        String demoArray[] = {"john", "bob", "anne", "stella", "fred"};

        for(int i=0; i<demoArray.length;i++)

        {

            demoList.add(demoArray[i]);            // add elements to list

        }

        Iterator itr = demoList.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }}}