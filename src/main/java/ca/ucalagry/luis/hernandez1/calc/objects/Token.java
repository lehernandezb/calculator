package ca.ucalagry.luis.hernandez1.calc.objects;
public class Token {
    public final TokenType type;
    public final String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    public boolean isNumber() {
        return type == TokenType.NUMBER;
    }

    public boolean isOperator() {
        return type == TokenType.OPERATOR;
    }

    public boolean isParenthesis() {
        return type == TokenType.PARENTHESIS;
    }
}

