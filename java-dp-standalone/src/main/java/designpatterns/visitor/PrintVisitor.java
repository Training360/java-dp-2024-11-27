package designpatterns.visitor;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Header header) {
        System.out.println(header.getText() + header.getSize());
    }

    @Override
    public void visit(Paragraph paragraph) {
        System.out.println(paragraph.getContent());
    }
}
