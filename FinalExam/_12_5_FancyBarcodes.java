package FinalExam;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _12_5_FancyBarcodes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfBarcodes = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfBarcodes ; i++) {
            String barcodes = scanner.nextLine();
            Pattern pattern = Pattern.compile("([@][#]+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])([@][#]+)");
            Matcher matcher = pattern.matcher(barcodes);
            if (matcher.find()){
                String barcode = matcher.group("barcode");
                StringBuilder digits = new StringBuilder();
                for (char symbol : barcode.toCharArray()){
                    if (Character.isDigit(symbol)){
                       digits.append(symbol);
                    }
                }
                if (digits.length() == 0){
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + digits);
                }
            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
