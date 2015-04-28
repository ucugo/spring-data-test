package repositories;

import config.ApplicationConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by uchegc01 on 28/04/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:application-config.xml"})
public class PersonRepositoryTest {

    @Autowired PersonRepository personRepository;

    @Test
    public void testAnything(){

        List<Person> persons = personRepository.findByFirstName("Barry");

        Person person = new Person();

        Person  person1 = personRepository.save(person);

        Assert.assertNotNull(person);

        Assert.assertNotNull(persons);
        Assert.assertEquals(persons.size(),0);
    }

}