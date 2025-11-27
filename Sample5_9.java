import java.io.BufferedReader;                    // 匯入 BufferedReader，用來一行一行讀取文字
import java.io.FileReader;                        // 匯入 FileReader，用來從檔案建立文字輸入串流
import java.io.IOException;                       // 匯入 IOException，處理輸出入錯誤

class Sample5_9 {                                 // 定義類別 Sample5_9

    public static void main(String[] args) {      // main 方法：程式進入點，args 接命令列參數

        if (args.length != 1) {                   // 如果命令列參數不是剛好一個（我們期待只有一個檔名）
            System.out.println("請指定正確的檔案名稱！");   // 提示使用者錯誤
            System.out.println("用法：java Sample5_9 檔案名稱"); // 額外給用法說明
            System.exit(1);                       // 結束程式，狀態碼 1 表示異常結束
        }                                         // 參數檢查結束

        String fileName = args[0];                // 把第一個命令列參數（檔名）存到 fileName 變數中

        // try-with-resources，自動幫忙 close() 資源
        try (BufferedReader br =                  // 宣告並建立 BufferedReader 物件 br
                     new BufferedReader(          // 用 BufferedReader 加上緩衝
                         new FileReader(fileName) // FileReader 使用剛剛取得的 fileName 開啟檔案
                     )) {

            String line;                          // 用來暫存每次讀到的一行字串
            while ((line = br.readLine()) != null) { // 反覆讀取每一行，直到 readLine() 回傳 null 代表 EOF
                System.out.println(line);         // 把讀到的一行印出來
            }                                     // while 迴圈結束，代表檔案讀完

        } catch (IOException e) {                 // 捕捉開檔 / 讀檔過程中的 IOException
            System.out.println("輸出入錯誤，無法讀取檔案！"); // 簡單錯誤訊息
            System.out.println(e.getMessage());   // 再印出詳細例外訊息，方便除錯
        }                                         // try-catch 結束
    }                                             // main 方法結束
}                                                 // Sample5_9 類別定義結束
