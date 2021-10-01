/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.gui.purple_team;

import java.text.DecimalFormat;

/**
 *
 * @author Asmaa
 */
public class time {

    private long minute;
    private long second;
    private String dsecond;
    private String dminute;
  private  DecimalFormat dF = new DecimalFormat("00");

    public time(long minute, long second) {
        this.minute = minute;
        this.second = second;
    }

    public void seTime() {
        for (int i = 0; i < (minute+3) * 60; i++) {
            dsecond = dF.format(second);
            dminute = dF.format(minute);
            second--;
            System.out.println(dminute + ":" + dsecond);
            if (second == -1) {
                second = 59;
                minute--;
                dsecond = dF.format(second);
                dminute = dF.format(minute);
                System.out.println(dminute + ":" + dsecond);

            }

            if (minute == 0 && second == 0) {
                System.exit(0);
            }
        }
    }
    
    public void stop()
    {
        System.exit(0);
    }
   
}
