package lab10;

/**
 *
 * @author TING WEI JING
 */
public interface MessageEncoder {

    public String encode(String plainText);

    public String decode(String chiperText);

}
