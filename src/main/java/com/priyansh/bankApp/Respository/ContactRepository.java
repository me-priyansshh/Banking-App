package com.priyansh.bankApp.Respository;

import com.priyansh.bankApp.Model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {


}