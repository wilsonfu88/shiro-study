package cn.weisoft.shirostudy.filter;


//import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;


@ControllerAdvice
//@Slf4j
public class MyExceptionHandler {

   /* @InitBinder
    public void initBinder(WebDataBinder binder) {}


    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("author", "Magical Sam");
    }*/

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String ErrorHandler(Exception e) {
        Logger log = Logger.getLogger(this.getClass().getName());

        log.info("没有通过权限验证！");

        //e.printStackTrace();
        System.out.println(e.getMessage());
        return "没有通过权限验证！";
    }
}
