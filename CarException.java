public class CarException extends Exception {              // 宣告公開類別 CarException，繼承自 Exception（受檢例外）

    public CarException() {                                // 無參數建構子，當未指定訊息時呼叫
        super("汽油量不可為負值！");                         // 呼叫父類別建構子並設定預設錯誤訊息
    }                                                      // 無參數建構子結束

    public CarException(String message) {                  // 有參數建構子，可指定自訂錯誤訊息
        super(message);                                    // 把傳入的 message 交給父類別 Exception 儲存
    }                                                      // 有參數建構子結束
}                                                          // CarException 類別定義結束
