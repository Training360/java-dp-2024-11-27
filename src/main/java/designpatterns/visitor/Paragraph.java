package designpatterns.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Paragraph implements Part {

    private String content;

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
