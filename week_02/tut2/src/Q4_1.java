
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
public class Q4_1 {




        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<10000; i++){
                int count = 0;
                Set<Integer> set = new HashSet<>();
                while(set.add(ThreadLocalRandom.current().nextInt(0, 365))){
                    count++;
                }
                list.add(count+1);
            }
            double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
            System.out.println(avg);
        }



    }

