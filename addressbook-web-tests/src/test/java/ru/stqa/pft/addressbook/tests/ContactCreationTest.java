package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

    @Test (enabled = true)
    public void testContactCreation() throws Exception {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactCreation(new ContactData("Petr", "Petrovich", "cucu@mail.ru", "efr"));
        app.getContactHelper().submitContactCreation();
        app.goTo().gotoHomePage();
    }
}
