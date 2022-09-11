package com.example.test10

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener{
            override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
                Log.d("TAG", "year : $p1, month : ${p2+1}, dayOfMonth : $p3")
            }
        }, 2020, 8, 21).show()

        TimePickerDialog(this, object : TimePickerDialog.OnTimeSetListener{
            override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
                Log.d("TAG", "time : $p1, minute : $p2")
            }
        }, 15, 0, true).show()

        val eventHandler = object : DialogInterface.OnClickListener {
            override fun onClick(p0: DialogInterface?, p1: Int) {
                if(p1 == DialogInterface.BUTTON_POSITIVE){
                    Log.d("TAG", "positive button click")
                }else if(p1 == DialogInterface.BUTTON_NEGATIVE){
                    Log.d("TAG", "negative button click")
                }
            }
        }

        AlertDialog.Builder(this).run {
            setTitle("test dialog")
            setIcon(android.R.drawable.ic_dialog_info)
            setMessage("정말 종료하시겠습니까?")
            setPositiveButton("OK", eventHandler)
            setNegativeButton("Cancel", eventHandler)
            setNeutralButton("More", eventHandler)
            setPositiveButton("YES", eventHandler)
            setNegativeButton("NO", eventHandler)
            show()
        }

        val items = arrayOf<String>("사과", "복숭아", "수박", "딸기")
        AlertDialog.Builder(this).run {
            setTitle("items test")
            setIcon(android.R.drawable.ic_dialog_info)
            setSingleChoiceItems(items, 1, object : DialogInterface.OnClickListener{
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    Log.d("TAG", "${items[p1]}이 선택되었습니다.")
                }
            })

//            setMultiChoiceItems(items, booleanArrayOf(true, false, true, false), object : DialogInterface.OnMultiChoiceClickListener{
//                    override fun onClick(p0: DialogInterface?, p1: Int, p2: Boolean) {
//                        Log.d("TAG", "${items[p1]} 이 ${if(p2) "선택되었습니다" else "선택 해제되었습니다."}")
//                    }
//            })
//            setItems(items, object : DialogInterface.OnClickListener {
//                override fun onClick(p0: DialogInterface?, p1: Int) {
//                    Log.d("TAG", "선택한 과일 : ${items[p1]}")
//                }
//            })
            setCancelable(false)
            setPositiveButton("닫기", null)
            show()
        }.setCanceledOnTouchOutside(false)



    }




    @RequiresApi(Build.VERSION_CODES.R)
    fun showToast() {
        val toast = Toast.makeText(this, "종료하려면 한 번 더 누르세요.", Toast.LENGTH_SHORT)
        toast.addCallback(
            object : Toast.Callback() {
                override fun onToastHidden() {
                    super.onToastHidden()
                    Log.d("TAG", "onToastHidden")
                }

                override fun onToastShown() {
                    super.onToastShown()
                    Log.d("TAG", "onToastShown")
                }
            })
        toast.show()
    }




}

