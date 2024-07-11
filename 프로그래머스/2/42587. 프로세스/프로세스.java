import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayDeque<Task> queue = new ArrayDeque<>();
        int len = priorities.length;
        
        for(int i = 0; i < len; i++) {
            Task task = new Task(i, priorities[i]);
            queue.addLast(task);
        }
        
        while(true) {
            Task task = queue.poll();
            answer++;
            
            if(task.getTask() == location) {
                boolean higherPriorityExists = false;
                for(Task compareTask : queue) {
                    if(task.getPriority() < compareTask.getPriority()) {
                        queue.addLast(task);
                        answer--;
                        higherPriorityExists = true;
                        break;
                    }
                }
                if(!higherPriorityExists) {
                    return answer;
                }
            } else {
                for(Task compareTask : queue) {
                    if(task.getPriority() < compareTask.getPriority()) {
                        queue.addLast(task);
                        answer--;
                        break;
                    }
                }
            }        
        }
    }
}

class Task {
    private int task;
    private int priority;
    
    public Task(int task, int priority) {
        this.task = task;
        this.priority = priority;
    }
    
    public int getTask() {
        return task;
    }
    
    public int getPriority() {
        return priority;
    }
    
    @Override
    public String toString() {
        return "task=" + task +
                ", priority=" + priority;
    }
}
