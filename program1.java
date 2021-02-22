import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class program1 {
    private final static int[][] STATE_TABLE = {
        {  0, 2, 1, 8 },
        {  0, 3, 7, 8 },
        {  4, 2, 1, 8 },
        {  5, 2, 1, 8 },
        {  0, 6, 1, 8 },
        {  6, 6, 1, 8 },
		{  6, 6, 6, 8 },
		{  6, 3, 7, 8 },
    };

    private BufferedReader in;

    public program1() {
        in = new BufferedReader(
                 new InputStreamReader(System.in));
    }

    public void run() throws IOException {
        char ch;
        int  state;
        for (;;) {
            System.out.print("Enter your string: ");
            ch    = (char) in.read();

            // set state to start state
            state = 0;   
                   
            while (ch != '\n') {
               state = STATE_TABLE[state][charToColumn(ch)];
               ch    = (char) in.read();
            }

            // determine whether to accept or reject
            if (state == 6) { 
                System.out.println("Accept\n");
            } else {
                System.out.println("Reject\n");
            }
        }
    }
    public int charToColumn(char ch) {
        // column 2 is for some unexpected character
        int column = 3;

        switch( ch ) {
        case 'a':
            column = 0;
            break;

        case 'b':
            column = 1;
            break;
	    case 'c':
            column = 2;
            break;
        }

        return column;
    }

    public static void main(String[] args) {
        try {
            program1 fsm = new program1();
            fsm.run();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }
}
