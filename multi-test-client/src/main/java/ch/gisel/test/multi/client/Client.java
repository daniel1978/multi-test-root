package ch.gisel.test.multi.client;

import ch.gisel.test.multi.api.dto.PersonDTO;
import ch.gisel.test.multi.api.service.IPersonService;

import java.util.ServiceLoader;

public class Client {

    public static void main(String[] args) {
        System.out.println("Start Test");
        ServiceLoader<IPersonService> loader = ServiceLoader.load(IPersonService.class);
        int counter = 0;
        for (final IPersonService service : loader) {
            System.out.println("Implementation found: " + counter);
            usePersonService(service);
            counter ++;
            //System.out.println("The service " + service.getClass().getSimpleName() + " answers " + service.theAnswer());
        }
    }

    private static void usePersonService(IPersonService personService) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName("Smith");
        personDTO.setFirstName("Jo");
        System.out.println("Before Save: " + personDTO.toString());
        personDTO = personService.savePerson(personDTO);
        System.out.println("After Save: " + personDTO.toString());
        personDTO = personService.loadPerson(personDTO.getId());
        System.out.println("After Load: " + personDTO.toString());
    }
}
