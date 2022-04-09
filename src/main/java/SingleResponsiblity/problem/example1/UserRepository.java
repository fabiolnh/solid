package SingleResponsiblity.problem.example1;

class UserRepository {

public void listUser() {
    // ok (crud)
}

public void addUser() {
    // ok (crud)
}

public void updateUser() {
    // ok (crud)
}

public void deleteUser() {
    // ok (crud)
}

public void notifyUser() {
    // Send SMS to the client (WRONG!)
}

}
