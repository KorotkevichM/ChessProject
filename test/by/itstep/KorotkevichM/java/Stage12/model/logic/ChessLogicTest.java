package by.itstep.KorotkevichM.java.Stage12.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class ChessLogicTest {

    @Test
    public void testCheckRookPositive1() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 1;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookPositive2() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }


    @Test
    public void testCheckRookPositive3() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookPositive4() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 8;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookPositive5() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookPositive6() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookPositive7() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 5;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookPositive8() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 3;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookNegative1() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookNegative2() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 3;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookNegative3() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 5;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookNegative4() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 3;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookNegative5() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 5;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookNegative6() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 7;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookNegative7() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 1;
        int y2 = 7;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookNegative8() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 1;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckRookNegative9() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 7;
        int y2 = 7;

        boolean expected = true;

        boolean actual = ChessLogic.checkRook(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingPositive1() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 5;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingPositive2() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 6;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingPositive3() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 4;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingPositive4() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 5;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingPositive5() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 4;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingPositive6() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 6;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingPositive7() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingPositive8() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 6;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }
    @Test
    public void testCheckKingNegative1() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 5;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingNegative2() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 5;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingNegative3() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 6;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKingNegative4() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 7;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive1() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 3;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive2() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 2;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive3() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 8;
        int y2 = 6;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive4() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 8;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive5() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 7;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive6() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 5;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive7() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 4;
        int y2 = 6;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive8() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 3;
        int y2 = 7;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive9() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 4;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive10() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 5;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopPositive11() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 7;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopNegative1() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 5;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopNegative2() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 6;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopNegative3() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 7;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopNegative4() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 6;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBishopNegative5() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 6;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenPositive1() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 1;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenPositive2() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 2;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenPositive3() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 6;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenPositive4() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 8;
        int y2 = 6;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenPositive5() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 8;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenPositive6() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 8;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenPositive7() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 6;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenPositive8() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 3;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenPositive9() {
        int x1 = 8;
        int y1 = 8;
        int x2 = 7;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenNegative1() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 6;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenNegative2() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 5;
        int y2 = 6;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckQueenNegative3() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 2;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKnightPositive1() {
        int x1 = 3;
        int y1 = 6;
        int x2 = 1;
        int y2 = 7;

        boolean expected = true;

        boolean actual = ChessLogic.checkKnight(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckKnightPositive2() {
        int x1 = 3;
        int y1 = 6;
        int x2 = 5;
        int y2 = 7;

        boolean expected = true;

        boolean actual = ChessLogic.checkKnight(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBoardPositive1() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkBoard(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }


    @Test
    public void testCheckBoardPositive2() {
        int x1 = 8;
        int y1 = 8;
        int x2 = 8;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkBoard(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }
    @Test
    public void testCheckBoardNegative1() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;

        boolean expected = true;

        boolean actual = ChessLogic.checkBoard(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBoardNegative2() {
        int x1 = 9;
        int y1 = 9;
        int x2 = 9;
        int y2 = 9;

        boolean expected = true;

        boolean actual = ChessLogic.checkBoard(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckBoardNegative3() {
        int x1 = -5;
        int y1 = -5;
        int x2 = -5;
        int y2 = -5;

        boolean expected = true;

        boolean actual = ChessLogic.checkBoard(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }



}

