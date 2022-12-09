package com.study.springboot202210kyungmin.IocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class IocController {

    @Autowired //(required = true) true 일 경우 생략가능. //required = false 라고 작성할 경우 오류 x  주입안됨. 객체가 없어도 실행이 된다. -> 객체주입이 아무것도 일어나지 않기 때문에  아무것도 없음.
    @Qualifier("usi2") //괄호안에 이름을 써준다.@Component("usi2") 각각에 이렇게 이름설정을 해줌.
    private UserService userService;  //UserServiceImpl2 와 UserServiceImpl3 두개가 @Component 되어 있기 때문에 선택 해줘야 한다.

    @ResponseBody
    @GetMapping("/ioc")
    //ioc 란 제어의 역전...개발자가 new~~ 하지 않고 spring 이 객체를 생성함.
    //Springboot 안에 componentScan 이라는....능력? 이 있기 때문 -> 모든 component 를 다 찾아서 ioc Container 를 만들어서 객채들(new ~~~~)을 보관한다.
    //UserService2Impl2 의 @Component 때문에 -> 지금 하나 달려 있기 때문에 거의 싱글톤 역활중, container 에 얘 하나뿐.
    //autowired -> ioc container 스캔하여 자동으로 DI(의존성부여)를 함.


    public String iocTest(){
        userService.createUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();

        return null;
    }
}