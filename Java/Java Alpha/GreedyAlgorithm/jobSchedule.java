import java.util.*;

public class jobSchedule {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        int jobInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};
        //id :              0       1       2       3

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0 ; i<jobInfo.length; i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        //sort
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);
        //sorted
        // {{1,40}, {1,30}, {4,20}, {1,10}}

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Total jobs can be schedule : "+ seq.size());

        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }

    }
}
