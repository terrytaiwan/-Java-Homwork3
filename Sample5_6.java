import java.io.BufferedReader;                   // 匯入 BufferedReader 類別，用來建立具有緩衝功能的文字輸入串流
import java.io.InputStreamReader;               // 匯入 InputStreamReader 類別，負責把位元資料轉成字元資料
import java.io.IOException;                     // 匯入 IOException 類別，處理由輸入輸出產生的例外狀況

public class Sample5_6 {                        // 宣告公開類別 Sample5_6，檔名需與類別名稱相同

    public static void main(String[] args) {    // 主程式進入點 main 方法，程式由此開始執行
        System.out.println("請輸入字串：");      // 在主控台提示使用者輸入一段字串

        try {                                   // try 區塊，放入「可能會發生輸入輸出例外」的程式碼
            BufferedReader br =                 // 宣告並建立 BufferedReader 物件 br，用來從鍵盤讀取文字
                    new BufferedReader(         // 建立 BufferedReader，外層增加緩衝區提高讀取效率
                            new InputStreamReader(System.in)); // 使用 InputStreamReader 將標準輸入 System.in 轉成字元輸入串流

            String str = br.readLine();         // 從 br 中讀取一行文字，並指定給字串變數 str

            System.out.println("已讀入的字串是：" + str); // 將剛剛讀入的字串顯示在主控台上
        } catch (IOException e) {               // 捕捉在 try 區塊中可能拋出的 IOException 例外
            System.out.println("輸入或輸出時發生錯誤：" + e.getMessage());
                                                // 當發生例外時，顯示錯誤訊息與例外的說明
        }                                       // 結束 catch 區塊
    }                                           // 結束 main 方法
}                                               // 結束類別 Sample5_6 的定義
