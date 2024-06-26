package telran.java52.person.model;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class Address implements Serializable {
	private static final long serialVersionUID = -4519309557777183814L;
	String city;
	String street;
	Integer building;

}
