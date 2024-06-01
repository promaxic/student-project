package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.register.AnswerCityRegister;
import edu.javacourse.studentorder.register.AnswerCityRegisterItem;
import edu.javacourse.studentorder.wedding.Child;
import edu.javacourse.studentorder.register.CityRegisterResponse;
import edu.javacourse.studentorder.wedding.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterChecker;
import edu.javacourse.studentorder.validator.register.FakeCityRegisterChecker;
import edu.javacourse.studentorder.wedding.Person;

import java.util.List;

public class CityRegisterValidator {



    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        AnswerCityRegister ans = new AnswerCityRegister();
        try {
            ans.addItem(checkPerson(so.getHusband()));
            ans.addItem(checkPerson(so.getWife()));

            for (Child child : so.getChildren()) {
               ans.addItem(checkPerson(child));
            }

        return ans;
    }
    private AnswerCityRegisterItem checkPerson(Person person){
        try {
            CityRegisterResponse cans = personChecker.checkPerson(person);
        }catch (CityRegisterException ex){
            ex.printStackTrace(System.out);
        }
        return null;
    }
}
