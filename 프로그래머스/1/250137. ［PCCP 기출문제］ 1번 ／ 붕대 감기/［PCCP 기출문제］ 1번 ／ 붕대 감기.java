class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int lastAtkTime = attacks[attacks.length-1][0];
        int atkIdx = 0;
        int t = 1;
        int successive = 1;
        int keeping = bandage[0];
        int heal = bandage[1];
        int bonus = bandage[2];
        int maxHealth = health;
        
        while (t <= lastAtkTime ) {
            if ( t == attacks[atkIdx][0] ) {
                health -= attacks[atkIdx][1];
                
                if (health <= 0 ) return -1;
                
                successive = 1;
                atkIdx++;
            } else {
                health += heal;
                if (successive == keeping) {
                    health += bonus;
                    successive = 0;
                }
                successive++;
                if (health > maxHealth) health = maxHealth;
            }
            t++;
        }
        
        
        return health;
    }
}