package designpatterns.visitor;

import lombok.AllArgsConstructor;

import javax.print.Doc;
import java.util.List;

@AllArgsConstructor
public class Document {

    private List<Part> parts;

    public void print() {
//        for (Part part : parts) {
//             NEM módosíthatjuk a Header és Paragraph osztályokat NAGYON.
//            if (part instanceof Header header) {
//                System.out.println(header.getText() + header.getSize());
//            }
//            else if (part instanceof Paragraph paragraph) {
//                System.out.println(paragraph.getContent());
//            }
//        }

//        var visitor = new PrintVisitor();
        var visitor = new PrintUpperCaseVisitor();
        for (Part part : parts) {
            part.visit(visitor);
        }
    }

    public static void main(String[] args) {
        var document = new Document(
                List.of(new Header("h", 1), new Paragraph("foo"), new Paragraph("bar"))
        );
        document.print();
    }
}
