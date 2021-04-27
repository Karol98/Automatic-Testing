import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.awt.*;
import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class SpyTest {

    @Spy
    ArrayList<String> spyList = new ArrayList<String>();

    @Test
    public void objects_should_be_spied() {
        spyList.add("one");
        spyList.add("two");

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("two");

        Assert.assertEquals(2, spyList.size());
    }

    @Test
    public void when_stup_a_spy_then_stubbed() {
        ArrayList<String> list = new ArrayList<String>();

        Assert.assertEquals(0, spyList.size());

        Mockito.doReturn(100).when(spyList).size();
        Assert.assertEquals(100, spyList.size());
    }
}
