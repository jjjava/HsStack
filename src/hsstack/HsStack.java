
package hsstack;

import list.HsList;
import tasks.fgi.Fgi;
import tasks.t2r.T2r;

/**
 *
 * @author hudson.sales
 */
public class HsStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HsList list = new HsList();
        list.add(new Fgi(1, "FGI", "teste1"));
        list.add(new Fgi(2, "FGI", "teste2"));
        list.add(new Fgi(3, "FGI", "teste3"));
        list.add(new Fgi(4, "FGI", "teste4"));
        list.add(new Fgi(5, "FGI", "teste5"));
        list.add(new Fgi(6, "FGI", "teste6"));
        list.add(new Fgi(7, "FGI", "teste7"));
        list.add(new Fgi(8, "FGI", "teste8"));
        list.add(new Fgi(9, "FGI", "teste9"));
        list.add(new Fgi(1, "FGI", "teste10"));
        list.add(new Fgi(2, "FGI", "teste11"));
        list.add(new Fgi(3, "FGI", "teste12"));
       
        list.process();
        list.add(new T2r(1, "T2R", "teste1"));
        list.process();
        list.add(new T2r(1, "T2R", "teste3"));
        list.add(new T2r(1, "T2R", "teste4"));
        list.add(new T2r(1, "T2R", "teste5"));
        list.add(new T2r(1, "T2R", "teste6"));
        list.add(new T2r(1, "T2R", "teste7"));
        list.process();
        
    }
}
