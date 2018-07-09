package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NekoTestController{
    @RequestMapping("/meow")
    public NekoTest greeting(@RequestParam(value="name", defaultValue="World") String name) {
        NekoTest neko = new NekoTest();
        switch(name){
            case "Cat":
                neko.setAge(27);
                neko.setName(name);
                break;
            case "Siri":
                neko.setAge(36);
                neko.setName(name);
                break;
            case"Car":
                neko.setAge(28);
                neko.setName(name);
                break;
            default:
                neko.setAge(-1);
                neko.setName(name);
        }
        return neko;
    }
}