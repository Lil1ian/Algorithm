/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> mp = new HashMap<>();
        for(Employee em: employees) {
            mp.put(em.id, em);
        }
        return helper(mp, id);       
    }
    
    public int helper(Map<Integer, Employee> map, int id) {
        if(map.containsKey(id) == false) {
            return 0;
        }
        int sum = 0;
        List<Integer> l = map.get(id).subordinates;
        sum += map.get(id).importance;
        for(Integer i: l) {
            sum += helper(map, i);
        }
        return sum;
        
    }    
}





