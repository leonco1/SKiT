import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
public class IteratorTest {
    private List<String>ukVisaApplicationsList;
    private List<String>usVisaApplicationsList;
    private void checkList()
    {
       if ( ukVisaApplicationsList==null||usVisaApplicationsList ==null)
           throw  new NullPointerException();

    }
    @Before public void setUp()         // set up test fixture
    {
        ukVisaApplicationsList=new ArrayList<>();
        usVisaApplicationsList=new ArrayList<>();
        for(int i=1;i<=4;i++) {
            ukVisaApplicationsList.add(String.valueOf(i));
            usVisaApplicationsList.add(String.valueOf(i+4));
        }
    }
    private Integer getCount()
    {
        int count=0;
        for(String s:ukVisaApplicationsList)
        {
            if(!usVisaApplicationsList.contains(s))
                count++;
        }
        return count!=0?count:null;
    }

    //Test1 BC-Тест1 (T T T T C5.1):
    @Test public void Test1()
    {

            int count=getCount();
            assertEquals(4,count);
    }
    //Тест 2(FTFTC5.1)
    @Test public void Test2()
    {
        ukVisaApplicationsList=null;
        assertThrows("Lists must not be null",NullPointerException.class, this::checkList);
    }
    //Тест3(TFTFC5.1)
    @Test public void Test3()
    {
        usVisaApplicationsList=null;
        assertThrows("Lists must not be null",NullPointerException.class, this::checkList);
    }
    //Тест4-(TTFTC5.1)
    @Test public void Test4()
    {
        ukVisaApplicationsList=new ArrayList<>();
        for(int i=1;i<=4;i++) {
            usVisaApplicationsList.add(String.valueOf(i));
        }

        assertNull(this.getCount());
    }
    //Тест5-(TTTFC5.1)
@Test public void Test5()
{
    usVisaApplicationsList=new ArrayList<>();
    int count=getCount();
    assertEquals(4,count);
}
//Тест6-(TTTTC5.2)
    @Test public void Test6()
    {
        ukVisaApplicationsList=new ArrayList<>();
        usVisaApplicationsList=new ArrayList<>();
        for(int i=1;i<=4;i++)
        {
            ukVisaApplicationsList.add(String.valueOf(i));
            usVisaApplicationsList.add(String.valueOf(i));
        }
        assertNull(getCount());
    }
}
