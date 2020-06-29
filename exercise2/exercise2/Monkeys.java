package exercise2;

class Monkeys {

    static boolean monkeyBusiness(Monkey[] monkeys) {
    //BONUS EXERCISE
    //We have a set of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.  If it is a tie, return true.  
        int smileCount = 0;
        for (int i=0; i<monkeys.length;i++){
            if(monkeys[i].smile){
                smileCount +=1;
            }
        }
        boolean isMajoritySmiling =false;
        if(smileCount>=2){
            isMajoritySmiling = true;
            System.out.println("Majority of the monkeys are smiling");
        }else{
            isMajoritySmiling = false;
            System.out.println("Majority of the monkeys are not smiling");
        }
        return isMajoritySmiling;
    }

    static class Monkey {
        String name;
        boolean smile;

        public Monkey(String name, boolean smile) {
            this.name = name;
            this.smile = smile;
        }
    }

    public static void main(String[] args) {
        //Bonus exercise instructions:  create an array of at least 3 monkeys, utilizing the nested Monkey class, and determine whether the majority of them are smiling or not.  
        //required monkey data:
        // Rafiqi is smiling
        // Curious George is smiling
        // King Kong is not smiling
        //You are NOT allowed to move the Monkey class.  Keep it where it is.  

        Monkey monkey1 = new Monkey("Rafiqi", true);
        Monkey monkey2 = new Monkey("Curious George", true);
        Monkey monkey3 = new Monkey("King Kong", false);
        Monkey[] monkeyList = new Monkey[]{monkey1, monkey2, monkey3};

        for (int i = 0; i < monkeyList.length; i++) {
            System.out.println("Name : " + monkeyList[i].name + "\n" +
                    "Smile status : " + monkeyList[1].smile);
        }
        boolean majority = Monkeys.monkeyBusiness(monkeyList);
        if (majority) System.out.println("Majority Smiling");
    }


    
}