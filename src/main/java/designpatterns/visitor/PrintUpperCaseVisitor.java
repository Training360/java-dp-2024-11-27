package designpatterns.visitor;

public class PrintUpperCaseVisitor implements Visitor {

    @Override
    public void visit(Header header) {
        System.out.println(header.getText().toUpperCase());
    }

    @Override
    public void visit(Paragraph paragraph) {
        System.out.println(paragraph.getContent().toUpperCase());
    }
}
