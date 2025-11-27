public class Sample5_4 {                                          // 宣告一個公開類別 Sample5_4，檔名需要與類別名稱相同

    public static void main(String[] args) {                      // 主程式進入點 main 方法，程式從這裡開始執行
        int[] test = new int[5];                                  // 建立一個 int 陣列 test，長度為 5，合法索引為 0~4

        try {                                                     // try 區塊：放「可能會發生例外」的程式碼
            System.out.println("準備將 80 指定給 test[10]");      // 顯示提示訊息，說明即將對 test[10] 指派值
            test[10] = 80;                                       // 嘗試將 80 指定給 test[10]，索引 10 超出範圍會拋出例外
            System.out.println("這行其實不會被執行到");            // 若上一行拋出例外，這行就不會執行（示意用）
        }                                                         // 結束 try 區塊

        // 這裡的 e 會接收到拋出的例外物件（ArrayIndexOutOfBoundsException）
        catch (ArrayIndexOutOfBoundsException e) {                // catch 區塊：捕捉「陣列索引超出範圍」這種型態的例外，參數 e 代表該例外物件
            System.out.println("超過陣列索引範圍了！");             // 提示使用者發生了陣列索引錯誤
            System.out.println("發生了「" + e + "」這個例外");     // 將例外物件 e 轉成字串印出，可看到例外類型與簡單訊息
        }                                                         // 結束 catch 區塊

        finally {                                                 // finally 區塊：不論是否發生例外都一定會執行
            System.out.println("finally 區塊一定會被執行。");       // 顯示訊息，證明 finally 一定會走到
        }                                                         // 結束 finally 區塊

        System.out.println("程式已順利執行到最後一行。");           // 即使中間發生例外，也因為有 try-catch，所以程式不會當掉，能正常結束
    }                                                             // main 方法結束

}                                                                 // 類別 Sample5_4 結束
