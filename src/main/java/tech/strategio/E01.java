package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {

        if (n <= 2) {
            return n - 1;
        }

        return getNthFib(n - 1) + getNthFib(n - 2);
    }
}
