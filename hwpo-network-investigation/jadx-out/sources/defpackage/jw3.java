package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable;
import androidx.recyclerview.widget.m;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioCardView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jw3 extends n50<l89> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m.e<l89> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(l89 l89Var, l89 l89Var2) {
            return l89Var.equals(l89Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(l89 l89Var, l89 l89Var2) {
            return l89Var.t == l89Var2.t;
        }
    }

    public jw3(final oh4 oh4Var, final int i) {
        super(new a());
        e93 e93Var = new e93(new dv3(), new hv3(), new oh4() { // from class: kv3
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                final int i2 = i;
                final oh4 oh4Var2 = oh4Var;
                yaVar.s(new oh4() { // from class: nv3
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        v96 v96Var = (v96) yaVar2.u;
                        s60 s60Var = ((l89) yaVar2.t()).D;
                        int iOrdinal = s60Var.ordinal();
                        if (iOrdinal == 0) {
                            v96Var.c.setImageResource(R.drawable.ic_file_download);
                        } else if (iOrdinal == 1) {
                            v96Var.c.setImageResource(R.drawable.ic_file_loaded);
                        } else if (iOrdinal == 2) {
                            v96Var.c.setImageResource(R.drawable.ic_file_retry);
                            v96Var.b.setImageDrawable(null);
                        } else {
                            if (iOrdinal != 3) {
                                u.b();
                                return null;
                            }
                            v96Var.c.setImageResource(R.drawable.ic_file_loading);
                            Object drawable = v96Var.c.getDrawable();
                            drawable.getClass();
                            ((Animatable) drawable).start();
                            v96Var.b.setImageResource(R.drawable.ic_loading_stop);
                        }
                        v96Var.b.setVisibility((s60Var == s60.w || s60Var == s60.v) ? 0 : 4);
                        MaterialTextView materialTextView = v96Var.e;
                        AspectRatioCardView aspectRatioCardView = v96Var.a;
                        materialTextView.setText(((l89) yaVar2.t()).u);
                        v96Var.d.setText(((l89) yaVar2.t()).C);
                        v96Var.f.setText(((l89) yaVar2.t()).A);
                        aspectRatioCardView.setBackgroundTintList(ColorStateList.valueOf(yaVar2.w.getColor(i2)));
                        xgb.a(aspectRatioCardView, new aw3(oh4Var2, yaVar2, null));
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, rv3.u);
        za<List<T>> zaVar = this.d;
        zaVar.getClass();
        zaVar.b(e93Var);
    }
}
