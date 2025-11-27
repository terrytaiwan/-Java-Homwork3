public class Sample5_2 {                                       // 宣告公開類別 Sample5_2，檔名需與類別名稱相同

    public static void main(String[] args) {                   // 主程式進入點 main 方法，程式從這裡開始執行
        int[] test = new int[5];                               // 建立一個可以存放 5 個 int 的陣列 test，合法索引為 0~4

        try {                                                  // try 區塊：放可能發生例外（Exception）的程式碼
            System.out.println("準備把值指定給 test[10]");     // 顯示訊息，告訴使用者即將對 test[10] 指派值
            test[10] = 80;                                     // 嘗試將 80 指派給 test[10]，因為超出索引範圍會丟出例外
            System.out.println("這行理論上不會被執行到");       // 若上一行丟出例外，這一行就不會執行
        } catch (ArrayIndexOutOfBoundsException e) {           // catch 區塊：捕捉超出陣列索引範圍的例外物件 e
            System.out.println("超過陣列索引範圍：" + e.getMessage()); // 印出錯誤提示與例外訊息，避免程式直接當掉
        }                                                      // 結束 catch 區塊

        System.out.println("程式沒有當掉，順利執行到最後一行。"); // 顯示訊息說明，即使有例外，程式仍正常結束
    }                                                          // 結束 main 方法的程式區塊

}                                                              // 結束類別 Sample5_2 的程式區塊
