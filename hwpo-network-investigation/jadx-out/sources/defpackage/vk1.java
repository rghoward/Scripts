package defpackage;

import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.m;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vk1 extends n50<v23> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m.e<v23> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(v23 v23Var, v23 v23Var2) {
            v23 v23Var3 = v23Var;
            v23 v23Var4 = v23Var2;
            if ((v23Var3 instanceof sk1.b) && (v23Var4 instanceof sk1.b)) {
                return v23Var3.equals(v23Var4);
            }
            if ((v23Var3 instanceof sk1.a) && (v23Var4 instanceof sk1.a)) {
                return v23Var3.equals(v23Var4);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(v23 v23Var, v23 v23Var2) {
            v23 v23Var3 = v23Var;
            v23 v23Var4 = v23Var2;
            if ((v23Var3 instanceof sk1.b) && (v23Var4 instanceof sk1.b)) {
                return ((sk1.b) v23Var3).c == ((sk1.b) v23Var4).c;
            }
            return (v23Var3 instanceof sk1.a) && (v23Var4 instanceof sk1.a) && ((sk1.a) v23Var3).c == ((sk1.a) v23Var4).c;
        }
    }

    public vk1(final boolean z, final mh4<g2b> mh4Var, final oh4<? super sk1, g2b> oh4Var, oh4<? super w60.a, g2b> oh4Var2, ci4<? super w60.b, ? super List<? extends w60>, g2b> ci4Var, ci4<? super sk1, ? super w60, g2b> ci4Var2, ci4<? super sk1, ? super w60, g2b> ci4Var3) {
        super(new a());
        za<List<T>> zaVar = this.d;
        zaVar.b(new e93(new kc8(), new nc8(3), new oh4() { // from class: lc8
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                ConstraintLayout constraintLayout = ((ka6) yaVar.u).b.a;
                constraintLayout.getClass();
                xgb.a(constraintLayout, new pc8(mh4Var, null));
                yaVar.s(new oh4() { // from class: mc8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        cib cibVar = ((ka6) yaVar2.u).b;
                        cibVar.e.setText(((nm1) yaVar2.t()).a);
                        xx.f(cibVar.c, ((nm1) yaVar2.t()).b);
                        cibVar.d.setBackgroundTintList(ColorStateList.valueOf(((nm1) yaVar2.t()).c));
                        MaterialTextView materialTextView = cibVar.b;
                        Integer num = ((nm1) yaVar2.t()).d;
                        xx.f(materialTextView, num != null ? String.valueOf(num.intValue()) : null);
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, oc8.u));
        zaVar.b(new e93(new jk1(0), new mk1(3, 0), new oh4() { // from class: kk1
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                final boolean z2 = z;
                final oh4 oh4Var3 = oh4Var;
                yaVar.s(new oh4() { // from class: lk1
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        oa6 oa6Var = (oa6) yaVar2.u;
                        MaterialTextView materialTextView = oa6Var.c;
                        ShapeableImageView shapeableImageView = oa6Var.d;
                        MaterialTextView materialTextView2 = oa6Var.g;
                        materialTextView.setText(((sk1.b) yaVar2.t()).g);
                        AppCompatImageView appCompatImageView = oa6Var.b;
                        appCompatImageView.setVisibility(z2 ? 0 : 8);
                        xgb.a(appCompatImageView, new ok1(oh4Var3, yaVar2, null));
                        materialTextView2.setText(String.valueOf(a3a.S(((sk1.b) yaVar2.t()).g)));
                        oa6Var.f.setText(((sk1.b) yaVar2.t()).j);
                        oa6Var.e.setText(((sk1.b) yaVar2.t()).f);
                        String str = ((sk1.b) yaVar2.t()).h;
                        boolean z3 = str == null || z2a.w(str);
                        shapeableImageView.setVisibility(!z3 ? 0 : 8);
                        materialTextView2.setVisibility(z3 ? 0 : 8);
                        if (str != null && !z2a.w(str)) {
                            xgb.f(shapeableImageView, str, new bi9(1));
                        }
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, nk1.v));
        zaVar.b(ek1.a(z, 2, oh4Var, oh4Var2, ci4Var, ci4Var2, ci4Var3, new tk1(0)));
        zaVar.b(ek1.a(z, 3, oh4Var, oh4Var2, ci4Var, ci4Var2, ci4Var3, new uk1(0)));
    }
}
