import jsonparsing.Person;
import org.junit.Assert;
import org.junit.Test;

public class LombokTest {


    @Test
    public void LombokBuilderTest() {
        Person person = Person.builder()
                .name("Karol")
                .surname("Kowalski")
                .build();
        Assert.assertEquals(person.getName(),"Karol");
        Assert.assertEquals(person.getSurname(),"Kowalski");
    }

    @Test
    public void LombokNoArgsConstructorTest() {
        Person person = new Person();
        Assert.assertEquals(person.getClass(),Person.class);
    }

    @Test
    public void LombokAllArgsConstructorTest() {
        Person person = new Person("Karol","Kowalski");
        Assert.assertNotNull(person);
    }

    @Test
    public void LombokGetterTest() {
        Person person = new Person("Karol","Kowalski");
        Assert.assertEquals(person.getName(),"Karol");
        Assert.assertEquals(person.getSurname(),"Kowalski");
    }

    @Test
    public void LombokSetterTest() {
        Person person = new Person();
        person.setName("Karol");
        person.setSurname("Kowalski");
        Assert.assertEquals(person.getName(),"Karol");
        Assert.assertEquals(person.getSurname(),"Kowalski");
    }
}
