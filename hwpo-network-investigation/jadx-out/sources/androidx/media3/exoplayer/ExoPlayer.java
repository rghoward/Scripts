package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.exoplayer.image.ImageOutput;
import com.intercom.twig.BuildConfig;
import defpackage.a89;
import defpackage.bq6;
import defpackage.ds2;
import defpackage.h40;
import defpackage.l5a;
import defpackage.lo3;
import defpackage.mo3;
import defpackage.msa;
import defpackage.n6b;
import defpackage.po3;
import defpackage.q70;
import defpackage.qo3;
import defpackage.ro3;
import defpackage.s28;
import defpackage.u89;
import defpackage.vf1;
import defpackage.xl7;
import defpackage.z7a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends s28 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final int D;
        public static final boolean E;
        public boolean A;
        public final String B;
        public final boolean C;
        public final Context a;
        public final z7a b;
        public final mo3 c;
        public l5a<bq6.a> d;
        public l5a<msa> e;
        public final po3 f;
        public final qo3 g;
        public final ro3 h;
        public final Looper i;
        public final int j;
        public final q70 k;
        public final int l;
        public final boolean m;
        public final u89 n;
        public final a89 o;
        public final long p;
        public final long q;
        public final long r;
        public final ds2 s;
        public final long t;
        public final long u;
        public final int v;
        public final int w;
        public final int x;
        public final int y;
        public final boolean z;

        static {
            String str = n6b.a;
            String strF = h40.f(Build.DEVICE);
            D = (strF.contains("emulator") || strF.contains("emu64a") || strF.contains("emu64x") || strF.contains("generic")) ? 30000 : 10000;
            E = true;
        }

        public b(final Context context) {
            mo3 mo3Var = new mo3(context);
            l5a<bq6.a> l5aVar = new l5a() { // from class: no3
                @Override // defpackage.l5a
                public final Object get() {
                    cr2 cr2Var = new cr2();
                    cr2Var.v = new zt2();
                    cr2Var.u = true;
                    cr2Var.w = 3;
                    return new ms2(context, cr2Var);
                }
            };
            l5a<msa> l5aVar2 = new l5a() { // from class: oo3
                @Override // defpackage.l5a
                public final Object get() {
                    return new cv2(context);
                }
            };
            po3 po3Var = new po3();
            qo3 qo3Var = new qo3(context);
            ro3 ro3Var = new ro3();
            context.getClass();
            this.a = context;
            this.c = mo3Var;
            this.d = l5aVar;
            this.e = l5aVar2;
            this.f = po3Var;
            this.g = qo3Var;
            this.h = ro3Var;
            String str = n6b.a;
            Looper looperMyLooper = Looper.myLooper();
            this.i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.k = q70.b;
            this.l = 1;
            this.m = true;
            this.n = u89.d;
            this.p = 5000L;
            this.q = 15000L;
            this.r = 3000L;
            this.o = a89.b;
            this.s = new ds2(n6b.N(20L), n6b.N(500L));
            this.b = vf1.a;
            this.t = 500L;
            this.u = 2000L;
            this.v = 600000;
            boolean z = E;
            this.w = z ? D : Integer.MAX_VALUE;
            this.x = z ? 60000 : Integer.MAX_VALUE;
            this.y = 600000;
            this.z = true;
            this.B = BuildConfig.FLAVOR;
            this.j = -1000;
            if (Build.VERSION.SDK_INT >= 35) {
            }
            this.C = true;
        }

        public final d a() {
            xl7.r(!this.A);
            this.A = true;
            return new d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public static final c a = new c();
    }

    @Override // defpackage.s28
    /* JADX INFO: renamed from: E */
    lo3 f();

    void a();

    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        default void g() {
        }
    }
}
