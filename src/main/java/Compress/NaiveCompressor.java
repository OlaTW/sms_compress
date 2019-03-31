package Compress;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NaiveCompressor implements Compressor {

    @Override
    public String compress(String input) {
        return Arrays.stream(input.split(" "))
                .map(word -> word.length() >0 ? word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase(): word)
                .collect(Collectors.joining(""));

    }
//        if (input == null || input.isEmpty())
//            return "";
//        String[] words = input.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (String word:words){
//            sb.append(word.substring(0,1).toUpperCase());
//            sb.append(word.substring(1).toLowerCase());
//        }
//        return sb.toString();


    @Override
    public String uncompress(String input) {
        return Arrays.stream(input.split("(?=\\p{Lu})"))
                .map(String::toLowerCase)
                .collect(Collectors.joining(" "));
    }
//        if (input == null || input.isEmpty())
//        return "";
//        String[] words = input.split("(?=\\p{Lu})");
//        StringBuilder sb = new StringBuilder();
//        for (String word: words){
//            sb.append(word.toLowerCase());
//            sb.append(" ");
//        }
//        return  sb.toString().trim();
//    }
}
