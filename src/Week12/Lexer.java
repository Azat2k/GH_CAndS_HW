package Week12;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static Week12.Lexer.TokenType.*;

public class Lexer {
    private final String input;
    private final List<Token> tokens;
    private int current;

    public Lexer(String input){
        this.input = input;
        this.tokens = new ArrayList<Token>();
        current = 0;
        tokenize();
    }

    private void tokenize() {
        while (current < input.length()){
            char ch = input.charAt(current);
            switch (ch){
                case ' ':
                case '\t':
                case '\n':
                case '\r':
                    current++;
                    break;
                case '=':
                    tokens.add(new Token(ASSIGNMENT, "="));
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    tokens.add(new Token(OPERATOR, Character.toString(ch)));
                    current++;
                    break;
                case '"':
                    tokens.add(new Token(STRING, readString()));
                    break;

            }
        }
    }

    private String readString() {
        StringBuilder builder = new StringBuilder();
        while (current < input.length() && input.charAt(current) != '"'){
            builder.append(input.charAt(current));
            current++;
        }
        return builder.toString();
    }

    static class Token {
        final TokenType type;
        final String value;

        Token(TokenType type, String value) {
            this.type = type;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Token{" +
                    "type=" + type +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    enum TokenType  {
        CONFIG, UPDATE, COMPUTE, SHOW, CONFIGS, STRING, NUMBER, IDENTIFIER, ASSIGNMENT, REFERENCES, OPERATOR


    }
}
