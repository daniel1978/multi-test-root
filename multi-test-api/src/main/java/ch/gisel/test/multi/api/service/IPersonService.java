package ch.gisel.test.multi.api.service;

import ch.gisel.test.multi.api.dto.PersonDTO;

public interface IPersonService {

    PersonDTO savePerson(PersonDTO person);

    PersonDTO loadPerson(long id);
}
