package pjava;

class IntegerSearch extends AbstractSearch {
    @Override
    public boolean search(Object[] obj_list, Object obj) {
        // Search for an integer in a list of integers
        if (obj instanceof Integer) {
            int target = (int) obj;
            for (Object item : obj_list) {
                if (item instanceof Integer && (int) item == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
