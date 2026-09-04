class TimeMap {

    Map<String, TreeMap<Integer, String>> map = new HashMap<>();

    public TimeMap() {}

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        Integer t = map.get(key).floorKey(timestamp);
        return t == null ? "" : map.get(key).get(t);
    }
}