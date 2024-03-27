public class UserHandler extends Handler{

    public Database database;

    public UserHandler(Database database){
        this.database=database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidUser(username)){
            System.out.println("Username dowsn't exists");
            return false;
        }
        return handleNext(username,password);
    }
}
