package OpenClosed.solution.example2.withExtension;

import OpenClosed.solution.example2.withExtension.common.BaseVideo;

public class TVShow extends BaseVideo {

    @Override
    public void calculateInteress() {
        System.out.println("calculates the interess based on the TV Show");
    }
}
