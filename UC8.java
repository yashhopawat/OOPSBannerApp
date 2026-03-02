import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    public static void main(String[] args) {

        // Step 1: Create HashMap to store patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        // Step 2: Add patterns for each character

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        // Step 3: Word to render
        String word = "OOPS";

        // Step 4: Render banner
        renderBanner(word, patternMap);
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int height = 5; // number of lines per character

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }

            System.out.println();
        }
    }
}