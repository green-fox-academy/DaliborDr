public class TodoPrint {
    public static void main(String... args){
        String todoText = "My todo:\n- Buy milk\n- Download games\n     - Diablo\n";

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo



        System.out.print(todoText);


    }
}