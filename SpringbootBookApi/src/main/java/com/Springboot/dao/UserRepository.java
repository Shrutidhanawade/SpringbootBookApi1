
package com.Springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.Springboot.entities.Books;

public interface UserRepository extends CrudRepository<Books,Integer>
{

}
