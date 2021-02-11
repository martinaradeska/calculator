package primerchas.demo.logic;

import org.springframework.stereotype.Service;
import primerchas.demo.model.Elements;

@Service
public class LogicClass {
    public double operacija(Elements elements) {
        if (elements.getC().equals('+')) {
            return (elements.getX() + elements.getY());
        } else if (elements.getC().equals('-')) {
            return (elements.getX() - elements.getY());
        } else if (elements.getC().equals('*')) {
            return (elements.getX() * elements.getY());
        } else if (elements.getC().equals('/')) {
            return (elements.getX() / elements.getY());
        } else return 0.0;
    }
}
