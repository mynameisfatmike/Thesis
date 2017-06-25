package utilities;

import java.io.IOException;
import java.sql.SQLException;

import edu.nau.rtisnl.SegaWebException;
import helpers.IPermissionEntity;
import helpers.IPermissionResource;
import helpers.Person;

public class UserAccessValidator {
	
	public static boolean validate(Person person, IPermissionResource resource){
		try {
			return resource.getAllPersons().stream().anyMatch((Person p) -> p.getPerson_id() == person.getPerson_id());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
