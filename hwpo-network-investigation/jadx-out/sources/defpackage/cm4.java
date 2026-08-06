package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cm4 {
    public final gz9 a;
    public final Handler b;
    public final ArrayList c;
    public final lq8 d;
    public final qq0 e;
    public boolean f;
    public boolean g;
    public rp8<Bitmap> h;
    public a i;
    public boolean j;
    public a k;
    public Bitmap l;
    public dva<Bitmap> m;
    public a n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends qd2<Bitmap> {
        public final Handler w;
        public final int x;
        public final long y;
        public Bitmap z;

        public a(Handler handler, int i, long j) {
            this.w = handler;
            this.x = i;
            this.y = j;
        }

        @Override // defpackage.j9a
        public final void i(Object obj, yva yvaVar) {
            this.z = (Bitmap) obj;
            Handler handler = this.w;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.y);
        }

        @Override // defpackage.j9a
        public final void j(Drawable drawable) {
            this.z = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            cm4 cm4Var = cm4.this;
            if (i == 1) {
                cm4Var.b((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            cm4Var.d.l((a) message.obj);
            return false;
        }
    }

    public cm4(com.bumptech.glide.a aVar, gz9 gz9Var, int i, int i2, l2b l2bVar, Bitmap bitmap) {
        qq0 qq0Var = aVar.t;
        com.bumptech.glide.c cVar = aVar.v;
        lq8 lq8VarC = com.bumptech.glide.a.c(cVar.getBaseContext());
        lq8 lq8VarC2 = com.bumptech.glide.a.c(cVar.getBaseContext());
        lq8VarC2.getClass();
        rp8<Bitmap> rp8VarU = new rp8(lq8VarC2.t, lq8VarC2, Bitmap.class, lq8VarC2.u).a(lq8.D).a(((oq8) ((oq8) new oq8().d(k13.b).s()).o()).h(i, i2));
        this.c = new ArrayList();
        this.d = lq8VarC;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = qq0Var;
        this.b = handler;
        this.h = rp8VarU;
        this.a = gz9Var;
        c(l2bVar, bitmap);
    }

    public final void a() {
        int i;
        int i2;
        if (!this.f || this.g) {
            return;
        }
        a aVar = this.n;
        if (aVar != null) {
            this.n = null;
            b(aVar);
            return;
        }
        this.g = true;
        gz9 gz9Var = this.a;
        km4 km4Var = gz9Var.l;
        int i3 = km4Var.c;
        if (i3 <= 0 || (i2 = gz9Var.k) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((bm4) km4Var.e.get(i2)).i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        gz9Var.b();
        this.k = new a(this.b, gz9Var.k, jUptimeMillis);
        rp8<Bitmap> rp8VarZ = this.h.a((oq8) new oq8().n(new ke7(Double.valueOf(Math.random())))).z(gz9Var);
        rp8VarZ.x(this.k, rp8VarZ);
    }

    public final void b(a aVar) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.n = aVar;
            return;
        }
        if (aVar.z != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.d(bitmap);
                this.l = null;
            }
            a aVar2 = this.i;
            this.i = aVar;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(dva<Bitmap> dvaVar, Bitmap bitmap) {
        ov9.d(dvaVar, "Argument must not be null");
        this.m = dvaVar;
        ov9.d(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.a(new oq8().q(dvaVar, true));
        this.o = l6b.c(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
