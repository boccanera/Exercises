package CleanCode;

import java.util.HashMap;
import java.util.Map;

public class BestWayToUseMap {

    private Map bestWay = new HashMap();

    public Object getByClass(String xd){
        return (Object) bestWay.values();
    }
}
