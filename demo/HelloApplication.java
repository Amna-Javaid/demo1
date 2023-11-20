//package com.example.demo;
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.geometry.HPos;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;
//import javafx.scene.text.TextAlignment;
//import javafx.stage.Stage;
//import java.util.List;
//import java.util.ArrayList;
//
// class Person {
//     String name;
//     String CNIC;
//     String depart;
//     boolean isVaccinated;
//
//     public Person(String name, String CNIC, String depart, boolean isVaccinated) {
//         this.name = name;
//         this.CNIC = CNIC;
//         this.depart = depart;
//         this.isVaccinated = isVaccinated;
//     }
// }
//public class HelloApplication extends Application {
//
//    List<Person> persons = new ArrayList<>();
////
//
//    @Override
//    public void start(Stage stage) {
//
//
//        persons.add(new Person("Amna" ,"36726792-79","finance",true));
//        persons.add(new Person("Areesha" ,"36723232-79","engenering ",false));
//        persons.add(new Person("Anam" ,"33896792-79","technical",true));
//        persons.add(new Person("Faiza" ,"36782392-79","Management",false));
//
//
//        GridPane g1 = new GridPane();
//
//
//
//        Scene scene = new Scene(g1, 500, 400, Color.GRAY);
//        stage.setResizable(false);
//        stage.setTitle("Hello to my world");
//
//        Text t1 = new Text("Login Interface...");
//        t1.setFont(Font.font("Times new Roman", 30));
//        t1.setTextAlignment(TextAlignment.CENTER);
//       g1.setPadding(new Insets(10,10,10,10));
//g1.setHgap(5);
//g1.setVgap(5);
//
//        g1.add(t1, 1, 1);
//        GridPane.setHalignment(t1, HPos.CENTER);
//        Text txt1=new Text("Email Id:");
//        Text txt2=new Text("Password:");
//        g1.add(txt2,1,3);
//        g1.add(txt1,1,2);
//        txt1.setFont(Font.font("Times new Roman",20));
//        txt2.setFont(Font.font("Times new Roman",20));
//
//        Button b1=new Button("Login");
//        Button b2=new Button("Exit");
//        b1.setBackground(Background.fill(Color.BLUE));
//        b2.setBackground(Background.fill(Color.BLUE));
//        b1.setMinSize(20,20);
//        b2.setMinSize(50,30);
//        b1.setFont(Font.font("times new roman",15));
//        b2.setFont(Font.font("times new roman",15));
//
//        b1.setTextFill(Color.WHITE);
//        b2.setTextFill(Color.WHITE);
//
//g1.add(b1,2,5);
//g1.add(b2,3,5);
//
//        TextField text=new TextField();
//      g1.add(text,2,2);
//        PasswordField p1=new PasswordField();
//        g1.add(p1,2,3);
//
//b2.setOnAction(e->{
//    Platform.exit();
//
//});
//
//        b1.setOnAction(e->{
//            String email=text.getText();
//            String password=p1.getText();
//            if(isValidEmail(email) && isValidPassword(password)){
//                Text t3=new Text("loging in successfullyy..");
//                g1.add(t3,1,6);
//
//                GridPane grid2 = new GridPane();
//                Text welcomeText = new Text(" WElCOME USER! ");
//                welcomeText.setFont(Font.font("Times New Roman", 20));
//                GridPane.setHalignment(welcomeText, HPos.CENTER);
//
//                Text status=new Text("Check your vaccination status...");
//                Text enroll=new Text("Enroll yourself for the vaccination...");
//                Text verify=new Text("Verify yourself here...");
//
//                status.setFont(Font.font("Times new Roman",20));
//                enroll.setFont(Font.font("Times new Roman",20));
//                verify.setFont(Font.font("Times new Roman",20));
//
//                Button statusbutton=new Button("Status");
//                Button enrollbutton=new Button("enroll");
//                Button verifybutton=new Button("verify");
//
//                enrollbutton.setOnAction(s->{
//
//
//
//                });
//
//
//
//                statusbutton.setOnAction(p->{
//                    GridPane grid3 = new GridPane();
//                    Text check= new Text("Enter your CNIC here");
//                    check.setFont(Font.font("Times New Roman", 20));
//                    grid3.add(check,0,0);
//
//                    TextField cnic=new TextField();
//                    grid3.add(cnic,1,1);
//
//                    Button submit1=new Button("Submit");
//                    submit1.setBackground(Background.fill(Color.RED));
//                    submit1.setTextFill(Color.WHITE);
//                    grid3.add(submit1,1,2);
//
//                    grid3.setVgap(10);
//                    grid3.setHgap(10);
//
//                    submit1.setOnAction(w->{
//
//                        String CNIC=cnic.getText();
//                        for (Person o : persons)
//                        {
//                            if (o.CNIC.equals(CNIC))
//                            {
//                                if (o.isVaccinated){
//                                    Text v1=new Text("You are already vaccinated");
//                                    grid3.add(v1,1,3);
//                                }
//                                else {
//                                    Text v2=new Text("You are not vaccinated yet");
//                                    grid3.add(v2,1,3);                                }
//                            }
//                        }
//
//
//
//                    });
//
//
//                    Scene s3 = new Scene(grid3, 500, 400, Color.LIGHTBLUE);
//
//                    stage.setScene(s3);
//                    stage.show();
//
//                });
//
//                statusbutton.setTextFill(Color.WHITE);
//                enrollbutton.setTextFill(Color.WHITE);
//                verifybutton.setTextFill(Color.WHITE);
//
//                grid2.setVgap(10);
//                grid2.setHgap(10);
//
//                statusbutton.setBackground(Background.fill(Color.BLUE));
//                enrollbutton.setBackground(Background.fill(Color.BLUE));
//                verifybutton.setBackground(Background.fill(Color.BLUE));
//
//                grid2.add(status,0,1);
//                grid2.add(statusbutton,1,1);
//                grid2.add(enroll,0,2);
//                grid2.add(enrollbutton,1,2);
//                grid2.add(verify,0,3);
//                grid2.add(verifybutton,1,3);
//
//
//
//
//                grid2.add(welcomeText, 0, 0);
//                Scene scene2 = new Scene(grid2, 824, 529, Color.LIGHTBLUE);
//
//                Image backgroundImage=new Image("file:src/main/resources/img_1.png");
//
//                BackgroundImage background = new BackgroundImage(
//                        backgroundImage,
//                        BackgroundRepeat.NO_REPEAT,
//                        BackgroundRepeat.NO_REPEAT,
//                        BackgroundPosition.DEFAULT,
//                        BackgroundSize.DEFAULT
//                );
//
////
//                grid2.setBackground(new Background(background));
//
////                grid2.setPadding(new Insets(80,20,20,20));
//
//                RowConstraints row1 = new RowConstraints();
//                row1.setPercentHeight(20); // Adjust the percentage as needed
//                RowConstraints row2 = new RowConstraints();
//                row2.setPercentHeight(5); // Adjust the percentage as needed
//                RowConstraints row3 = new RowConstraints();
//                row3.setPercentHeight(10); // Adjust the percentage as needed
//
//                grid2.getRowConstraints().addAll(row1, row2, row3);
//
//                stage.setScene(scene2);
//            stage.show();
//
//            }
//            else{
//                Text t4=new Text("invalid username and password");
//                g1.add(t4,1,7);
//
//            }
//
//
//        });
//
//
//        stage.setScene(scene);
//        stage.show();
//
//
//
//    }
//
//
//    private boolean isValidEmail(String email) {
//        return email != null && email.contains("@") && email.contains("gmail.com");
//    }
//
//    private boolean isValidPassword(String password) {
//        return password != null && !password.trim().isEmpty() && password.length() >= 6;
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }


