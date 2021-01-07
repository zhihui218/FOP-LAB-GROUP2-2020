package lab10;

import java.time.LocalDateTime;

/**
 *
 * @author TING WEI JING
 */
public interface Searchable {
    
    public boolean search(LocalDateTime dateStartTime, LocalDateTime dateEndTime);
    
}
