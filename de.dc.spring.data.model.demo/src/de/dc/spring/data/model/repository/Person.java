package de.dc.spring.data.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import de.dc.spring.data.model.entity.*;

@Repository
public class Person extends JpaRepository<Person, Long>{
}
