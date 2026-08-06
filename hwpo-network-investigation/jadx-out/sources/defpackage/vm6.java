package defpackage;

import android.graphics.drawable.Animatable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.m;
import com.hwpo_training_app.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vm6 extends n50<l89> {
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

    public vm6(final oh4<? super l89, g2b> oh4Var, final oh4<? super l89, g2b> oh4Var2) {
        super(new b());
        this.d.b(new e93(new wl6(), new zl6(), new oh4() { // from class: cm6
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                final oh4 oh4Var3 = oh4Var2;
                final oh4 oh4Var4 = oh4Var;
                yaVar.s(new oh4() { // from class: fm6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        int i;
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        u96 u96Var = (u96) yaVar2.u;
                        int iOrdinal = ((l89) yaVar2.t()).v.ordinal();
                        int i2 = (iOrdinal == 0 || iOrdinal == 1) ? R.drawable.placeholder_video_attachment : R.drawable.placeholder_image_attachment;
                        AppCompatImageView appCompatImageView = u96Var.d;
                        AppCompatImageView appCompatImageView2 = u96Var.b;
                        AppCompatImageView appCompatImageView3 = u96Var.e;
                        e85.b(appCompatImageView, ((l89) yaVar2.t()).y, i2, true);
                        u96Var.c.setVisibility((((l89) yaVar2.t()).v == u60.u || ((l89) yaVar2.t()).v == u60.t) ? 0 : 8);
                        appCompatImageView3.setVisibility(((l89) yaVar2.t()).E != z60.w ? 0 : 8);
                        appCompatImageView3.setImageResource(im6.a[((l89) yaVar2.t()).E.ordinal()] == 1 ? R.drawable.ic_uploading_retry : R.drawable.ic_uploading_cancel);
                        xgb.a(appCompatImageView3, new rm6(oh4Var3, yaVar2, null));
                        int iOrdinal2 = ((l89) yaVar2.t()).E.ordinal();
                        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                            i = R.drawable.ic_attachment_uploading;
                        } else {
                            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                                u.b();
                                return null;
                            }
                            i = R.drawable.ic_delete_media_attachment;
                        }
                        appCompatImageView2.setImageResource(i);
                        Object drawable = appCompatImageView2.getDrawable();
                        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                        if (animatable != null) {
                            animatable.start();
                        }
                        xgb.a(appCompatImageView2, new sm6(oh4Var4, yaVar2, null));
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, jm6.u));
    }
}
