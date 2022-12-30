package lossely_coupled;

import lossely_coupled.FullTimeMentor;
import lossely_coupled.MentorAccount;

public class CydeoApp {
    public static void main(String[] args) {

      FullTimeMentor fullTimeMentor = new FullTimeMentor();


      MentorAccount mentor = new MentorAccount(fullTimeMentor);

      mentor.manageAccount();

    }
}