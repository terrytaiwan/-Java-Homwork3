import java.io.BufferedWriter;                       // 匯入 BufferedWriter 類別，用來提供緩衝區寫入功能
import java.io.FileWriter;                           // 匯入 FileWriter 類別，用來把文字資料寫入檔案
import java.io.IOException;                          // 匯入 IOException 類別，處理解檔寫檔時的錯誤
import java.io.PrintWriter;                          // 匯入 PrintWriter 類別，提供方便的 println 方法

class Sample5_7 {                                    // 宣告類別 Sample5_7

    public static void main(String[] args) {         // main 方法：程式進入點
        System.out.println("開始將文字寫入檔案…");    // 提示使用者：開始寫檔

        // try-with-resources：在括號裡宣告的資源會自動在區塊結束時關閉
        try (FileWriter fw = new FileWriter("test1.txt");      // 建立 FileWriter，輸出檔名為 test1.txt（可自行修改）
             BufferedWriter bw = new BufferedWriter(fw);       // 用 BufferedWriter 包住，加入緩衝區
             PrintWriter pw = new PrintWriter(bw)) {           // 再用 PrintWriter 包住，方便用 println()

            pw.println("Hello!");                              // 將字串 "Hello!" 寫入檔案一行
            pw.println("GoodBye!");                            // 將字串 "GoodBye!" 寫入下一行

            System.out.println("已成功將文字寫入檔案。");        // 提示寫入成功
        } catch (IOException e) {                              // 捕捉寫檔過程中可能發生的 IOException
            System.out.println("輸出入發生錯誤：" + e);         // 印出錯誤訊息與例外內容
        }                                                      // try-catch 結束

        System.out.println("程式已順利結束。");                 // 最後提示程式正常結束
    }                                                          // main 方法結束
}                                                              // Sample5_7 類別定義結束
