package defpackage;

import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioCardView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ sl0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new vl0((ol0) obj2);
            case 1:
                String str = (String) obj;
                int i2 = w71.O;
                str.getClass();
                ((w71) obj2).f(new atb(str));
                return g2b.a;
            default:
                final zv7 zv7Var = (zv7) obj2;
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                yaVar.s(new oh4() { // from class: tv7
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        ((List) obj3).getClass();
                        ya yaVar2 = yaVar;
                        ia6 ia6Var = (ia6) yaVar2.u;
                        int iOrdinal = ((l89) yaVar2.t()).v.ordinal();
                        e85.b(ia6Var.c, ((l89) yaVar2.t()).y, (iOrdinal == 0 || iOrdinal == 1) ? R.drawable.placeholder_video_attachment : R.drawable.placeholder_image_attachment, true);
                        ia6Var.b.setVisibility((((l89) yaVar2.t()).v == u60.u || ((l89) yaVar2.t()).v == u60.t) ? 0 : 8);
                        AspectRatioCardView aspectRatioCardView = ia6Var.a;
                        aspectRatioCardView.getClass();
                        xgb.a(aspectRatioCardView, new wv7(zv7Var, yaVar2, null));
                        return g2b.a;
                    }
                });
                return g2b.a;
        }
    }
}
