package exerciseThree.Ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/strings")

    public String concatString(@RequestParam(value = "first") String first,
                               @RequestParam(value = "second", required = false) String second){


        if (second == null) {
            return first;
        } else {
            return first + second;
        }


    }



}
