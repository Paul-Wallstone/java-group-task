package by.homework.lessons.lesson05;

/**
 * @author ppuchinsky
 */
public class PhoneNumberValidator {
    public void validatePhoneNumber2(String number) {
//        PhoneNumber phoneNumber = new PhoneNumber();
    }

    private int id = 232323;

    public void validatePhoneNumber(String number) {

        class PhoneNumber {
            private String phoneNumber;
            private int phineId;

            public PhoneNumber() {
                this.phoneNumber = number;
                this.phineId = id;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }
        }
        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.phoneNumber);
    }

}
