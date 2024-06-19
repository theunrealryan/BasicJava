import java.util.*;

class CatchLanguage {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("O seu sistema operacional está em ");
        System.out.println(loc.getDisplayLanguage());
    }
}