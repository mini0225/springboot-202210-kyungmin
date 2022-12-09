package com.study.springboot202210kyungmin.IocAndDi;

public class Main {

    private final UserService userService;

    public Main(UserService userService) { //객체지향
        this.userService = userService;

    }

    public void run(){
        userService.createUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();
    }

    public static void main(String[] args) {
        // Di - 의존성을 주입한다.
        UserService userService = UserServiceImpl.getInstance();

        Main main = new Main(userService);
        main.run();


    }

}
