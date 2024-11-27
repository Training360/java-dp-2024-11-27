package designpatterns.elegantobjects;

import java.nio.file.Path;
import java.util.List;

public class CardFile {

    private Path path;

    public CardFile(Path path) {
        this.path = path;
    }

    public List<String> read() {
        return null;
    }
}
