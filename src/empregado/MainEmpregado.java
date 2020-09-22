package empregado;

public class MainEmpregado {

    public static void main(String [] args){
        Empregado number1 = new Empregado("José", "Silva", 1000.0);
        Empregado number2 = new Empregado("Maria", "Pereira", 1200.0);

        String number1_complete_name = number1.getFirstName() + " " + number1.getSecondName();
        String number2_complete_name = number2.getFirstName() + " " + number2.getSecondName();

        double number1_old_payload = number1.getAnualPaylaod();
        double number2_old_payload = number2.getAnualPaylaod();

        System.out.println("Salario anual do(a) " + number1_complete_name + " : " + number1_old_payload);
        System.out.println("Salario anual do(a) " + number2_complete_name + " : " + number2_old_payload);

        number1.updatePayload(10);
        number2.updatePayload(10);

        double number1_new_payload = number1.getAnualPaylaod();
        double number2_new_payload = number2.getAnualPaylaod();

        System.out.println("Salario anual do(a) " + number1_complete_name + " : " + number1_old_payload);
        System.out.println("Salario anual do(a) " + number2_complete_name + " : " + number2_old_payload);
    }

}
