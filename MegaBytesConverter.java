public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes;
        int remainder;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value!");
        }
        else {
            megaBytes = kiloBytes / 1024;
            remainder = kiloBytes % 1024;
            System.out.println("This convertation is --> " + kiloBytes + "KB = " + megaBytes + "MB and " + remainder + "KB");
        }
    }
}

