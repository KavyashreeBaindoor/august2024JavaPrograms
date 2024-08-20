package Interview;

public class passbyvalueReference {

		    public static void spill(Mug myMug) {
		        myMug.setContents("nothing");
		    }

		    public static void main(String args[]) {
		        Mug myMug = new Mug("tea"); 
		        System.out.println(myMug.getContents());

		        spill(myMug);  
		        System.out.println(myMug.getContents());
		    }
		}



class Mug {

    private String contents;

     Mug(String contents) {
        this.contents = contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getContents(){
        return contents;
    }
}

