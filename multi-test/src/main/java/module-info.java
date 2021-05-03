module multi.test {
    requires multi.test.api;

    provides ch.gisel.test.multi.api.service.IPersonService with ch.gisel.test.multi.service.impl.PersonService;
}