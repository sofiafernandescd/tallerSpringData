/*
 * Copyright 2002-2014 the original author or authors.
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

package org.springframework.samples.petclinic;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.samples.petclinic.repository.BillRepository;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.SpecialityRepository;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.samples.petclinic.service.VisitService;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.Specialty;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Visit;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class PetClinicApplication {
	@Autowired
	VetRepository vetRepository;
	@Autowired
	VisitService visitService;
	//se mudarmos onde diz visitRepository para visitService estamos a fazer de forma mais correta

	private static final Logger log = LoggerFactory.getLogger(PetClinicApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(PetClinicApplication.class, args);
	}
}
	
	/*@Bean
	public CommandLineRunner demoOwnerRepository(BillRepository billRepository, PetRepository petRepository, VisitRepository visitRepository) {
		return (args) -> {
			log.info("*****************************************************");
			log.info("BOOTCAMP - Spring y Spring Data - vetRepository");
			log.info("*****************************************************");

			*/
//			log.info("1 - Todas as faturas da BBDD");
//			int counter = 1;
//			for(Bill b : billRepository.findAll()) {
//				log.info("Bill: "+b);
//				counter++;
//			}

			
//	@Bean
//	public CommandLineRunner demoVetRepository(VetRepository vetRepository, SpecialityRepository specialityRepository) {
//		return (args) -> {
//			log.info("*****************************************************");
//			log.info("BOOTCAMP - Spring y Spring Data - vetRepository");
//			log.info("*****************************************************");
//
//			/*List<Vet> vets = vetRepository.findAll();
//			
//			for(Vet vet : vets) {
//				log.info(vet.toString());
//			
//			}*/
////			log.info("criar um novo vet sem especialidade");
////			Vet vet = new Vet();
////			vet.setFirstName("Sérgio");
////			vet.setLastName("Martins");
////			log.info("Persistir na base de dados");
////			vetRepository.save(vet);
////			log.info("encontrar no repositorio:");
////			Vet vetAux = vetRepository.findOne(vet.getId());
////			log.info(vetAux.toString());
////			log.info("adicionar especialidade:");
////			Specialty s = specialityRepository.findOne(1);
////			vetAux.addSpecialty(s);
////			vetAux = vetRepository.save(vetAux);
////			log.info(vet.toString());
////			log.info("listar veterinarios:");
////				for(Vet vet1 : vetRepository.findAll()) {
////					log.info("Vet: "+v);
////				}
////			log.info("Lista de vets por lastname");
////			for(Vet v : vetRepository.findByLastName("Carter")) {
////				log.info("Vet: "+v);
////			}
////			log.info("Lista de vets por first e last name");
////			for(Vet v : vetRepository.findByFirstNameAndLastName("Sérgio", "Martins")) {
////				log.info("Vet: "+v);
////			}
////			log.info("Lista de vets por first ou lastname");
////			for(Vet v : vetRepository.findByFirstNameOrLastName("James", "Martins")) {
////				log.info("Vet: "+v);
////			}
//			log.info("Lista de vets de radiologia");
//			for(Vet v : vetRepository.findBySpecialityName("radiology")) {
//				log.info("Vet: "+v);
//			}
//			
//		};
//    }
//	@Bean
//	
//	public CommandLineRunner demoOwnerRepository(OwnerRepository ownerRepository, PetRepository petRepository, VisitRepository visitRepository) {
//		return (args) -> {
//			log.info("*****************************************************");
//			log.info("BOOTCAMP - Spring y Spring Data - vetRepository");
//			log.info("*****************************************************");
//
//			
//			log.info("filtrar por nome");
//			for(Owner o : ownerRepository.findByFirstNameContainingOrLastNameContaining("Edu","Est")) {
//				log.info("Owner: "+o);
//			}
//			log.info("filtrar por nome mediante query");
//			for(Owner o : ownerRepository.searchOwner("an")) {
//				log.info("Owner: "+o);
//			}
//			log.info("ordenamos por apelido");
//			for(Owner o : ownerRepository.findByOrderByLastName()) {
//				log.info("Owner: "+o);
//			}
//			
//			//Obter os pets nascidos em 2010 ordenados por data ascendente
//			
//			log.info("Obtemos os pets nascidos em ? ordenados por data de nascimento asc");
//			Date date1 = Date.from(LocalDate.of(1995, 1, 1).atStartOfDay(ZoneId.systemDefault()).toInstant());
//			Date date2 = Date.from(LocalDate.of(2002, 1, 1).atStartOfDay(ZoneId.systemDefault()).toInstant());
//			for(Pet p : petRepository.findByBirthDateBetweenOrderByBirthDate(date1, date2)) {
//				log.info("Pet: "+p);
//			}
//			//Criar 3 novas visitas para diferentes pets
//			Visit v1 = new Visit();
//			Visit v2 = new Visit();
//			Visit v3 = new Visit();
//			v1.setPetId(1);
//			v2.setPetId(2);
//			v3.setPetId(3);
//			v1.setDescription("Visita1");
//			v2.setDescription("Visita2");
//			v3.setDescription("Visita3");
//			
//			visitRepository.save(v1);
//			visitRepository.save(v2);
//			visitRepository.save(v3);
//			
//			
//			//Obter todas as visitas para um pet
//			
//			for(Visit v : visitRepository.findByPetId(2)) {
//				log.info("Visitas: "+v);
//			}
//			
//			//Obter 4 visitas mais recentes do sistema
//			
//			for(Visit v : visitRepository.findTop4ByOrderByDateDesc()) {
//				log.info("Visitas top4: "+v);
//			}
//			
//			
//			
//			
//		};
//    }


