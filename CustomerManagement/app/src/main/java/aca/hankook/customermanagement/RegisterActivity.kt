package aca.hankook.customermanagement

import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        var grades = arrayOf("VIP고객", "GOLD고객", "SILVER고객")
        var adapter1 : ArrayAdapter<String>
        adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, grades)
        spGrade.adapter = adapter1

        rButton1.setOnClickListener {
            var name: String = edName.text.toString()
            var sex = ""
            if (rb1.isChecked) {
                sex = "남"
            } else {
                sex = "여"
            }
            var phone: String = edPhone.text.toString()
            var email: String = edEmail.text.toString()
            var city: String = edCity.text.toString()
            var grade : String = spGrade.selectedItem.toString()
            var myHelper: MyDBHelper = MyDBHelper(this)
            var sqlDB: SQLiteDatabase = myHelper.writableDatabase
            var insertSql: String =
                "insert into customerTBL(name, sex, phone, email, city, grade) values ('" + name + "', '" + sex + "', '" + phone + "', '" + email + "', '" + city + "', '" + grade + "')"
            sqlDB.execSQL(insertSql)

            Toast.makeText(applicationContext, "insert ok " + name, Toast.LENGTH_LONG).show()
            sqlDB.close()
        }
    }
}