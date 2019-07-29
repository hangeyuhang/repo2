package cn.itcast.Controller;

import cn.itcast.Service.DubboService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dubbo")
public class dubboController {
    @Reference
    private DubboService dubboService;
    @RequestMapping("/show.do")
    @ResponseBody
    public String showName(){
        return dubboService.getName();
    }
}
