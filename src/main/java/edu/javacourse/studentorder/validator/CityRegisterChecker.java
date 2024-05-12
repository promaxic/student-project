package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;

public interface CityRegisterChecker {
    CityRegisterChekerRespons checkPerson(Person person);
}
