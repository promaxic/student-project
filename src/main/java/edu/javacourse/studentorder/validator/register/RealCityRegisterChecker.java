package edu.javacourse.studentorder.validator.register;


import edu.javacourse.studentorder.exception.TransportException;
import edu.javacourse.studentorder.register.CityRegisterResponse;
import edu.javacourse.studentorder.wedding.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker
{
    public CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException, TransportException {
        return null;
    }