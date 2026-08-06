package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import io.ably.lib.util.Crypto;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wib {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements pg7 {
        public final /* synthetic */ b t;
        public final /* synthetic */ c u;

        public a(b bVar, c cVar) {
            this.t = bVar;
            this.u = cVar;
        }

        @Override // defpackage.pg7
        public final umb b(View view, umb umbVar) {
            c cVar = new c();
            c cVar2 = this.u;
            cVar.a = cVar2.a;
            cVar.b = cVar2.b;
            cVar.c = cVar2.c;
            cVar.d = cVar2.d;
            return this.t.a(view, umbVar, cVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        umb a(View view, umb umbVar, c cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public int a;
        public int b;
        public int c;
        public int d;
    }

    public static void a(View view, b bVar) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        c cVar = new c();
        cVar.a = paddingStart;
        cVar.b = paddingTop;
        cVar.c = paddingEnd;
        cVar.d = paddingBottom;
        a aVar = new a(bVar, cVar);
        WeakHashMap<View, fib> weakHashMap = egb.a;
        egb.d.c(view, aVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new xib());
        }
    }

    public static float b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case h4c.e /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
