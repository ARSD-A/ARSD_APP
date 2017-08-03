package com.samridhi.arsdf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Scholar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholar);
        String p ="SCHOLARSHIPS\n AND PRIZES" ;
        String p1 = "College awards prizes to meritorious students who excel in the University Examinations. The Scholarships and Prizes awarded are as under:\n" +
                " \n" +
                "\n" +
                "(1)Taneja Foundation Scholarships are awarded to 10 meritorious and deserving students as subsidy towards admission fee.\n" +
                "\n" +
                "(2)All students who stand 1st and Ilnd in the College in any class/course and get atleast 60 per cent marks in the Annual University Examinations, are recognized and awarded scholarships (in the form of books). A recognition certificate by the College is also given to every prize/scholarship awardee.\n" +
                "\n" +
                "(3)Atma Ram Chadha Memorial Scholarship is awarded every year to all students who are Position Holders (ranking 1 to 10) in the University in any class/course in the University Examinations and secure at least 60 per cent marks.\n" +
                "\n" +
                "(4)S.K.Batra Memorial is awarded:\n" +
                "\n" +
                "     a.to the student who gets the maximum marks in Physics (Hons.) in the College and\n" +
                "\n" +
                "     b.to the best Science student of the College.\n" +
                "\n" +
                "(5)Sanjeev Arora Memorial Prize is awarded to the best student of Computer Science in the College.\n" +
                "\n" +
                "(6)Jitender Arora Memori a 1 Pri ze is awarded to the best student of BA (Prog) course in the College.\n" +
                "\n" +
                "(7)Naresh Kumari Memorial Prize is awarded to the best student of Hindi (Hons.) in the College.\n" +
                "\n" +
                "(8)Principal C.L. Suri Memorial Prize is awarded to the best girl and the best boy student of Political Science (Hons.) in the College.\n" +
                "\n" +
                "(9)Sultan Chand Memorial Scholarship is awarded to the best student of B.Com (Hons.) Ilnd and Illrd years in the College.\n" +
                "\n" +
                "(10)Rukman-Tara Prize is awarded to the students getting the highest marks in the College in Chemistry (Hons.) 1st and Ilnd years.\n" +
                "\n" +
                "(11)Inder Raj Dhawan Memorial Prize is awarded to the students getting the highest marks in B.Sc. (Hons) Physics I/II/IIIyr.\n" +
                "\n" +
                "(12)Raj Kumari Dhawan Memorial Prize is awarded to the students getting highest marks in B.Sc. (Hons) Electronics I/II/IIIyr.\n" +
                "\n" +
                "(13)Shyam Sunder Arora Memorial Prize is awarded to the academic topper from the Illrd year of B.A (Hons.) Economics.\n" +
                "\n" +
                "(14)Usha Aggarwal Trust has instituted a scholarship for the academic toppers in B. Com (Course) Ilnd and Illrd Year.\n" +
               "\n" +
               "(15)Sultan Chand Dropadi Devi Memorial prize for best Student of B. Com (Course) Ist Year.\n" +
                "\n"+"\nFollowing are the two links for MHRD scholarship portals:";
        String p2 = "<a href='http://mhrd.gov.in/scholarships'>Link 1</a>";
        String p3 = "<a href='https://india.gov.in/apply-scholarships-through-national-scholarships-portal'>Link 2</a>";
        String p4 = "<a href='http://cbse.nic.in/newsite/scholar.html'>Link 3</a>";
        String p5 = "\nYou can also check online at National Scholarship Portal.\n\n";
        TextView t1 = (TextView)findViewById(R.id.msg1);
        TextView t2 = (TextView)findViewById(R.id.msg2);
        TextView t3 = (TextView)findViewById(R.id.msg3);
        TextView t4 = (TextView)findViewById(R.id.msg4);
        TextView t5 = (TextView)findViewById(R.id.msg5);
        TextView t6 = (TextView)findViewById(R.id.msg6);

        Spanned text = Html.fromHtml(p2);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

        Spanned text1 = Html.fromHtml(p3);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        Spanned text2 = Html.fromHtml(p4);
        t5.setMovementMethod(LinkMovementMethod.getInstance());

        t1.setText(p);
        t2.setText(p1);
        t3.setText(text);
        t4.setText(text1);
        t5.setText(text2);
        t6.setText(p5);
    }
}
