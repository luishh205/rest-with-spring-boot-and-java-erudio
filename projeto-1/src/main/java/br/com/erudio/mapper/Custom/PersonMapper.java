package br.com.erudio.mapper.Custom;

import br.com.erudio.dto.PersonDTOV2;
import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonMapper {

    public PersonDTOV2 convertEntityToDTO(Person person){

        PersonDTOV2 dto = new PersonDTOV2();
        dto.setId(person.getId());
        dto.setFisrtName(person.getFisrtName());
        dto.setLastName(person.getLastName());
        dto.setAddress(person.getAddress());
        dto.setGender(person.getGender());
        dto.setBirthDay(new Date());

        return dto;
    }

    public Person convertEntityToEntity(PersonDTOV2 person){

        Person entity = new Person();
        entity.setFisrtName(person.getFisrtName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return entity;
    }
}
