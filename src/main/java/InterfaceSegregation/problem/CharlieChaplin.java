package InterfaceSegregation.problem;

import InterfaceSegregation.problem.common.IMovie;

class CharlieChaplin implements IMovie {

    @Override
    public void play() {
        // play movie
    }

    @Override
    public void increaseVolume() {
        // this method will not be used, however, this way, it will have to be implemented
        // to many people throws an exception or leave it blank, however, it is wrong! it hurts the principle!
    }
}
