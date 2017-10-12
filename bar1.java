package com.offcn.bar;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class bar1 {
	//sdfasdfsadfsadfsadfsd
//sdfadfgadgg9999999999
	public static void main(String[] args) {
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		dataset.addValue(100, "±±¾©", "Æ»¹û");
		dataset.addValue(150, "±±¾©", "ÆÏÌÑ");
		dataset.addValue(80, "±±¾©", "Ïã½¶");
		dataset.addValue(120, "±±¾©", "éÙ×Ó");
		
	JFreeChart chart = ChartFactory.createBarChart3D("Ë®¹ûÏúÁ¿Í¼", "Ë®¹û", "ÏúÁ¿", dataset, PlotOrientation.VERTICAL, true, true, false);
	
	try {
		ChartUtilities.saveChartAsJPEG(new File("d:\\aaaa\\bar1.jpeg"), chart, 700, 500);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
