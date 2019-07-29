package cn.itcast.Controller;

import cn.itcast.Service.ItemsService;
import cn.itcast.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/show")
    public String show(Model model){
        Items byId = itemsService.findById(1);
        model.addAttribute("items",byId);
        return "itemDetail";
    }
}
