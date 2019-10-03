/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cruzeiro.ads.brcantina.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author logon
 */
public class Data {
    public static String convertSql(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String result = dateFormat.format(date);
        return result;
    }

    public static String convertString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String result = dateFormat.format(date);
        return result;
    }

    public static Date convertDate(String date) {
        try {
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            return data;
        } catch (ParseException e) {
            return null;
        }
    }
}
