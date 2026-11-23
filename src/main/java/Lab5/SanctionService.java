package Lab5;

import java.util.ArrayList;
import java.util.List;

public class SanctionService {

   private List<String> list = new ArrayList<String>();

    public boolean validateSanction (String id){

            return list.contains(id);
        }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
