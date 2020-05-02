public class Question {

    //attributes
    private String exam;
    
    //constructor
    public Question(String exam){
        this.exam = exam;
    }

    //accesors
    public void setexam(String exam){
        this.exam = exam;
    }
    
    public String getexam(){
        return exam;
    }

    //tostring
    public String tostring(){
        return "Exam             : " + exam             
}
