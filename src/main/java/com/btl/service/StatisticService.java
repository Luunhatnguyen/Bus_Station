/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btl.service;

import com.btl.pojos.Bus;
import java.util.Date;
import java.util.List;


public interface StatisticService {

    List<Object> getStatistic(String kw, int page);
    List<Object> RevenueStats(String kw, Date fromDate,Date toDate);
    List<Object> RevenueStatsMonth(String kw, Date fromDate,Date toDate);
    List<Object> RevenueStatsPeriod(Date fromDate, Date toDate);
    
    

    
}
