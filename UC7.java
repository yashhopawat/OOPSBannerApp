public class UC7 {

    // Inner static class to store character and pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create pattern objects
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[] {

            new CharacterPatternMap('O', new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }),

            new CharacterPatternMap('P', new String[] {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
            }),

            new CharacterPatternMap('S', new String[] {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
            }),

            new CharacterPatternMap(' ', new String[] {
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
            })
        };
    }

    // Get pattern for character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[7];
    }

    // Print banner message
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, maps);
    }
}