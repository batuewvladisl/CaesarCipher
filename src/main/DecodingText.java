package main;

public class DecodingText {

    public static void DecodingCipherCaesar(String stringForDecode) {
        char[] ABC = new char[] {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н',
                'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};

        for (int i = 1; i < ABC.length; i++) {
            char[] charsForDecoder = stringForDecode.toCharArray();

            for (int y = 0; y < charsForDecoder.length; y++) {
                for (int x = 0; x < ABC.length; x++) {
                    if ((charsForDecoder[y]+"").equalsIgnoreCase(ABC[x]+"")) {
                        boolean symbol =  Character.isUpperCase(charsForDecoder[y]);
                        if ((x + i) > 32) {
                            charsForDecoder[y] = ABC[(x + i) - ABC.length];
                        } else {
                            charsForDecoder[y] = ABC[x+i];
                        }

                        if (symbol) {
                            charsForDecoder[y] = Character.toUpperCase(charsForDecoder[y]);
                        }
                        break;
                    }
                }
            }
            System.out.print(new String(charsForDecoder));
            System.out.println("\n------------------------------------------------------\n");
        }
    }
}
