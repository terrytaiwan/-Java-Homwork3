import java.io.BufferedReader;                         // 匯入 BufferedReader 類別，用來建立有緩衝區的文字輸入串流
import java.io.FileReader;                             // 匯入 FileReader 類別，用來從檔案中讀取文字資料
import java.io.IOException;                            // 匯入 IOException 類別，處理讀寫檔案時可能發生的輸入輸出例外

class Sample5_8 {                                      // 宣告類別 Sample5_8

    public static void main(String[] args) {           // 主程式進入點 main 方法
        try {                                          // try 區塊：放可能會拋出 IOException 的程式碼

            BufferedReader br =                        // 宣告並建立 BufferedReader 物件 br，用來從檔案逐行讀取文字
                    new BufferedReader(                // 建立 BufferedReader，外層提供緩衝，提升讀取效率
                            new FileReader("test1.txt"));// 使用 FileReader 以文字模式開啟檔案 "test1.txt" 當作輸入來源

            String str1 = br.readLine();               // 從緩衝區讀取一行文字，存到字串變數 str1
            String str2 = br.readLine();               // 再讀取下一行文字，存到字串變數 str2

            System.out.println("讀入檔案中的兩個字串是："); // 提示訊息，說明接下來要顯示從檔案讀到的兩行字串
            System.out.println(str1);                  // 在主控台輸出第一行字串內容
            System.out.println(str2);                  // 在主控台輸出第二行字串內容

            br.close();                                // 關閉 BufferedReader，釋放檔案與相關系統資源
        }                                              // 結束 try 區塊

        catch (IOException e) {                        // catch 區塊：如果 try 內有輸入輸出錯誤就會被這裡捕捉到
            System.out.println("讀出入錯誤：" + e.getMessage());
                                                       // 顯示自訂錯誤訊息並附上例外物件的詳細說明
        }                                              // 結束 catch 區塊
    }                                                  // 結束 main 方法
}                                                      // 結束類別 Sample5_8 的定義
