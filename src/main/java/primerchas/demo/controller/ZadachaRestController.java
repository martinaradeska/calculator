package primerchas.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import primerchas.demo.logic.LogicClass;
import primerchas.demo.model.Elements;

@RestController
@RequestMapping("operations")
public class ZadachaRestController
{
    private final LogicClass logicClass;

    public ZadachaRestController(LogicClass logicClass) {
        this.logicClass = logicClass;
    }

    @PostMapping("/calculate")
    public Double calculate(@RequestParam Float x, @RequestParam Float y, @RequestParam Character c)
    {
        Elements elements = new Elements(x, y, c);
        Double num = this.logicClass.operacija(elements);
        return num;
    }
}
