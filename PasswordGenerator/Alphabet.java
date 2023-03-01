package PasswordGenerator;

public class Alphabet
{
    public static final String UPPERCASE_LATTERS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String LOWERCASE_LATTERS="abcdefghijklmnopqrstuvwxyz";

    public static final String NUMBERS   ="1234567890";

    public static final String SYMBOLS= "~!@#$%^&*()-_+=\\/?><.";


    private final StringBuilder pool;

    public Alphabet(boolean uppercaseIncluded,boolean lowercaseIncluded,boolean numbersIncluded,boolean speicalCharactersIncluded)
    {
        pool=new StringBuilder();

        if(uppercaseIncluded)pool.append(UPPERCASE_LATTERS);

        if(lowercaseIncluded)pool.append(LOWERCASE_LATTERS);

        if (numbersIncluded)pool.append(NUMBERS);

        if (speicalCharactersIncluded)pool.append(SYMBOLS);
    }
    public String getAlphabet()
    {
        return pool.toString();
    }
}
