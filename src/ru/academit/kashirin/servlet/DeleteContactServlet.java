package ru.academit.kashirin.servlet;

import ru.academit.kashirin.PhoneBook;
import ru.academit.kashirin.coverter.ContactConverter;
import ru.academit.kashirin.model.Contact;
import ru.academit.kashirin.service.ContactService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.stream.Collectors;

public class DeleteContactServlet extends HttpServlet {

    private ContactService phoneBookService = PhoneBook.phoneBookService;
    private ContactConverter contactConverter = PhoneBook.contactConverter;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String contactJson = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        Contact contact = contactConverter.convertFormJson(contactJson);
        phoneBookService.deleteContact(contact);
    }
}
