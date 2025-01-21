package com.educandoweb.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//Anotação Repository não necessária pois a classe herda do JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{

}
