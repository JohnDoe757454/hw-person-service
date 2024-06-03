package telran.java52.person.service;

import telran.java52.person.dto.AddresDto;
import telran.java52.person.dto.CityPopulationDto;
import telran.java52.person.dto.PersonDto;

public interface PersonService {
	Boolean addPerson(PersonDto personDto);

	PersonDto findPersonById(Integer id);

	Iterable<PersonDto> findPersonsByCity(String city);

	Iterable<PersonDto> findPersonsByAges(Integer minAge, Integer maxAge);

	PersonDto updateName(Integer id, String name);

	Iterable<PersonDto> findPersonsByName(String name);

	Iterable<CityPopulationDto> getCityPopulation();
	
	PersonDto updateAddrress(Integer id, AddresDto addresDto);
	
	PersonDto deletePersonById(Integer id);
	
}
