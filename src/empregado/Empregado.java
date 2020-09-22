package empregado;

public class Empregado {
    public String firstName;
    public String secondName;
    public double payload = 0;

    public Empregado(String firstName, String secondName, double payload){
        this.firstName = firstName;
        this.secondName = secondName;

        if (payload > 0){
            this.payload = payload;
        }
    }

    public void updatePayload(int percent){
        this.payload = payload + (payload * (percent/100.0));
    }

    public double getAnualPaylaod(){
        return this.payload * 12;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
}
