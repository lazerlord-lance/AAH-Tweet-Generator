public class aah {


    public static void main(String[] args) {

        int min = 1;
        int max = 279;
        int random = (int) Math.floor(Math.random()*(max-min+1)+min);
        int random2 = 280 - random;
        String aah = "";

        for(int i = 0 ; i < random ; i++) {
            aah = aah + "A";
        }
        for (int i = 0 ; i < random2 ; i++) {
            aah = aah + "H";
        }

        System.out.println(aah.length() + " / " + aah);

    }
    
}
