
public class Main {

    public static void main(String[] args) {
        ConsoleApp consoleApp = new ConsoleApp();
        System.out.println("For sign in enter 1 \n For sign up enter 2");
        String inOrUp = Utils.bufferReader();
        String result;
        if (inOrUp.equals("1")){
            User user = Utils.userFromFE();
            result = consoleApp.singIn(user);
        }
        else if (inOrUp.equals("2")) {
            User user = Utils.userFromFE();
            result = consoleApp.signUp(user);
        }
        else result = "Incorrect input";
        System.out.println(result);
        Utils.closeStream();
    }
}
