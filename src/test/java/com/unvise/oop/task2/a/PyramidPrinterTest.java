package com.unvise.oop.task2.a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidPrinterTest {

    @Test
    void print() {
        // given
        String printedPyramid = """
                       #  #
                      ##  ##
                     ###  ###
                    ####  ####
                   #####  #####
                  ######  ######
                 #######  #######
                ########  ########
                """;

        // then
        assertEquals(printedPyramid, PyramidPrinter.print("#", 8));
    }

}