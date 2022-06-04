/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author User
 */
@Named(value = "chartBean")
@Dependent
public class ChartBean {

    
    private LineChartModel chart;
    
    public ChartBean() {
        chart = new LineChartModel();
        LineChartSeries s = new LineChartSeries("Sinus");
        LineChartSeries c = new LineChartSeries("Cosinus");
        
        for(int i=0; i<360; i++) {
            s.set(i, Math.sin(Math.toRadians(i)));
            c.set(i, Math.cos(Math.toRadians(i)));
        }
        
        chart.addSeries(s);
        chart.addSeries(c);
        
        chart.setLegendPosition("e");
        Axis y = chart.getAxis(AxisType.Y);
        y.setMin(-1.5);
        y.setMax(1.5);
        y.setLabel("Sinus and cosinus value");
        
        Axis x = chart.getAxis(AxisType.X);
        x.setMin(0);
        x.setMax(360);
        x.setTickInterval("20");
        x.setLabel("Degrees");
    }
    
    /**
     * @return the chart
     */
    public LineChartModel getChart() {
        return chart;
    }

    /**
     * @param chart the chart to set
     */
    public void setChart(LineChartModel chart) {
        this.chart = chart;
    }
    
}
