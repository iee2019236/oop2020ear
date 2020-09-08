abstract class Sports {
    public int teamNo;

    void meth1() {
    };
}

abstract class Football extends Sports {
    public String teamName;

    void meth1() {
        System.out.println("Most popular sport");
    };
}

class Mundial extends Football {
    void meth1() {
        System.out.println("Union is FIFA");
    }
}

class Euro extends Mundial {
    void meth1() {
        System.out.println("Union is UEFA");
    }
}

public class K1_Thema1_2 {
    public static void main(String args[]) {
        Sports sport = new Mundial();
        sport.meth1();
        Football fb = new Euro();
        fb.meth1();
        fb = (Football) sport; // Einai lathos to arxiko fb = sport;
        // Emfanizei sfalma "Type mismatch: cannot convert from Sports to Football",
        fb.meth1();
    }
}

// Swsti e3odos programmatos:
// Union is FIFA
// Union is UEFA
// Union is FIFA