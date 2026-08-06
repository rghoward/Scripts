package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n1a implements pt8<InputStream, Bitmap> {
    public final w43 a;
    public final o30 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements w43.b {
        public final bl8 a;
        public final en3 b;

        public a(bl8 bl8Var, en3 en3Var) {
            this.a = bl8Var;
            this.b = en3Var;
        }

        @Override // w43.b
        public final void a() {
            bl8 bl8Var = this.a;
            synchronized (bl8Var) {
                bl8Var.v = bl8Var.t.length;
            }
        }

        @Override // w43.b
        public final void b(qq0 qq0Var, Bitmap bitmap) throws IOException {
            IOException iOException = this.b.u;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                qq0Var.d(bitmap);
                throw iOException;
            }
        }
    }

    public n1a(w43 w43Var, o30 o30Var) {
        this.a = w43Var;
        this.b = o30Var;
    }

    @Override // defpackage.pt8
    public final kt8<Bitmap> a(InputStream inputStream, int i, int i2, xk7 xk7Var) {
        boolean z;
        bl8 bl8Var;
        en3 en3Var;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof bl8) {
            bl8Var = (bl8) inputStream2;
            z = false;
        } else {
            z = true;
            bl8Var = new bl8(inputStream2, this.b);
        }
        ArrayDeque arrayDeque = en3.v;
        synchronized (arrayDeque) {
            en3Var = (en3) arrayDeque.poll();
        }
        if (en3Var == null) {
            en3Var = new en3();
        }
        en3 en3Var2 = en3Var;
        en3Var2.t = bl8Var;
        ri6 ri6Var = new ri6(en3Var2);
        a aVar = new a(bl8Var, en3Var2);
        try {
            w43 w43Var = this.a;
            sq0 sq0VarA = w43Var.a(new i85.b(ri6Var, w43Var.d, w43Var.c), i, i2, xk7Var, aVar);
            en3Var2.u = null;
            en3Var2.t = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(en3Var2);
            }
            return sq0VarA;
        } finally {
            en3Var2.u = null;
            en3Var2.t = null;
            ArrayDeque arrayDeque2 = en3.v;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(en3Var2);
                if (z) {
                    bl8Var.k();
                }
            }
        }
    }

    @Override // defpackage.pt8
    public final boolean b(InputStream inputStream, xk7 xk7Var) {
        return true;
    }
}
