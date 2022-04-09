package InterfaceSegregation.solution;

import InterfaceSegregation.solution.common.IAudioControl;
import InterfaceSegregation.solution.common.IMovie;

class TheLionKing implements IMovie, IAudioControl {

    @Override
    public void play() {
        // play movie
    }

    @Override
    public void increaseVolume() {
        // increase volume
    }
}