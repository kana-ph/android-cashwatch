package ph.kana.cashwatch.account

import android.provider.BaseColumns

class AccountDbContract private constructor() {
    class AccountsEntry : BaseColumns {
        val tableName: String = "accounts"
        val columnName: String = "name"
    }
}
