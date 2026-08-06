package defpackage;

import androidx.recyclerview.widget.m;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioCardView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wm6 extends n50<l89> {

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

    public wm6(final oh4<? super l89, g2b> oh4Var) {
        super(new a());
        e93 e93Var = new e93(new xl6(), new am6(), new oh4() { // from class: dm6
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                final oh4 oh4Var2 = oh4Var;
                yaVar.s(new oh4() { // from class: gm6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        z96 z96Var = (z96) yaVar2.u;
                        int iOrdinal = ((l89) yaVar2.t()).v.ordinal();
                        e85.b(z96Var.c, ((l89) yaVar2.t()).y, (iOrdinal == 0 || iOrdinal == 1) ? R.drawable.placeholder_video_attachment : R.drawable.placeholder_image_attachment, true);
                        z96Var.d.setText(((l89) yaVar2.t()).u);
                        z96Var.b.setVisibility((((l89) yaVar2.t()).v == u60.u || ((l89) yaVar2.t()).v == u60.t) ? 0 : 8);
                        AspectRatioCardView aspectRatioCardView = z96Var.a;
                        aspectRatioCardView.getClass();
                        xgb.a(aspectRatioCardView, new qm6(oh4Var2, yaVar2, null));
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, km6.u);
        za<List<T>> zaVar = this.d;
        zaVar.getClass();
        zaVar.b(e93Var);
    }
}
