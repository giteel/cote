import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Solution {
    private static char[] PEOPLE = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    private static Map<Character, Boolean> visited = new HashMap<>();
    private static Map<Character, Person> peopleMap = new HashMap<>();
    private static int answer;
    
    public int solution(int n, String[] data) {
        answer = 0;
        
        for (int i =0; i<PEOPLE.length; i++) {
            peopleMap.put(PEOPLE[i], new Person(PEOPLE[i]));
            visited.put(PEOPLE[i], false);
        }
        
        for(String s : data) {
            char[] chars = s.toCharArray();
            peopleMap.get(chars[0]).conditions.add(new Condition(chars[2], chars[3], chars[4]));
            peopleMap.get(chars[2]).conditions.add(new Condition(chars[0], chars[3], chars[4]));
        }
        
        for (int i=0; i < PEOPLE.length; i++) {
            dfs(PEOPLE[i], 0);
        }
        
        peopleMap.clear();
        visited.clear();
        
        return answer++;
    }
    
    public void dfs(char c, int index) {
        for (int i=0; i<PEOPLE.length; i++) {
            if (!visited.get(c)) {
                visited.put(c, true);
                peopleMap.get(c).position = index;

                if (peopleMap.get(c).check()) {
                    if (index+1 == PEOPLE.length) {
                        answer++;
                        
                        visited.put(c, false);
                        peopleMap.get(c).position = null;
                        break;
                    }
                    dfs(PEOPLE[i], index+1);
                }
                
                visited.put(c, false);
                peopleMap.get(c).position = null;
            }
        }
    }
    
    public class Person {
        char name;
        Integer position;
        Set<Condition> conditions = new HashSet<>();
        
        public Person (Character name) {
            this.name = name;
        }
        
        public boolean check() {
            return conditions.stream().allMatch(condition -> condition.isPossible(name));
        }
    }
    
    public class Condition {
        char operand;
        char operator;
        int distance;
        
        public Condition(char operand, char operator, char dist) {
            this.operand = operand;
            this.operator = operator;
            this.distance = Character.getNumericValue(dist);
            
        }
        
        public boolean isPossible(char op1) {
            Integer op1Position = peopleMap.get(op1).position;
            Integer op2Position = peopleMap.get(operand).position;
            
            if (op2Position == null) return true;
            
            if (operator == '>') {
                return Math.abs(op1Position - op2Position) -1 > distance;
            } else if (operator == '<') {
                return Math.abs(op1Position - op2Position) -1 < distance;
            } else {
                return (Math.abs(op1Position - op2Position)-1) == distance;
            }
        }
    }
}