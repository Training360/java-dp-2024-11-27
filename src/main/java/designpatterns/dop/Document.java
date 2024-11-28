package designpatterns.dop;

import java.util.List;

public class Document {

    private List<Part> parts;

    public void print() {
        for (Part part : parts) {
            switch (part) {
                case Header(var text, var _) -> System.out.println(text);
                case Paragraph(var content) -> System.out.println(content);
            }
        }
    }
}
