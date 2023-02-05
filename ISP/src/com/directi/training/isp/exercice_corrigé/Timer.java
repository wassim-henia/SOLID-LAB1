package com.directi.training.isp.exercice_corrigé;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeOut, final ITimer timer)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timer.timeOutCallback();
            }
        }, timeOut);
    }
}
