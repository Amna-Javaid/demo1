package com.example.demo1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Background;
public class HelloApplication extends Application {
    VaccinationManagement manager = new VaccinationManagement();

    @Override
    public void start(Stage stage) throws IOException {
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
                Text welcomeText = new Text("Welcome, User!");
                welcomeText.setFont(Font.font("Times New Roman", 20));
                GridPane.setHalignment(welcomeText, HPos.CENTER);

                Text status=new Text("Check your vaccination status...");
                Text enroll=new Text("Enroll yourself for the vaccination...");
                Text verify=new Text("Verify yourself here...");

                status.setFont(Font.font("Times new Roman",20));
                enroll.setFont(Font.font("Times new Roman",20));
                verify.setFont(Font.font("Times new Roman",20));

                Button statusbutton=new Button("Status");
                Button enrollbutton=new Button("enroll");
                Button verifybutton=new Button("verify");

                statusbutton.setOnAction(p->{
                    GridPane grid3 = new GridPane();
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

                        String cnic1 = cnic.getText();
                        boolean isVaccinated =manager.checkVaccinationStatus(cnic1);

                        if (isVaccinated) {
                            Text resultText = new Text("Person is vaccinated!");
                            grid3.add(resultText, 2, 3);

                        } else {
                            Text resultText = new Text("Person is not found in vaccinated list.");

                            grid3.add(resultText, 1, 3);
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
                        Scene s5 = new Scene(grid5, 500, 400, Color.LIGHTBLUE);
                        Text txt = new Text("YOU ARE SUCCESSFULLY ENROLLED \n");
                        grid5.add(txt,0,0);
                        txt.setTextAlignment(TextAlignment.CENTER);

                        String cnic = text1.getText();
                        int enteredAge = Integer.parseInt(ageField.getText());
                        int selectedLocation = Integer.parseInt(locationField.getText());
                        String vaccineName ="";
                        String centerName="";
                        int verificationCode;
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

                        Random random = new Random();
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
                Scene scene2 = new Scene(grid2, 500, 400, Color.LIGHTBLUE);

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


