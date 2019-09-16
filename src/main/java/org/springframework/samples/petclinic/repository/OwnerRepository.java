/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Vet;


public interface OwnerRepository extends JpaRepository<Owner, Integer> {

    Owner findById(Integer id);
    
    List<Owner> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
    
    @Query("select o from Owner o where o.firstName like %:q% or o.lastName like %:q%")
	List<Owner> searchOwner(@Param("q") String query);
    
    List<Owner> findByOrderByLastName();
    
}
 