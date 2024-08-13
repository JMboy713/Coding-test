import java.util.*;

class Solution {
    static Set<Route> visited = new HashSet<>();
    static int[] start = {0, 0};

    public int solution(String dirs) {
        for (char dir : dirs.toCharArray()) {
            Route route = visit("" + dir);
            if (route != null) {
                visited.add(route);
            }
        }
        return visited.size();
    }

    public Route visit(String direction) {
        int[] newPosition = Arrays.copyOf(start, start.length);
        int[] visit = new int[4];

        if (direction.equals("U") && visitable(start[1] + 1)) {
            newPosition[1]++;
        } else if (direction.equals("D") && visitable(start[1] - 1)) {
            newPosition[1]--;
        } else if (direction.equals("L") && visitable(start[0] - 1)) {
            newPosition[0]--;
        } else if (direction.equals("R") && visitable(start[0] + 1)) {
            newPosition[0]++;
        } else {
            return null;
        }

        visit[0] = Math.min(start[0], newPosition[0]);
        visit[1] = Math.min(start[1], newPosition[1]);
        visit[2] = Math.max(start[0], newPosition[0]);
        visit[3] = Math.max(start[1], newPosition[1]);

        start = newPosition;

        return new Route(visit);
    }

    public boolean visitable(int dot) {
        return (dot <= 5 && dot >= -5);
    }

    static class Route {
        int[] points;

        Route(int[] points) {
            this.points = points;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Route route = (Route) o;
            return Arrays.equals(points, route.points);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(points);
        }

        @Override
        public String toString() {
            return Arrays.toString(points);
        }
    }

    
}
