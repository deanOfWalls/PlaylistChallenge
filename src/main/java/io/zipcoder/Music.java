package io.zipcoder;

import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int numMoves = 0;
        int selectionIndex = Arrays.asList(playList).indexOf(selection);  //this assigns the index value of the selection after the string is found inside playList

        if (selectionIndex > startIndex) {
            for (int i = startIndex; i < selectionIndex; i++) {
                numMoves = i;
            }

        } else for (int i = startIndex; i > selectionIndex; i--) {
            numMoves = i;
        }
        return numMoves;
    }
}
