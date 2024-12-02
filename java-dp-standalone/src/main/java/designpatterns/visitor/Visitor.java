package designpatterns.visitor;

public interface Visitor {

    void visit(Header header);

    void visit(Paragraph paragraph);

}
