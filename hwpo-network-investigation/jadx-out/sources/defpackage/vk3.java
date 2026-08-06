package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vk3 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ vk3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                String str = (String) obj;
                int i2 = gl3.V;
                str.getClass();
                ((gl3) obj2).f(new atb(str));
                return g2b.a;
            case 1:
                return Integer.valueOf(((zr9) obj2).h1(od3.d(((mz6) obj).e)));
            default:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                ra6 ra6Var = (ra6) yaVar.u;
                ra6Var.a.setEnabled(((vy2) yaVar.t()).j);
                ra6Var.h.setText(((vy2) yaVar.t()).b);
                ra6Var.e.setText(((vy2) yaVar.t()).f);
                MaterialTextView materialTextView = ra6Var.f;
                materialTextView.setText(((vy2) yaVar.t()).c);
                materialTextView.setTextColor(((vy2) yaVar.t()).d);
                MaterialTextView materialTextView2 = ra6Var.b;
                materialTextView2.setTextColor(((vy2) yaVar.t()).h);
                materialTextView2.setText(String.valueOf(((vy2) yaVar.t()).g));
                ImageView imageView = ra6Var.g;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(ColorStateList.valueOf(((vy2) yaVar.t()).e));
                int i3 = 0;
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(yaVar.w.getResources().getDimension(R.dimen.m_radius));
                imageView.setBackground(gradientDrawable);
                Drawable[] compoundDrawablesRelative = materialTextView2.getCompoundDrawablesRelative();
                compoundDrawablesRelative.getClass();
                ArrayList arrayListV = u30.v(compoundDrawablesRelative);
                int size = arrayListV.size();
                while (i3 < size) {
                    Object obj3 = arrayListV.get(i3);
                    i3++;
                    ((Drawable) obj3).setColorFilter(new PorterDuffColorFilter(((vy2) yaVar.t()).h, PorterDuff.Mode.SRC_IN));
                }
                ra6Var.d.setColorFilter(new PorterDuffColorFilter(((vy2) yaVar.t()).i, PorterDuff.Mode.SRC_IN));
                return g2b.a;
        }
    }
}
