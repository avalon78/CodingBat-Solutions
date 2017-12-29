package codingBat.solutions.warmup1;

import java.util.stream.Stream;

public class StringE {

    public boolean stringE(String str) {

        long count = Stream.of(str).filter(s -> s.contains("e")).count();
        return count >= 1 && count <= 3;
    }
}