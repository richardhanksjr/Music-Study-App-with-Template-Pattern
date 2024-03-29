package edu.bu.met.cs665.interval;

/**
 * Class for defining the mapping of musical constants that will be use in questions
 * 
 * @author Richard Hanks
 *
 */

public class Interval {

  /**
   * 
   * @param noteNumber The number of half steps in an interval.
   * @return The string representation of the size of the interval.
   */
  public static String numerOfHalfStepsAsString(int noteNumber) {
    String returnString = null;
    switch (noteNumber) {
      case 0:
        returnString = "perfect unison";
        break;
      case 1:
        returnString = "minor second above";
        break;
      case 2:
        returnString = "major second above";
        break;
      case 3:
        returnString = "minor third above";
        break;
      case 4:
        returnString = "major third above";
        break;
      case 5:
        returnString = "perfect fourth above";
        break;
      case 6:
        returnString = "tritone above";
        break;
      case 7:
        returnString = "perfect fifth above";
        break;
      case -1:
        returnString = "minor second below";
        break;
      case -2:
        returnString = "major second below";
        break;
      case -3:
        returnString = "minor third below";
        break;
      case -4:
        returnString = "major third below";
        break;
      case -5:
        returnString = "perfect fourth below";
        break;
      case -6:
        returnString = "tritone below";
        break;
      case -7:
        returnString = "perfect fifth below";
        break;
      // TODO implement the rest of the half steps
    }

    return returnString;
  }


  /**
   * 
   * @param pitchNumber the note in the chromatic scale where 0 maps to C and each half step above
   *        is 1 number higher
   * @return The pitch name for the given pitch number, where C is 0.
   */
  public static String pitchNumberToChromaticNoteName(int pitchNumber) {
    if (pitchNumber < 0) {
      while (pitchNumber < 0) {
        pitchNumber += 12;
      }
    }
    String noteName = null;
    // Reduce the pitch number to fit into one octave
    pitchNumber %= 12;
    switch (pitchNumber) {
      case 0:
        noteName = "C";
        break;
      case 1:
        noteName = "C#";
        break;
      case 2:
        noteName = "D";
        break;
      case 3:
        noteName = "Eb";
        break;
      case 4:
        noteName = "E";
        break;
      case 5:
        noteName = "F";
        break;
      case 6:
        noteName = "F#";
        break;
      case 7:
        noteName = "G";
        break;
      case 8:
        noteName = "Ab";
        break;
      case 9:
        noteName = "A";
        break;
      case 10:
        noteName = "Bb";
        break;
      case 11:
        noteName = "B";
        break;
    }
    return noteName;
  }

  public static String altoClefNoteNameForLineNumber(int lineNumber) {
    String lineName = null;
    switch (lineNumber) {
      case 0:
        lineName = "F";
        break;
      case 1:
        lineName = "A";
        break;
      case 2:
        lineName = "C";
        break;
      case 3:
        lineName = "E";
        break;
      case 4:
        lineName = "G";
        break;
    }
    return lineName;
  }
}
