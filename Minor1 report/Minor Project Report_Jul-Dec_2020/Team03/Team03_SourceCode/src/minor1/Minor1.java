
package minor1;

import java.util.Timer;
import java.util.TimerTask;

public class Minor1 {
    
    public Minor1(){
        
    }

    
    public static void main(String[] args)throws Exception {
      
//        timer.schedule(task, 0,1000);600000
        Start st = new Start();
        st.setVisible(true); 
        try{
//                    Thread.sleep(200);

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                Start.loadingnum.setText(Integer.toString(i)+"%");
                Start.loadingbar.setValue(i);
            }
        }
        catch(Exception e){
        System.out.print(e);
        }
                st.setVisible(false); 
                new nav().setVisible(true);

    }
    
}
