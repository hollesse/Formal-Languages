/* Generated By:JavaCC: Do not edit this line. DeCommentTokenManager.java */

public class DeCommentTokenManager implements DeCommentConstants
{
  public static  java.io.PrintStream debugStream = System.out;
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   debugStream.println("   No more string literal token matches are possible.");
   debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   return pos + 1;
}
static private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa1_0(0x2L);
      default :
      debugStream.println("   No string literal matches possible.");
         return 1;
   }
}
static private final int jjMoveStringLiteralDfa1_0(long active0)
{
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 + 
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getLine() + " column " + input_stream.getColumn());
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x2L) != 0L)
            return jjStopAtPos(1, 1);
         break;
      default :
      debugStream.println("   No string literal matches possible.");
         return 2;
   }
   return 2;
}
static private final int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x8L);
      default :
      debugStream.println("   No string literal matches possible.");
         return 1;
   }
}
static private final int jjMoveStringLiteralDfa1_1(long active0)
{
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 + 
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getLine() + " column " + input_stream.getColumn());
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x8L) != 0L)
            return jjStopAtPos(1, 3);
         break;
      default :
      debugStream.println("   No string literal matches possible.");
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
};
public static final String[] jjstrLiteralImages = {
"", "\57\52", null, "\52\57", null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
   "ML_COMMENT", 
};
public static final int[] jjnewLexState = {
   -1, 1, -1, 0, -1, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[0];
static private final int[] jjstateSet = new int[0];
static StringBuffer image;
static int jjimageLen;
static int lengthOfMatch;
static protected char curChar;
public DeCommentTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}
public DeCommentTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 0; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

public static Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      debugStream.println("Returning the <EOF> token.");
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
      debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getLine() + " column " + input_stream.getColumn());
       curPos = jjMoveStringLiteralDfa0_0();
       if (jjmatchedPos == 0 && jjmatchedKind > 2)
       {
           debugStream.println("   Current character matched as a " + tokenImage[2] + " token.");
          jjmatchedKind = 2;
       }
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
      debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getLine() + " column " + input_stream.getColumn());
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 4)
       {
           debugStream.println("   Current character matched as a " + tokenImage[4] + " token.");
          jjmatchedKind = 4;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
        {
           debugStream.println("   Putting back " + (curPos - jjmatchedPos - 1) + " characters into the input stream.");
           input_stream.backup(curPos - jjmatchedPos - 1);
        }
    debugStream.println("****** FOUND A " + tokenImage[jjmatchedKind] + " MATCH (" + TokenMgrError.addEscapes(new String(input_stream.GetSuffix(jjmatchedPos + 1))) + ") ******\n");
           matchedToken = jjFillToken();
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

protected static final int[][][] statesForState = null;
protected static final int[][] kindForState = null;
  static  int kindCnt = 0;
  protected static  final String jjKindsForBitVector(int i, long vec)
  {
    String retVal = "";
    if (i == 0)
       kindCnt = 0;
    for (int j = 0; j < 64; j++)
    {
       if ((vec & (1L << j)) != 0L)
       {
          if (kindCnt++ > 0)
             retVal += ", ";
          if (kindCnt % 5 == 0)
             retVal += "\n     ";
          retVal += tokenImage[i * 64 + j];
       }
    }
    return retVal;
  }

  protected static  final String jjKindsForStateVector(int lexState, int[] vec, int start, int end)
  {
    boolean[] kindDone = new boolean[5];
    String retVal = "";
    int cnt = 0;
    for (int i = start; i < end; i++)
    {
     if (vec[i] == -1)
       continue;
     int[] stateSet = statesForState[curLexState][vec[i]];
     for (int j = 0; j < stateSet.length; j++)
     {
       int state = stateSet[j];
       if (!kindDone[kindForState[lexState][state]])
       {
          kindDone[kindForState[lexState][state]] = true;
          if (cnt++ > 0)
             retVal += ", ";
          if (cnt % 5 == 0)
             retVal += "\n     ";
          retVal += tokenImage[kindForState[lexState][state]];
       }
     }
    }
    if (cnt == 0)
       return "{  }";
    else
       return "{ " + retVal + " }";
  }

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 2 :
        if (image == null)
            image = new StringBuffer();
            image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                    System.out.print(image);
         break;
      default : 
         break;
   }
}
}
