package loops;

public class GenderSwitch {
    public static void main(String[] args) {
        char gender = 'M'; // Change this to 'F' for Female
        switch (gender) {
            case 'M':
                System.out.println("Gender: Male");
                break;
            case 'F':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
