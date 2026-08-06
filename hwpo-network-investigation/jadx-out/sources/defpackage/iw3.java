package defpackage;

import android.graphics.drawable.Animatable;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.m;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iw3 extends n50<l89> {
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends m.e<l89> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(l89 l89Var, l89 l89Var2) {
            return l89Var.equals(l89Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(l89 l89Var, l89 l89Var2) {
            return l89Var.t == l89Var2.t;
        }
    }

    public iw3(final oh4<? super l89, g2b> oh4Var, final oh4<? super l89, g2b> oh4Var2) {
        super(new b());
        this.d.b(new e93(new dg(1), new gv3(), new oh4() { // from class: jv3
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                final oh4 oh4Var3 = oh4Var2;
                final oh4 oh4Var4 = oh4Var;
                yaVar.s(new oh4() { // from class: mv3
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        int i;
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        t96 t96Var = (t96) yaVar2.u;
                        MaterialTextView materialTextView = t96Var.d;
                        FrameLayout frameLayout = t96Var.g;
                        AppCompatImageView appCompatImageView = t96Var.b;
                        materialTextView.setText(((l89) yaVar2.t()).u);
                        t96Var.c.setText(((l89) yaVar2.t()).C);
                        t96Var.e.setText(((l89) yaVar2.t()).A);
                        t96Var.f.setImageResource(pv3.a[((l89) yaVar2.t()).E.ordinal()] == 1 ? R.drawable.ic_uploading_retry : R.drawable.ic_uploading_cancel);
                        frameLayout.setVisibility(((l89) yaVar2.t()).E != z60.w ? 0 : 8);
                        xgb.a(frameLayout, new bw3(oh4Var3, yaVar2, null));
                        int iOrdinal = ((l89) yaVar2.t()).E.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1) {
                            i = R.drawable.ic_attachment_uploading;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                u.b();
                                return null;
                            }
                            i = R.drawable.ic_delete_media_attachment;
                        }
                        appCompatImageView.setImageResource(i);
                        Object drawable = appCompatImageView.getDrawable();
                        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                        if (animatable != null) {
                            animatable.start();
                        }
                        xgb.a(appCompatImageView, new cw3(oh4Var4, yaVar2, null));
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, qv3.u));
    }
}
