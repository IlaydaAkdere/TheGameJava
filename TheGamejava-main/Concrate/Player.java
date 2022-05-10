package Concrate;

public class Player {

    static Object getidentificationNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private int id ;
    private String FirstName;
    private String LastName;
    private double age;
    private String identificationNumber;
    private String eMail;
    public Player(){
        super();
    }
   
    public Player(int id,String FirstName, String LastName, double age, String identificationNumber,String eMail) {

		this.id = id;
		this.FirstName=FirstName;
                this.LastName=LastName;
                this.age=age;
                this.identificationNumber=identificationNumber;
                this.eMail=eMail;
	}

    public String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

