public class Main {
    public static void main(String[] args) {
        int n = 3; // מספר המספרים הנרקיסיסטיים לחיפוש
        int[] narcissisticNumbers = findNarcissisticNumbers(n);

        // הדפסת המספרים הנרקיסיסטיים שנמצאו
        for (int num : narcissisticNumbers) {
            System.out.println(num);
        }

    }

    // פעולה למציאת n המספרים הנרקיסיסטיים הראשונים
    public static int[] findNarcissisticNumbers(int n) {

    int count=0;
      for(int i=0; i<=n; i++){
          for(int j=0; j<=n; j++){


              int[] narcissisticNumbers;
              String numberStr = Integer.toString( narcissisticNumbers[i]);

          // יצירת מערך בגודל של מספר הספרות
          char[] digits = new char[numberStr.length()];

          // העתקת הספרות למערך
          for (j = 0; j < numberStr.length(); j++) {
              digits[j] = numberStr.charAt(i);
              count= digits[j]^numberStr.length();

          }
      }
        return new int[0]; // החזרה זמנית
    }

}