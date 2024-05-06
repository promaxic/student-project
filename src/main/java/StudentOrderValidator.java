public class StudentOrderValidator {
    public static void main(String[] args) {

        checkAll();
    }

    static void checkAll(){

        while (true){
            StudentOrder so = readStudentOrder();

            if (so == null){
                break;
            }

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success){
                //continue;
                break;
            }

            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
    }
    /*достаточно объёмное описание
    текущей операции для того.
    что бы люди вас понимали
     */
     static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder(); // текст как комментарий
        return so;
    }
    static AnswerCityRegister checkCityRegister(StudentOrder so){
         CityRegisterValidator crv1 = new CityRegisterValidator();
         crv1.hostName = "Host1";
         CityRegisterValidator crv2 = new CityRegisterValidator();
         crv2.hostName = "Host2";
         AnswerCityRegister ans1 = crv1.checkCityRegister(so);
         AnswerCityRegister ans2 = crv2.checkCityRegister(so);
         return ans1;

    }
    static AnswerWedding checkWedding(StudentOrder so){
       WeddingValidator wd = new WeddingValidator();
       return wd.checkWedding(so);
    }
    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children check is running");
        return new AnswerChildren();
    }
    static AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Students is running");
        return new AnswerStudent();
    }
    static void sendMail(StudentOrder so){
        System.out.println("Sending Email");

    }
}
