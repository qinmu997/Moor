package cn.scp997.moor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ArticlesController {

    // 这里的@ResponseBody可以标志在某个方法上也可以直接写在类上面，表示整个类的所有方法都返回一个网页数据，而非跳转
    @ResponseBody
    @RequestMapping("/articles")
    public String  handle()  {
        return "No Article.";
    }
}
