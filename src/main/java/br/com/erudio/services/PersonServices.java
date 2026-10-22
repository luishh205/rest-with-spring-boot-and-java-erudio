package br.com.erudio.services;

import br.com.erudio.exception.ResourceNotFoundException;
import br.com.erudio.model.Person;
import br.com.erudio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.*;

@Service
public class PersonServices {

    @Autowired
    PersonRepository repository;

    private final Logger logger = getLogger(PersonServices.class.getName());

    public Person findById(Long id){
        logger.info("Finding one Person!");

        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("no recoruds found for this ID"));
    }

    public List<Person> findAll() {
        logger.info("Finding all Person!");

        return repository.findAll();
    }

    public Person create(Person person){
        logger.info("Creating one Person!");

        return repository.save(person);
    }

    public Person update(Person person){
        logger.info("Update one Person!");

        Person entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("no recoruds found for this ID"));
        entity.setGender(person.getGender());
        entity.setAddress(person.getAddress());
        entity.setLastName(person.getLastName());
        entity.setLastName(person.getLastName());

        return repository.save(entity);
    }
    public void delete(Long id){
        logger.info("delete one Person!");

        repository.deleteById(id);
    }
}
