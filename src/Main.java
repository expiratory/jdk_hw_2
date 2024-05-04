public class Main {
    public static void main(String[] args) {
        Pair<String, String> stringPair = new Pair<>("Hello, ", "World!");
        Pair<Integer, Integer> intPair = new Pair<>(5, 10);

        String resultString = concatenateOrSum(stringPair);
        String resultSum = concatenateOrSum(intPair);

        System.out.println(resultString);
        System.out.println(resultSum);
    }

    public static <T1, T2> String concatenateOrSum(Pair<T1, T2> pair) {
        if (pair.getFirst() instanceof String && pair.getSecond() instanceof String) {
            return pair.getFirst().toString() + pair.getSecond().toString();
        } else if (pair.getFirst() instanceof Number && pair.getSecond() instanceof Number) {
            Number first = (Number) pair.getFirst();
            Number second = (Number) pair.getSecond();
            return String.valueOf(first.doubleValue() + second.doubleValue());
        } else {
            return "Incompatible types";
        }
    }
}
