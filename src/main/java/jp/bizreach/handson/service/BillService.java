package jp.bizreach.handson.service;

import java.math.BigDecimal;
import java.util.Arrays;

import jp.bizreach.handson.bean.Bill;
import jp.bizreach.handson.bean.Detail;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

/**
 * 請求書の情報を取得するビジネスロジックのつもり
 */
@Component
public class BillService {

    public Bill createBill() {
        
        // データベースの注文テーブルから情報を取得したつもり。
        
        Detail d1 = new Detail();
        d1.setProductName("イス");
        d1.setCount(10);
        d1.setUnitPrice(new BigDecimal(1000));

        Detail d2 = new Detail();
        d2.setProductName("テーブル");
        d2.setCount(3);
        d2.setUnitPrice(new BigDecimal(3000));

        Bill bill = new Bill();
        bill.setDestination("bar事務所");
        bill.setDetailList(Arrays.asList(d1,d2));
        bill.setIssueDate(new DateTime("2015-04-17").toDate());
        bill.setTitle("会議室用機材");

        return bill;
    }
    
}
