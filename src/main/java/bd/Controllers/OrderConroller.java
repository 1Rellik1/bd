package bd.Controllers;

import bd.Entities.Company;
import bd.Entities.Order;
import bd.Objectstofind;
import bd.Services.CompanyService;
import bd.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderConroller {
    @Autowired
    OrderService orderService;

    @GetMapping("/addorder")
    public String page(){
        return "Orderadding";
    }

    @PostMapping("/addorder")
    @ResponseBody
    public String addorder(@RequestBody Objectstofind objectstofind){
        return orderService.addOrder(objectstofind);
    }

//    @PostMapping("/returnproject_names")
//    public String projectnames(){
//        return null;
//    }


    @GetMapping("/orders")
    @ResponseBody
    public List<Order> getcompanies(){
        List<Order> ventil=orderService.getOrders();
        return ventil;
    }

}
