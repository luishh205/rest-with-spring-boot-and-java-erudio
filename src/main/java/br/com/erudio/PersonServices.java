package br.com.erudio;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFisrtName("Luis henrique");
        person.setLastName("ramos");
        person.setAddress("minas gerais");
        person.setGender("male");
        return person;
    }

    public List<Person> findAll() {
        logger.info("Finding all Person!");

        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);

            persons.add(person);
        }
        return persons;
    }

    public Person mockPerson(int i){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFisrtName("Luis Henrique " + i);
        person.setLastName(" ramos");
        person.setAddress("Capitólio - Minas Gerais");
        person.setGender("male");
        return person;
    }

    public Person create(Person person){
        logger.info("Creating one Person!");

        return person;
    }

    public Person update(Person person){
        logger.info("Update one Person!");

        return person;
    }
    public void delete(String id){
        logger.info("delete one Person!");

    }
}
