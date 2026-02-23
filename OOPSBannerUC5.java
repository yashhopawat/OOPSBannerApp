public class OOPSBannerUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization combined
        String[] banner = {

                String.join(" ", "*****", "*****", "*****", "*****"),
                String.join(" ", "*   *", "*   *", "*   *", "*    "),
                String.join(" ", "*   *", "*   *", "*****", "*    "),
                String.join(" ", "*   *", "*   *", "*    ", "*****"),
                String.join(" ", "*   *", "*   *", "*    ", "    *"),
                String.join(" ", "*   *", "*   *", "*    ", "    *"),
                String.join(" ", "*****", "*****", "*    ", "*****")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
