import org.junit.Assert;
import org.junit.jupiter.api.Test;
import person.Person;

public class TestPerson {

    @Test
    public void testDefaultConstructor() {

        Person prsn = new Person();
        Assert.assertNotNull(prsn);

    }

    @Test
    public void testConstructorWithName() {
        String expected = "Jimmy";

        Person prsn = new Person(expected);

        String actual = prsn.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testConstructorWithAge() {
        int expected = 20;

        Person prsn = new Person(expected);

        int actual = prsn.getAge();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testConstructorWithNameAndAge() {
        String expectedName = "Jimmy";
        int expectedAge = 20;
        Person prsn = new Person(expectedName, expectedAge);

        prsn.setName(expectedName);
        prsn.setAge(expectedAge);

        String actualName = prsn.getName();
        int actualAge = prsn.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);

    }

    @Test
    public void testSetName() {
        String expected = "Jimmy";
        Person prsn = new Person(expected);

        String actual = prsn.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetAge() {
        int expected = 20;
        Person prsn = new Person(expected);

        int actual = prsn.getAge();

        Assert.assertEquals(expected, actual);

    }

}
