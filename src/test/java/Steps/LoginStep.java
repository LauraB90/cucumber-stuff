package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import java.util.ArrayList;
import java.util.List;

public class  LoginStep {

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("see the userform ");
    }

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        System.out.println("navigate login page");
    }


    @And("I click login")
    public void iClickLogin() {
        System.out.println(" click login button");
    }


    @And("I enter the following data")
    public void iEnterTheFollowingData(DataTable table) throws Throwable {


//       List<List<String>> testData = table.asLists();
//
//        System.out.println("the value is : " + testData.get(0).get(0));
//        System.out.println("the value is : " + testData.get(0).get(1));
//    }
//}

     List<User> users = table.asList(User.class);




        for (User user : users) {
            System.out.println("the username is :" + user.username);
            System.out.println("the password is :" + user.password);

        }
    }

    public class User {

        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }

    }
    //fix one more

}



