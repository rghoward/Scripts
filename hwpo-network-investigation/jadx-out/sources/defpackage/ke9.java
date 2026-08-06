package defpackage;

import android.text.Html;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ke9 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ di4 u;
    public final /* synthetic */ di4 v;

    public /* synthetic */ ke9(di4 di4Var, di4 di4Var2, int i) {
        this.t = i;
        this.u = di4Var;
        this.v = di4Var2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        di4 di4Var = this.v;
        di4 di4Var2 = this.u;
        switch (i) {
            case 0:
                final hi9.b bVar = (hi9.b) di4Var2;
                final hi9.c cVar = (hi9.c) di4Var;
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                yaVar.s(new oh4() { // from class: le9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        na6 na6Var = (na6) yaVar2.u;
                        o89 o89Var = ((fd8) yaVar2.t()).w;
                        AppCompatImageView appCompatImageView = na6Var.f;
                        appCompatImageView.setVisibility(o89Var == o89.v ? 0 : 8);
                        int iOrdinal = o89Var.ordinal();
                        if (iOrdinal == 1) {
                            appCompatImageView.setImageResource(R.drawable.ic_program_score);
                        } else if (iOrdinal == 3) {
                            appCompatImageView.setImageResource(R.drawable.ic_program_challenges);
                        }
                        MaterialTextView materialTextView = na6Var.d;
                        AppCompatImageButton appCompatImageButton = na6Var.b;
                        ek7.a(materialTextView, new qe9(materialTextView, na6Var));
                        materialTextView.setVisibility(!z2a.w(((fd8) yaVar2.t()).y) ? 0 : 8);
                        na6Var.e.setVisibility(z2a.w(((fd8) yaVar2.t()).y) ? 8 : 0);
                        materialTextView.setText(Html.fromHtml(((fd8) yaVar2.t()).y, 63));
                        na6Var.g.setText(((fd8) yaVar2.t()).v);
                        appCompatImageButton.setEnabled(((fd8) yaVar2.t()).A);
                        appCompatImageButton.setSelected(((fd8) yaVar2.t()).z);
                        ConstraintLayout constraintLayout = ((na6) yaVar2.u).a;
                        constraintLayout.getClass();
                        xgb.a(constraintLayout, new oe9(bVar, yaVar2, null));
                        xgb.a(appCompatImageButton, new pe9(cVar, yaVar2, null));
                        return g2b.a;
                    }
                });
                break;
            default:
                mh4 mh4Var = (mh4) di4Var;
                ada adaVar = (ada) obj;
                ((mh4) di4Var2).invoke();
                if (mh4Var != null ? ((Boolean) mh4Var.invoke()).booleanValue() : true) {
                    adaVar.close();
                }
                break;
        }
        return g2b.a;
    }
}
