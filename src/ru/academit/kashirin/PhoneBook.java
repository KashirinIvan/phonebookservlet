package ru.academit.kashirin;

import ru.academit.kashirin.coverter.ContactConverter;
import ru.academit.kashirin.coverter.ContactValidationConverter;
import ru.academit.kashirin.dao.ContactDao;
import ru.academit.kashirin.service.ContactService;
/**
 * Created by Anna on 14.06.2017.
 */
public class PhoneBook {

    public static ContactDao contactDao = new ContactDao();

    public static ContactService phoneBookService = new ContactService();

    public static ContactConverter contactConverter = new ContactConverter();

    public static ContactValidationConverter contactValidationConverter = new ContactValidationConverter();
}
