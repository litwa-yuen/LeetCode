class TimeMap {
    class Item {
        String val;
        int time;
        public Item (String val, int time) {
            this.val = val;
            this.time = time;
        }
    }
    Map<String, List<Item>> map;
    public TimeMap() {
        map = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, s -> { return new ArrayList<Item>(); });
        map.get(key).add(new Item(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        
        List<Item> list =map.get(key);
        if (list == null) return "";
        int start = 0;
        int end = list.size()-1;
        String result = "";
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (list.get(mid).time <= timestamp) {
                result = list.get(mid).val;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
