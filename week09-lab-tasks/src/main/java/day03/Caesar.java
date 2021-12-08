package day03;

import java.util.ArrayList;
import java.util.List;

public class Caesar extends Encryption {

    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        char[] code = input.toUpperCase().toCharArray();
        for (int i = 0; i < input.length(); i++) {
            code[i] += offset;
            if (code[i] > 'Z') {
                code[i] -= 'Z' - 'A' + 1;
            }
        }
        return new String(code);
    }
}