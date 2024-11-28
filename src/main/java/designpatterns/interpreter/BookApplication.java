package designpatterns.interpreter;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@SpringBootApplication
public class BookApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // language=json
        var json = """
                {
                    "firstName": "John",
                    "lastName": "doe",
                    "age": 26,
                    "address": {
                        "streetAddress": "naist street",
                        "city": "Nara",
                        "postalCode": "630-0192"
                    },
                    "phoneNumbers": [
                        {
                            "type": "iPhone",
                            "number": "0123-4567-8888"
                        },
                        {
                            "type": "home",
                            "number": "0123-4567-8910"
                        }
                    ]
                }
                """;

        var context = JsonPath.using(Configuration.defaultConfiguration()).parse(json);
        var configuration = new SpelParserConfiguration(true, true);
        var parser = new SpelExpressionParser(configuration);
        var evaluationContext = parser.parseExpression(
                // language=spel
                "#this.read('$.age', T(java.lang.Integer)) > 20");
        var result = evaluationContext.getValue(context);
        System.out.println(result);
    }
}
