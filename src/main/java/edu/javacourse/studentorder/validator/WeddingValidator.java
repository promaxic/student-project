package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerWedding;
import edu.javacourse.studentorder.wedding.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }
}
