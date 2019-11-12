package com.tecsup.petclinic.service;

import java.util.List;

import com.tecsup.petclinic.domain.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

public interface OwnerService {
	
	Owner create(Owner owner);
	/**
	 * 
	 * @param id
	 * @return
	 **/
	Owner update(Owner owner);
	
	void delete(Long id) throws OwnerNotFoundException;
	
	
	Owner findById(long id) throws OwnerNotFoundException;
	
	List<Owner> findByName(String name);
	
	Iterable<Owner> findAll();
}