package com.example.demo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Person {
    String name;
    String CNIC;
    String depart;
    boolean isVaccinated;

    public Person(String name, String CNIC, String depart, boolean isVaccinated) {
        this.name = name;
        this.CNIC = CNIC;
        this.depart = depart;
        this.isVaccinated = isVaccinated;

    }
}



public class HelloApplication extends Application {
    List<Person> persons = new ArrayList<>();
//    VaccinationManagement manager = new VaccinationManagement();
Random random = new Random();
    int verificationCode;



    @Override
    public void start(Stage stage) {

        persons.add(new Person("Amna" ,"36726792-79","finance",true));
        persons.add(new Person("Areesha" ,"36723232-79","engenering ",false));
        persons.add(new Person("Anam" ,"33896792-79","technical",true));
        persons.add(new Person("Faiza" ,"36782392-79","Management",false));


        GridPane g1 = new GridPane();
        Scene scene = new Scene(g1, 500, 400, Color.GRAY);
        stage.setResizable(false);
        stage.setTitle("Hello to our vaccination interface");

        Text t1 = new Text("Login Interface...");
        t1.setFont(Font.font("Times new Roman", 30));
        t1.setTextAlignment(TextAlignment.CENTER);
        g1.setPadding(new Insets(10,10,10,10));
        g1.setHgap(5);
        g1.setVgap(5);

        g1.add(t1, 1, 1);
        GridPane.setHalignment(t1, HPos.CENTER);
        Text txt1=new Text("Email Id:");
        Text txt2=new Text("Password:");
        g1.add(txt2,1,3);
        g1.add(txt1,1,2);
        txt1.setFont(Font.font("Times new Roman",20));
        txt2.setFont(Font.font("Times new Roman",20));

        Button b1=new Button("Login");
        Button b2=new Button("Exit");
        b1.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));


        b2.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
        b1.setMinSize(20,20);
        b2.setMinSize(50,30);
        b1.setFont(Font.font("times new roman",15));
        b2.setFont(Font.font("times new roman",15));

        b1.setTextFill(Color.WHITE);
        b2.setTextFill(Color.WHITE);

        g1.add(b1,2,5);
        g1.add(b2,3,5);

        TextField text=new TextField();
        g1.add(text,2,2);
        PasswordField p1=new PasswordField();
        g1.add(p1,2,3);

        b2.setOnAction(e->{
            Platform.exit();

        });

        b1.setOnAction(e->{
            String email=text.getText();
            String password=p1.getText();
            if(isValidEmail(email) && isValidPassword(password)){
                Text t3=new Text("loging in successfullyy..");
                g1.add(t3,1,6);

                GridPane grid2 = new GridPane();
                Scene scene2 = new Scene(grid2, 824, 529, Color.LIGHTBLUE);

                Button backButton = new Button("Back");
                backButton.setOnAction(m -> stage.setScene(scene)); // Set the appropriate scene here
                grid2.add(backButton, 5, 0);

                Text welcomeText = new Text("Welcome, User!");
                welcomeText.setFont(Font.font("Times New Roman", 20));
                GridPane.setHalignment(welcomeText, HPos.CENTER);

                Text status=new Text("Check your vaccination status...");
                Text enroll=new Text("Enroll yourself for the vaccination...");
                Text verify=new Text("Verify yourself here...");
                        status.setFill(Color.WHITE);
                enroll.setFill(Color.WHITE);
                verify.setFill(Color.WHITE);
                status.setFont(Font.font("Times new Roman",20));
                enroll.setFont(Font.font("Times new Roman",20));
                verify.setFont(Font.font("Times new Roman",20));

                Button statusbutton=new Button("Status");
                Button enrollbutton=new Button("enroll");
                Button verifybutton=new Button("verify");


                statusbutton.setOnAction(p->{
                    GridPane grid3 = new GridPane();

                    Button backButton2 = new Button("Back");
                    backButton2.setOnAction(m -> stage.setScene(scene2)); // Set the appropriate scene here

                    grid3.add(backButton2, 5, 0);

                    Text check= new Text("Enter your CNIC here");
                    check.setFont(Font.font("Times New Roman", 20));
                    grid3.add(check,0,0);

                    TextField cnic=new TextField();
                    grid3.add(cnic,1,1);

                    Button submit1=new Button("Submit");


                    submit1.setBackground(new Background(new BackgroundFill(Color.RED,null,null)));

                    submit1.setTextFill(Color.WHITE);
                    grid3.add(submit1,1,2);

                    grid3.setVgap(10);
                    grid3.setHgap(10);

                    submit1.setOnAction(w->{


                        String CNIC=cnic.getText();
                        for (Person o : persons)
                        {
                            if (o.CNIC.equals(CNIC))
                            {
                                if (o.isVaccinated){
                                    Text v1=new Text("You are already vaccinated");
                                    grid3.add(v1,1,3);
                                }
                                else {
                                    Text v2=new Text("You are not vaccinated yet");
                                    grid3.add(v2,1,3);                                }
                            }
                        }






                    });

                    Scene s3 = new Scene(grid3, 500, 400, Color.LIGHTBLUE);

                    stage.setScene(s3);
                    stage.show();

                });

                enrollbutton.setOnAction(p->{
                    GridPane grid4 = new GridPane();
                    Scene s4= new Scene(grid4, 500, 400, Color.LIGHTBLUE);


                    Text enrollText= new Text("Get yourself enroll for Vaccination");
                    enrollText.setFont(Font.font("Times New Roman", 20));
                    enrollText.setTextAlignment(TextAlignment.CENTER);
                    grid4.setPadding(new Insets(10,10,10,10));
                    grid4.setHgap(5);
                    grid4.setVgap(5);

                    grid4.add(enrollText,0,0);

                    Text cnic2=new Text("Enter your CNIC :");
                    grid4.add(cnic2,0,1);

                    TextField text1=new TextField();
                    grid4.add(text1,1,1);

                    Text age=new Text("Enter your age :");
                    grid4.add(age,0,2);

                    TextField ageField=new TextField();
                    grid4.add( ageField,1,2);
                    Text locations = new Text ("Select the nearest Vaccination Center number \n 1: Jinnah Hospital\n2:Expo Center \n 3: Mio Hospital");
                    TextField locationField = new TextField();
                    grid4.add(locations,0,3);
                    grid4.add( locationField ,1,3);

                    Button btn = new Button("Done");
                    grid4.add(btn,0,5);
                    btn.setTextAlignment(TextAlignment.CENTER);


                    btn.setBackground(new Background(new BackgroundFill(Color.GREEN,null,null)));

                    btn.setOnAction(a->{
                        GridPane grid5 =new GridPane();

                        Button backButton5 = new Button("Back");
                        backButton5.setOnAction(m -> stage.setScene(scene2)); // Set the appropriate scene here

                        grid5.add(backButton5, 5, 0);


                        Scene s5 = new Scene(grid5, 500, 400, Color.LIGHTBLUE);
                        Text txt = new Text("YOU ARE SUCCESSFULLY ENROLLED \n");
                        grid5.add(txt,0,0);
                        txt.setTextAlignment(TextAlignment.CENTER);

                        String cnic = text1.getText();
                        int enteredAge = Integer.parseInt(ageField.getText());
                        int selectedLocation = Integer.parseInt(locationField.getText());
                        String vaccineName ="";
                        String centerName="";

                        if (enteredAge>=1 && enteredAge<11){
                            vaccineName = "Pfizer";
                        }
                        else if (enteredAge>=12 && enteredAge<20){
                            vaccineName="Novavax";
                        }
                        else if (enteredAge>=21&& enteredAge<100) {
                            vaccineName = "Moderna ";
                        }
                        else {
                            vaccineName="No vaccine can be allot ";
                        }
                        if (selectedLocation==1)
                        {
                            centerName = "Jinnah center";
                        }
                        else if (selectedLocation==2)
                        {
                            centerName = "Expo center";
                        }
                        else if (selectedLocation==3)
                        {
                            centerName = "Mio Hospital";
                        }

                        verificationCode = 1000 + random.nextInt(9000);




                        // Display CNIC, Age, Vaccine Name
                        Text cnicText = new Text("Your CNIC: " +cnic );
                        Text ageText = new Text("Your Age: " + enteredAge);
                        Text vaccineText = new Text("Vaccine: " + vaccineName);
                        Text allocatedCenter = new Text("Allocated Vaccination Center: " + centerName);
                        Text verificationText = new Text("Your Verification Code: " + verificationCode);




                        grid5.add(cnicText, 0, 2);
                        grid5.add(ageText, 0, 3);
                        grid5.add(vaccineText, 0, 4);
                        grid5.add(allocatedCenter, 0, 5);
                        grid5.add(verificationText, 0, 6);



                        stage.setScene(s5);
                        stage.show();


                    });
                    stage.setScene(s4);
                    stage.show();
                });

                verifybutton.setOnAction(q->{

                    GridPane grid6=new GridPane();

                    grid6.setHgap(20);
                    grid6.setVgap(20);

                    Scene scene6 = new Scene(grid6, 500, 400, Color.LIGHTBLUE);
                    Text t6=new Text("Verify yourself by providing us the code");
                    grid6.add(t6,0,0);
t6.setFont(Font.font("Times new Roman",20));

                     HBox h1=new HBox();
                    Text t7=new Text("code:");
                    t7.setFont(Font.font("Times new Roman",20));
                    TextField  code=new TextField();
                 h1.getChildren().addAll(t7,code);
                 grid6.add(h1,0,1);


                    // Create an HBox to contain the button
                    HBox buttonContainer = new HBox();
                    buttonContainer.setPadding(new Insets(0, 0, 0, 100));

                    Button submit2 = new Button("Submit");
                    submit2.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
                    submit2.setTextFill(Color.WHITE);
                    buttonContainer.getChildren().add(submit2);

                    grid6.add(buttonContainer, 0, 2);



                    submit2.setOnAction(c->{

                        int usercode=Integer.parseInt(code.getText());

                        if(usercode==verificationCode){
                                 Text vrifytext=new Text("Verification is successful..");
                                 grid6.add(vrifytext,1,3);

                        }
                        else{
                            Text verify2=new Text("Invalid vaccination code..");
                            grid6.add(verify2,1,3);
                        }


                    });


                    stage.setScene(scene6);
                    stage.show();

                });



                statusbutton.setTextFill(Color.WHITE);
                enrollbutton.setTextFill(Color.WHITE);
                verifybutton.setTextFill(Color.WHITE);

                grid2.setVgap(10);
                grid2.setHgap(10);



                statusbutton.setBackground(new Background(new BackgroundFill(Color.BLUE,null,null)));
                verifybutton.setBackground(new Background(new BackgroundFill(Color.BLUE,null,null)));
                enrollbutton.setBackground(new Background(new BackgroundFill(Color.BLUE,null,null)));



                grid2.add(status,0,1);
                grid2.add(statusbutton,1,1);
                grid2.add(enroll,0,2);
                grid2.add(enrollbutton,1,2);
                grid2.add(verify,0,3);
                grid2.add(verifybutton,1,3);


                grid2.add(welcomeText, 0, 0);



                Image backgroundImage=new Image("file:src/main/resources/img_1.png");
//
                BackgroundImage background = new BackgroundImage(
                        backgroundImage,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.DEFAULT,
                        BackgroundSize.DEFAULT
                );

//
                grid2.setBackground(new Background(background));

//                grid2.setPadding(new Insets(80,20,20,20));

                RowConstraints row1 = new RowConstraints();
                row1.setPercentHeight(20); // Adjust the percentage as needed
                RowConstraints row2 = new RowConstraints();
                row2.setPercentHeight(5); // Adjust the percentage as needed
                RowConstraints row3 = new RowConstraints();
                row3.setPercentHeight(10); // Adjust the percentage as needed

                grid2.getRowConstraints().addAll(row1, row2, row3);

                stage.setScene(scene2);
                stage.show();

            }
            else{
                Text t4=new Text("invalid username and password");
                g1.add(t4,1,7);

            }


        });


        stage.setScene(scene);
        stage.show();



    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains("gmail.com");
    }

    private boolean isValidPassword(String password) {
        return password != null && !password.trim().isEmpty() && password.length() >= 6;
    }

    public static void main(String[] args) {

        launch(args);
    }

}