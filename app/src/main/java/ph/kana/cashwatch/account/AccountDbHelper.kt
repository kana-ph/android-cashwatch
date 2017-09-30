package ph.kana.cashwatch.account

import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import ph.kana.cashwatch.dbName
import ph.kana.cashwatch.dbVersion

class AccountDbHelper(context: Context) : SQLiteOpenHelper(context, dbName, null, dbVersion) {

}