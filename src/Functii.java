public class Functii {
    boolean CaractereUnice (String string){
            for (int i = 0; i < string.length(); i++)
                for (int j = i + 1; j < string.length(); j++)
                    if (string.charAt(i) == string.charAt(j))
                        return false;
            return true;

    }
}
