

public class Validator {
    public boolean validateAge(String str) throws Exception {
        int age = 0;
        age = Integer.parseInt(str);
        if (str.contains(".")) {
            throw new Exception("Age must be a number");
        }
        if (age < 18) {
            throw new Exception("Stay in school!");
        } else if (age >= 115) {
            throw new Exception("Dude, you're ancient.");
        } else if (age < 0) {
            throw new Exception("You big fat liar!");
        } else {
            return true;
        }

    }
}
