public class Main {

    public static void main(String[] args) {
        BankAccount FirstUser = new BankAccount.BankAccountBuilder(1,"Adilet","87777777777")
                .withStartCache(45000)
                .build();
        System.out.println(FirstUser);
        BankAccount SecondUser = new BankAccount.BankAccountBuilder(2,"Marlen","87777777777")
                .build();
        System.out.println(SecondUser);
    }
}
