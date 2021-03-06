package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Appointment {
    int Appointment_ID;
    String Title;
    String Description;
    String Location;
    String Type;
    String Start;
    String End;
    LocalDateTime StartLocal;
    LocalDateTime  EndLocal;
    Timestamp Create_Date;
    String Created_By;
    Timestamp Last_Update;
    String Last_Updated_By;
    int Customer_ID;
    int User_ID;
    int Contact_ID;
    private static ObservableList<Appointment> allAppointments = FXCollections.observableArrayList();

    /**
     * First constructor method to create instance of class using all fields in DB
     */
    public Appointment(int Appointment_ID, String Title, String Description, String Location, String Type, String Start,
                       String End, Timestamp Create_Date, String Created_By,
                       Timestamp Last_Update, String Last_Updated_By, int Customer_ID, int User_ID, int Contact_ID) {
        this.Appointment_ID = Appointment_ID;
        this.Title = Title;
        this.Description = Description;
        this.Location = Location;
        this.Type = Type;
        this.Start = Start;
        this.End = End;
        this.Create_Date = Create_Date;
        this.Created_By = Created_By;
        this.Last_Update = Last_Update;
        this.Last_Updated_By = Last_Updated_By;
        this.Customer_ID = Customer_ID;
        this.User_ID = User_ID;
        this.Contact_ID = Contact_ID;
    }
    public Appointment(int Appointment_ID, int Customer_ID,int User_ID,String Title, String Description, String Location,int Contact_ID, String Type, String Start,
                       String End) {
        this.Appointment_ID = Appointment_ID;
        this.Title = Title;
        this.Description = Description;
        this.Location = Location;
        this.Type = Type;
        this.Start = Start;
        this.End = End;
        this.Customer_ID = Customer_ID;
        this.User_ID = User_ID;
        this.Contact_ID = Contact_ID;
    }
    public Appointment(int Appointment_ID, int Customer_ID,int User_ID,String Title, String Description, String Location,int Contact_ID, String Type, LocalDateTime Start,
                       LocalDateTime End) {
        this.Appointment_ID = Appointment_ID;
        this.Title = Title;
        this.Description = Description;
        this.Location = Location;
        this.Type = Type;
        this.StartLocal = Start;
        this.EndLocal = End;
        this.Customer_ID = Customer_ID;
        this.User_ID = User_ID;
        this.Contact_ID = Contact_ID;
    }


    /**
     * Create Setters and Getters
     */

    public int getAppointment_ID() {
        return Appointment_ID;
    }

    public int setAppointment_ID(int ID) {
       return Appointment_ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public String setTitle(String title) {
        return Title = title;
    }
    public String getDescription(){
        return Description;
    }
    public void setDescriptions(String Descript){
        Description = Descript;
    }
    public String getLocation(){
        return Location;
    }
    public void setLocation(String locate){
        Location = locate;
    }
    public String getType(){
        return Type;
    }
    public void setType(String TypeOfAppt){
        Type = TypeOfAppt;
    }
    public String getStart(){
        return Start;
    }
    public LocalDateTime getStartLocal(){ return StartLocal;};

    public void setStart(String startTime){
        Start = startTime;
    }
    public String getEnd(){
        return End;
    }
    public LocalDateTime getEndLocal(){return EndLocal;}
    public  void  setEnd(String EndTime){
        End = EndTime;
    }
    public int getUser_ID(){
        return User_ID;
    }
    public void setUser_ID(int UID){
        User_ID = UID;
    }
    public int getCustomer_ID(){
        return Customer_ID;
    }
    public void  setCustomer_ID(int Cust_ID){
        Customer_ID = Cust_ID;
    }
    public int getContact_ID(){
        return Contact_ID;
    }
    public void setGetContact_ID(int ContactID){
        Contact_ID = ContactID;
    }
    public static ObservableList<Appointment> getAllAppointments(){
        return  allAppointments;
    }

}




