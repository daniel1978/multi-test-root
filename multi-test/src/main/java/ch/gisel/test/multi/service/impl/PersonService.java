package ch.gisel.test.multi.service.impl;

import ch.gisel.test.multi.api.dto.PersonDTO;
import ch.gisel.test.multi.api.service.IPersonService;

import java.util.HashMap;
import java.util.Map;

public class PersonService implements IPersonService {

    private long currentId = 0;
    private Map<Long, PersonDTO> personMap = new HashMap<>();

    @Override
    public PersonDTO savePerson(PersonDTO person) {
        if (person.getId() == null) {
            person.setId(currentId);
            currentId ++;
        }
        personMap.put(person.getId(), person);
        return person;
    }

    @Override
    public PersonDTO loadPerson(long id) {
        return personMap.get(id);
    }
}
