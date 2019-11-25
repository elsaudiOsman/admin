import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Utils {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static String bufferReader() {
        String s = null;
        try {
            s = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    static User userFromFE() {
        System.out.println("Enter your login:");
        String login = bufferReader();
        System.out.println("Enter your password:");
        String password = bufferReader();
        return new User(login, password);
    }

    static void closeStream(){
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
