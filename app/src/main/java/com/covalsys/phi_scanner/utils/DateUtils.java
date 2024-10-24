package com.covalsys.phi_scanner.utils;

import android.util.Log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by CBS on 31-08-2020.
 */
public class DateUtils {

    public static DateFormat dateFormat(){
        String myFormat = "dd-MM-yyyy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        return sdf;
    }

    public static Date dateFormat2(String string) throws ParseException {
        String myFormat = "dd-MM-yyyy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        Date date = sdf.parse(string);
        return date;

    }

    public static DateFormat dateSysFormat(){
        String myFormat = "yyyyMMdd"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        return sdf;
    }

    public static String currentTime(){
        String currentTime = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        return currentTime;
    }

    public static String currentDate(){
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        String formattedDate = df.format(c);

        return formattedDate;
    }

    public static String currentDate_(){
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        String formattedDate = df.format(c);

        return formattedDate;
    }

    public static String currentDateYYYY(){
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        String formattedDate = df.format(c);

        return formattedDate;
    }

    public static String currentDateTimeYYYY(){
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        String formattedDate = df.format(c);

        return formattedDate;
    }


    public static String convertDateFormat(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }


    public static String convertDateFormat2(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }

    public static String convertDateFormat3(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }


    public static String convertDateFormat4(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss a", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }

    public static String convertDateFormat5(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }

    public static String convertDateFormat6(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }

    public static String convertDateFormat7(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }

    public static String convertDateFormat8(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }


    public static String convertTimeFormat(String mTime){
        String mNewDate ="";
        try {
            SimpleDateFormat HHmmFormat = new SimpleDateFormat("HH:mm", Locale.US); // 13:55
            Date date = HHmmFormat.parse(mTime);
            SimpleDateFormat hhmmFormat = new SimpleDateFormat("hh:mm a", Locale.US);// 01:55
            mNewDate = hhmmFormat.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }


    public static String convertDateFormat9(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("MMM,yyyy", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }

    public static String convertDateFormat10(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }

    public static String convertDateFormat11(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }

    public static String convertDateFormat12(String mDate){
        String mNewDate ="";
        try {
            SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
            Date date = sdfSource.parse(mDate);
            SimpleDateFormat sdfDestination = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            mNewDate = sdfDestination.format(date);
        }catch (ParseException e){
            System.out.println("Parse Exception : " + e);
        }
        return  mNewDate;
    }

    public static String convertDate(String oldDate){
        SimpleDateFormat old = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");
        SimpleDateFormat New_ = new SimpleDateFormat("dd-mm-yyyy HH:SS");
        try {
            Date old_ = old.parse(oldDate);
            return New_.format(old_);
        } catch (ParseException e) {
            Log.e("TAG", e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
