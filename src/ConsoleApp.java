public class ConsoleApp implements Processing {
    @Override
    public String singIn(User user) {
        User userFromDB = DataBaseEmulator.users.get(user.getLogin());
        if (userFromDB == null) return "This user not found";
        else if (!user.getPassword().equals(userFromDB.getPassword())) return "Wrong password";
        else return "Success!";
    }

    @Override
    public String signUp(User user) {
        if (DataBaseEmulator.users.get(user.getLogin()) != null) return "User with this login already exist";
        else {
            DataBaseEmulator.users.put(user.getLogin(), user);
            return "You have register successfully!";
        }
    }
}
