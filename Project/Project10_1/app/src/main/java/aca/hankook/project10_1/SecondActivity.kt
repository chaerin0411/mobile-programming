package aca.hankook.project10_1

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.second.*

/* 02 액티비티의 개요
    실습10-1 새로운 액티비티 추가하기 */
/* 메인 화면의 버튼을 클릭하면 서브 화면이 나오는 응용프로그램 */
/* 예제10-3 SecondActivity.kt 코드 1 */
class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        /* 예제10-4 SecondActivity.kt 코드 2 */
        btnReturn.setOnClickListener {
            finish()
        }
    }
}
