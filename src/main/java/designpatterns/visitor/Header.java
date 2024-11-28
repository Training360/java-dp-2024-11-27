package designpatterns.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Header implements Part {

    private String text;

    private int size;

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
