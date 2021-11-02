package hw5;

public class Reader {
    public int setNumber;
    private String user;
    private String number;
    private String faculty;
    private String date;
    private int phone;

    public String getUser() {
        return "[ФИО:" + user + ",номер читательского билета:" + number + ",Факультет:" + faculty + ",дата:" + date + ",номер телефона:" + number +"]";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setUser(String user1) {
        this.user = user1;




        }
    }
