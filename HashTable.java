import java.util.Hashtable;

public class HashTable {
    
    public static void main(String[] args) {

        //Hashtable = A data structure that stores unique keys to values ie. <Integer, String>
        //            Each key/value pair is an Entry
        //            Fast Insertion, look up, and deletion of key/value pairs
        //            Not ideal for small data sets, great with large data sets

        //Hashing = takes a key and computes an integer
        //          In a hashtable, hash % capacity calculates index number

        //          key.hashCode() % capacity = index

        //Bucket = an indexed storage location for one or more entries
        //         can store multiple entries in case of a collision (linked list)

        //Collision = hash function generates the same index for more than one key
        //            less collisions = more efficiency

        //Runtime complexity: Best Case O(1)
        //                    Worst Case O(n)
        
        Hashtable<String, String> table = new Hashtable<>(21);

        table.put("100", "SpongeBob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        //table.remove(777);

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + table.get(key));
        }
    }
}
